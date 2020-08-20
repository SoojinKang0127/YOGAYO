package com.team4.test;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team4.dao.UserServiceImpl;
import com.team4.vo.UserVo;

@Controller
public class LoginController {
	
	
	UserServiceImpl service = new UserServiceImpl();
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(UserVo vo, HttpServletRequest req, RedirectAttributes rttr ) throws Exception{
			
		HttpSession session = req.getSession();
		
		UserVo login = service.login(vo);
		
		
		if(login == null) {
			session.setAttribute("user", null);
			rttr.addFlashAttribute("mag", false);
			System.out.println("로그인정보찾을수없음");
			return "redirect:/";
		}else {
			session.setAttribute("user", login);
			System.out.println("로그인 됨");
		}
		return "redirect:/main";
	}
	
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpSession session)throws Exception{
		session.invalidate();
		return "redirect:/";
	}
	
	
	
	

}
