package com.team4.test;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team4.dao.course.CourseDAO;
import com.team4.dao.course.CourseDAOImpl;
import com.team4.dao.course.CourseServiceImpl;
import com.team4.vo.CourseVo;
import com.team4.vo.UserVo;

@Controller
public class MkCourseController {

	
	CourseServiceImpl service = new CourseServiceImpl();
	CourseDAO dao = new CourseDAOImpl();

	
	
	

		@RequestMapping(value="/mkcourse", method= RequestMethod.POST)
		public String mkcourse(MultipartHttpServletRequest multi, HttpServletRequest req)  {
			
			
			HttpSession session = req.getSession();
			UserVo user = (UserVo)session.getValue("user");
			int uNum = user.getuNum();
			
			String title = multi.getParameter("title");
			String dscrt = multi.getParameter("dscrt");
			String material = multi.getParameter("material");
			
			System.out.println((multi.getParameter("seq1")));
			
			int seq1 = Integer.parseInt(multi.getParameter("seq1")); 
			int seq2 = Integer.parseInt(multi.getParameter("seq2"));
			int seq3 = Integer.parseInt(multi.getParameter("seq3"));
			int seq4 = Integer.parseInt(multi.getParameter("seq4"));
			int seq5 = Integer.parseInt(multi.getParameter("seq5"));
			int seq6 = Integer.parseInt(multi.getParameter("seq6"));
			int seq7 = Integer.parseInt(multi.getParameter("seq7"));
			int seq8 = Integer.parseInt(multi.getParameter("seq8"));
			
			System.out.println(seq1);
			System.out.println(seq2);
			System.out.println(seq3);
			System.out.println(seq4);
			System.out.println(seq5);
			System.out.println(seq6);
			
			
			MultipartFile mf = multi.getFile("coursethumbnail");
			
			String originalFileName = mf.getOriginalFilename();
			String fileType=originalFileName.substring(originalFileName.lastIndexOf('.'), originalFileName.length());
			
			
			String realPath = multi.getRealPath("/");
			String curUserPath=realPath.substring(0, realPath.indexOf(".metadata"));
			curUserPath=curUserPath.replace('\\', '/');
			String path=null;
		      if(curUserPath.indexOf("YOGAYO")==-1) {
		         path= curUserPath+"YOGAYO/YOGAYO/src/main/webapp/resources/image/coursethumbnail/";
		      }else {
		         
		          path = curUserPath + "YOGAYO/src/main/webapp/resources/image/coursethumbnail/";
		      }
			String projectPath = "resources/image/coursethumbnail/";
			
			int no=0;
			try {
				no = service.getLastCnum() + 1;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			String safeFile = path + "coursethumbnail"+Integer.toString(no)+fileType;
			String prjPathandName = projectPath + "coursethumbnail"+Integer.toString(no)+fileType;
			
			
			
			try {
				mf.transferTo(new File(safeFile));
				System.out.println("파일 들어감");
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("오류! 파일 안 들어감");
			}

			
			
			CourseVo vo = new CourseVo();
			
			vo.setuNum(uNum);
			vo.setTitle(title);
			vo.setDscrt(dscrt);
			vo.setImgPath(prjPathandName);
			vo.setMaterial(material);
			vo.setSeq1(seq1);
			vo.setSeq2(seq2);
			vo.setSeq3(seq3);
			vo.setSeq4(seq4);
			vo.setSeq5(seq5);
			vo.setSeq6(seq6);
			vo.setSeq7(seq7);
			vo.setSeq8(seq8);
			
			try {
				service.makeCourse(vo);
				System.out.println("들어감");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("잘안들어감 오류");
				e.printStackTrace();
			}

			return "mypage";
		}
		

}