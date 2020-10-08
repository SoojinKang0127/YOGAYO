package com.team4.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bson.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mongodb.client.MongoCollection;
import com.team4.dao.course.CourseDAO;
import com.team4.dao.course.CourseDAOImpl;
import com.team4.dao.course.CourseServiceImpl;
import com.team4.resource.R;
import com.team4.util.UserAuthCheck;
import com.team4.vo.CourseVo;
import com.team4.vo.UserVo;

@Controller
public class MkCourseController implements R {

	CourseServiceImpl service = new CourseServiceImpl();
	CourseDAO dao = new CourseDAOImpl();
	CourseVo vo = new CourseVo();

	@RequestMapping(value = "/mkcourse", method = RequestMethod.POST)
	public String mkcourse(MultipartHttpServletRequest multi, HttpServletRequest req,Model model,HttpServletResponse res) throws Exception {
		UserAuthCheck.loginCheck(req, res, model);
		HttpSession session = req.getSession();
		UserVo user = (UserVo) session.getValue("user");
		int uNum = user.getuNum();

			
		String title = multi.getParameter("title");
		String dscrt = multi.getParameter("dscrt");
		String material = multi.getParameter("material");

		
		//course addition to DB
		try {
			int seq1 = Integer.parseInt(multi.getParameter("seq1"));
			vo.setSeq1(seq1);
			int seq2 = Integer.parseInt(multi.getParameter("seq2"));
			vo.setSeq2(seq2);
			int seq3 = Integer.parseInt(multi.getParameter("seq3"));
			vo.setSeq3(seq3);
			int seq4 = Integer.parseInt(multi.getParameter("seq4"));
			vo.setSeq4(seq4);
			int seq5 = Integer.parseInt(multi.getParameter("seq5"));
			vo.setSeq5(seq5);
			int seq6 = Integer.parseInt(multi.getParameter("seq6"));
			vo.setSeq6(seq6);
			int seq7 = Integer.parseInt(multi.getParameter("seq7"));
			vo.setSeq7(seq7);
			int seq8 = Integer.parseInt(multi.getParameter("seq8"));
			vo.setSeq8(seq8);
		} catch (NumberFormatException e) {
			System.out.println("did't take some elements");
		}

		String keyword = multi.getParameter("keywordBox");
		String[] keywordList = keyword.split(",");
		ArrayList<String> keywordarray = new ArrayList<String>();
		for (String s : keywordList) {
			s = s.trim();
			keywordarray.add(s);

		}

//			file input & save

			MultipartFile mf = multi.getFile("coursethumbnail");
			String originalFileName = mf.getOriginalFilename();
			String fileType = originalFileName.substring(originalFileName.lastIndexOf('.'), originalFileName.length());
			String path = null;
			
			String projectPath = "resources/image/coursethumbnail/";
			path="/var/lib/tomcat8/webapps/YOGAYO/resources/image/coursethumbnail/";
			int no = 0;
			try {
				no = service.getLastCnum() + 1;
				System.out.println("picture no" + no);
			} catch (Exception e1) {
				e1.printStackTrace();
				System.out.println("err" + e1);
			}

			String safeFile = path + "coursethumbnail" + Integer.toString(no) + fileType;
			String prjPathandName = projectPath + "coursethumbnail" + Integer.toString(no) + fileType;

			try {
				vo.setImgPath(prjPathandName);
				mf.transferTo(new File(safeFile));
				System.out.println("파일 들어감");
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("오류! 파일 안 들어감");
			}
		vo.setuNum(uNum);
		vo.setTitle(title);
		vo.setDscrt(dscrt);
		vo.setMaterial(material);
		try {
			service.makeCourse(vo);
			System.out.println("succeed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("set the elements err");
			e.printStackTrace();
		}
		int id = 0;
		id = service.getLastCnum();

		System.out.println("id: " + (id));

		//append keyword to mongoDB

		MongoCollection<Document> collection = mongoDBi.getCollection("COURSE");
		Document doc = new Document("_id", id).append("keyword", keywordarray);

		collection.insertOne(doc);
		return "redirect:/myPage";
	}

}