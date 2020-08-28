package com.team4.test;


import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	};
	
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Model model, HttpServletRequest req) {
		
		HttpSession session = req.getSession();	
		
		Object user = session.getAttribute("user");
		if(user == null) {
			String errMessage = "로그인 후 이용이 가능합니다.";
			model.addAttribute("errMessage", errMessage);
			return "login";
		}
		return "main";
	}
	
	
	
	@RequestMapping(value = "/course-page", method = RequestMethod.GET)
	public String couesePage(Model model) {
		return "course-page";
	}
	

	
	@RequestMapping(value = "/course-detail", method = RequestMethod.GET)
	public String coueseDetail(Model model) {

		return "course-detail";
	}

	
	@RequestMapping(value = "/pose", method = RequestMethod.GET)
	public String pose(Model model) {

		return "dictionary-detail";
	}
	

	
	
	
	

}
