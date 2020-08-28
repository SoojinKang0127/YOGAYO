package com.team4.test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;

import com.team4.dao.feed.FeedServiceImpl;
import com.team4.vo.FeedVo;
import com.team4.vo.UserVo;



@Controller
public class PlayerController {
	
	FeedVo vo = new FeedVo();
	FeedServiceImpl service = new FeedServiceImpl();
	
	
	@RequestMapping(value = "/player", method = RequestMethod.GET)
	public String player(HttpServletRequest req) {
		
		//session에 저장된 user라는 오브젝트에 접근할 수 있다 
//		HttpSession session = req.getSession();
//		UserVo user = (UserVo)session.getValue("user");
//		System.out.println(user.getuNum());		
		
		System.out.println(req.getParameter("course"));
		
		return "player";
	}
	
	
	

	
	@RequestMapping(value = "/feedupload", method = RequestMethod.POST)
	public String feedupload(MultipartHttpServletRequest multi, HttpServletRequest req) {
		
		
//		HttpSession session = req.getSession();
//		UserVo user = (UserVo)session.getValue("user");
//		int uNum = user.getuNum();
		
		
//		int  course = Integer.parseInt(multi.getParameter("course"));
//		int slevel = Integer.parseInt(multi.getParameter("slevel"));
//		int  dlevel = Integer.parseInt(multi.getParameter("dlevel"));
//		String context = multi.getParameter("context");
//		int  weight = Integer.parseInt(multi.getParameter("weight"));
		
		MultipartFile mf = multi.getFile("file");
		String originalFileName = mf.getOriginalFilename();
		long fileSize = mf.getSize();
		
		String fileType=originalFileName.substring(originalFileName.lastIndexOf('.'), originalFileName.length());
		System.out.println(fileType);
		System.out.println(multi.getRealPath("/"));
		
		//Users/soo/Documents/YOGAYO/YOGAYO/YOGAYO/src/main/webapp/resources/image/feedimages
		//String testPath="C://Users/kosmo//document//github//yogayo/yogayo/.metadat////"
		String realPath = "/Users/soo/Documents/YOGAYO/YOGAYO/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/YOGAYO/";
		String curUserPath=realPath.substring(0, realPath.indexOf(".metadata"));
		System.out.println(curUserPath);
		String path = curUserPath +"YOGAYO/src/main/webapp/resources/image/feedimages/";
		System.out.println(path);
		int no=0;
		try {
			 no= service.getLastFnum()+1;
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String safeFile = path + "feed"+Integer.toString(no)+fileType;
		
//		vo.setuNum(uNum);
//		vo.setCrsNum(course);
//		vo.setsLevel(slevel);
//		vo.setdLevel(dlevel);
//		vo.setContext(context);
//		vo.setWeight(weight);
//		vo.setuImg1(safeFile);
//		
//		
		
		String message = "";
		
		try {
			mf.transferTo(new File(safeFile));
			message = "파일 업로드 성공";
		} catch (IllegalStateException e) {
			e.printStackTrace();
			message = "오류";
		} catch (IOException e) {
			e.printStackTrace();
			message = "오류";
		}
		
		
		
		
		
		
//		try {
//			service.upload(vo);
//			System.out.println("피드 들어감");
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("오류! 피드 안 들어감");
//		}
		

		

		
		return "test";
	}
	
	
	
	
	
	@RequestMapping(value = "/feeduploads", method = RequestMethod.POST)
	public String review(MultipartHttpServletRequest request,
			@RequestParam(value="course", defaultValue = "name"
					, required = false) String crsNum,
			@RequestParam(value="slevel", defaultValue = "name"
					, required = false) String sLevel,
			@RequestParam(value="dlevel", defaultValue = "name"
					, required = false) String dLevel,
			@RequestParam(value="context", defaultValue = "name"
					, required = false) String context,
			@RequestParam(value="weight", defaultValue = ""
					, required = false) String weight){
		
		System.out.println(request.getParameter("course"));
		
		
			
	
			
		

		
//		System.out.println(crsNum);
//		System.out.println(sLevel);
//		System.out.println(dLevel);
//		System.out.println(context);
//		System.out.println(weight);
		
//		FeedVo vo = new FeedVo();
//		FeedServiceImpl service = new FeedServiceImpl();
//
//		HttpSession session = req.getSession();
//		UserVo user = (UserVo)session.getValue("user");
//		int uNum = user.getuNum();
//		
//		vo.setuNum(uNum);
//		vo.setCrsNum(crsNum);
//		vo.setsLevel(sLevel);
//		vo.setdLevel(dLevel);
//		vo.setContext(context);
//		vo.setWeight(weight);
//	
//		try {
//			service.upload(vo);
//			System.out.println("피드 들어감");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			 System.out.println("피드 안 들어감");
//		}
		
		return "main";
	}
	
	

}
