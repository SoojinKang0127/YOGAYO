package com.team4.test;


import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team4.user.dao.UserServiceImpl;
import com.team4.util.UserAuthCheck;
import com.team4.dao.course.CourseDAOImpl;
import com.team4.dao.course.CourseServiceImpl;
import com.team4.vo.CourseVo;
import com.team4.vo.UserVo;

@Controller
public class LoginController {
	

	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model,HttpServletRequest req,HttpServletResponse res) {
		UserAuthCheck.sendToMainView(req, res, model);
		return "login";
	};
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(CourseVo cvo,UserVo vo, HttpServletRequest req, RedirectAttributes rttr, Model model ) throws Exception{
		UserServiceImpl service = new UserServiceImpl();
		CourseServiceImpl cService = new CourseServiceImpl();
		
		HttpSession session = req.getSession();	
		UserVo login = service.login(vo);
		
		List<CourseVo> courses = cService.selectAll(0);
		
		if(login == null) {
			session.setAttribute("user", null);
			rttr.addFlashAttribute("mag", false);
			System.out.println("로그인 정보 찾을 수 없음");
			
			String errMessage = "회원 정보를 찾을 수 없습니다.";
			model.addAttribute("errMessage", errMessage);
			return "login";
		}else {
			
			session.setAttribute("user", login);
			session.setAttribute("allCourses", courses);
			System.out.println("로그인 됨");
		}
		return "redirect:/main";
	}
	
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpSession session)throws Exception{
		session.invalidate();
		return "redirect:/main";
	}
	
	

}
