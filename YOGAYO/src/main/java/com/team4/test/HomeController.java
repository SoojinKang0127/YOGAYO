package com.team4.test;


import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.util.UserAuthCheck;
import com.team4.vo.UserVo;




@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	};
	
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Model model, HttpServletRequest req,HttpServletResponse res) {
		UserAuthCheck.loginCheck(req, res, model);
		return "main";
	}
	
	
//	
//	@RequestMapping(value = "/course-page", method = RequestMethod.GET)
//	public String couesePage(Model model) {
//		return "course-page";
//	}
//	
//
//	
//	@RequestMapping(value = "/course-detail", method = RequestMethod.GET)
//	public String coueseDetail(Model model) {
//
//		return "course-detail";
//	}
//	
//	@RequestMapping(value = "/course-page", method = RequestMethod.GET)
//	public String couesePage(Model model) {
//		
//		
//		
//		return "course-page";
//	}
//	
//	
	
	
	
//	
//	@RequestMapping(value = "/course-detail", method = RequestMethod.GET)
//	public String coueseDetail(Model model) {
//
//		return "course-detail";
//	}
	
	
	
	

	
	
	

	
	
	

}
