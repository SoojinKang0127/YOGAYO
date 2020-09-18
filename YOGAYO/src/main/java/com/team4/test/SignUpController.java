package com.team4.test;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.team4.dao.admin.AdminServiceImpl;
import com.team4.resource.R;
import com.team4.resource.Rcontroller;
import com.team4.user.dao.UserDAO;
import com.team4.user.dao.UserDAOImpl;
import com.team4.user.dao.UserServiceImpl;
import com.team4.vo.UserVo;

@Controller
public class SignUpController implements R {

	UserServiceImpl service = new UserServiceImpl();
	UserDAO dao = new UserDAOImpl();

	@RequestMapping(value = "/sign-up", method = RequestMethod.GET)
	public String signUp(Locale locale, Model model,HttpServletRequest req) {
	Rcontroller rc= new Rcontroller();
	Object[] keyword = rc.getKeywordList().toArray();
	req.setAttribute("length",rc.getKeywordList().size());
	req.setAttribute("keyword", keyword);
		return "sign-up";
	}

	
// 프로필 사진 추가하기 전 버전	
//	@RequestMapping(value = "/sign-up", method = RequestMethod.POST)
//	public String signUp1(Model model, @RequestParam("id") String id, @RequestParam("name") String name,
//			@RequestParam("bDate") Date date, @RequestParam("pwd") String pwd, @RequestParam("gender") char gender,@RequestParam("keyword")String keyword,
//			@RequestParam("profiLevel") int profiLevel) {
//		
//		
//		String[] keywordArr=keyword.split(",");
//		UserVo vo = new UserVo();
//		vo.setId(id);
//		vo.setName(name);
//		vo.setPwd(pwd);
//		vo.setbDate(date);
//		vo.setGender(gender);
//		vo.setProfiLevel(profiLevel);
//
//		try {
//			service.signUp(vo);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		int i=service.getUNum(vo);
//		List<String> mongoList= new ArrayList<String>();
//		for(String s:keywordArr) {
//			mongoList.add(s);
//		}
//		MongoCollection<Document> collection = mongoDBi.getCollection("USER");
//		Document doc= new Document("_id",i).append("keyword", mongoList  );
//        collection.insertOne(doc);
//		
//		String errMessage = "가입을 축하합니다. 로그인을 해주세요!";
//		model.addAttribute("errMessage", errMessage);
//		return "login";
//	}

	@RequestMapping(value = "/checkDuplication", method = RequestMethod.POST)
	public void checkDuplication(Locale locale, Model model, HttpServletResponse res,
			@RequestParam("email") String email) {

		// pose로 db를 셀렉해오는 dao를 만들어서 그 값들을 json형태로 바꾼다음에 res통해 view로 전달

		System.out.println(email);
		UserVo vo = new UserVo();
		vo.setId(email);
		UserVo result = null;

		try {
			result = service.checkDuplication(vo);
			System.out.println(result);

		} catch (Exception e1) {
			System.out.println("에러 발생");
			e1.printStackTrace();

		}

		if (result == null) {
			try {
				res.getWriter().write("1");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				res.getWriter().write("0");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	
	// 프로필 사진 추가 버전
	@RequestMapping(value = "/sign-up", method = RequestMethod.POST)
	public String signUp2(MultipartHttpServletRequest multi, Model model) {
		
		AdminServiceImpl service = new AdminServiceImpl();
		UserServiceImpl uService = new UserServiceImpl();
		
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Date bDate = null;
		
		String id = multi.getParameter("id");
		String name = multi.getParameter("name");
		try {
			bDate = (Date) transFormat.parse(multi.getParameter("bDate"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String pwd = multi.getParameter("pwd");
		char gender = (multi.getParameter("gender")).charAt(0);
		int profiLevel = Integer.parseInt(multi.getParameter("profiLevel"));
		String[] keywordArr = multi.getParameter("keyword").split(",");
		
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("bDate : " + bDate);
		System.out.println("pwd : " + pwd);
		System.out.println("gender : " + gender);
		System.out.println("profiLevel : " + profiLevel);
		
		//////////////////////////////////////////////////////////////////////
		
		MultipartFile mf = multi.getFile("profile");
		String originalFileName = mf.getOriginalFilename();
		String fileType = originalFileName.substring(originalFileName.lastIndexOf('.'), originalFileName.length());
		
		String realPath = multi.getRealPath("/");
		String curUserPath = realPath.substring(0, realPath.indexOf(".metadata"));
		curUserPath = curUserPath.replace('\\', '/');
		String path = null;
		if (curUserPath.indexOf("YOGAYO") == -1) {
			path = curUserPath + "YOGAYO/YOGAYO/src/main/webapp/resources/image/profile/";
		} else {

			path = curUserPath + "YOGAYO/src/main/webapp/resources/image/profile/";
		}
		String projectPath = "resources/image/profile/";
		
		int no = 0;
		try {
			no = service.getLastUnum() + 1;
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String safeFile = path + "user" + Integer.toString(no) + fileType;
		String prjPathandName = projectPath + "user" + Integer.toString(no) + fileType;

		try {
			mf.transferTo(new File(safeFile));
			System.out.println("성공! 프로필 파일 들어감");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERR! 프로필 안 들어감");
		}
		
		
		////////////////////////////////////////////////////////////////
		
		java.sql.Date sqlDate = new java.sql.Date(bDate.getTime());
		
		
		UserVo vo = new UserVo();
		vo.setId(id);
		vo.setName(name);
		vo.setPwd(pwd);
		vo.setbDate(sqlDate);
		vo.setGender(gender);
		vo.setProfiLevel(profiLevel);
		vo.setImg(prjPathandName);
		
		try {
			uService.signUp(vo);
			System.out.println("성공! 회원가입완료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERR! 회원가입 실패!");
		}
		
		int i=uService.getUNum(vo);
		List<String> mongoList= new ArrayList<String>();
		for(String s:keywordArr) {
			mongoList.add(s);
		}
		MongoCollection<Document> collection = mongoDBi.getCollection("USER");
		Document doc= new Document("_id",i).append("keyword", mongoList);
        collection.insertOne(doc);
		
		String errMessage = "가입을 축하합니다. 로그인을 해주세요!";
		model.addAttribute("errMessage", errMessage);
		
		return "login";
	}

}
