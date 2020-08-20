package com.team4.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.swing.text.View;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.team4.dao.Dao;
import com.team4.vo.Vo;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	};
	
	
	@RequestMapping(value = "/sign-up", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		
		return "sign-up";
	}
	
	
	@RequestMapping(value = "/main-x", method = RequestMethod.GET)
	public String mainX(Model model) {
		
		
		
		
		
		
		
		return "main_X";
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Model model) {
		
		
		String name = "전예슬";
		
		model.addAttribute("name", name);
		
		
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
	
	



}
