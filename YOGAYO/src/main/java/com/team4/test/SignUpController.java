package com.team4.test;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.dao.UserDAO;
import com.team4.dao.UserDAOImpl;
import com.team4.vo.UserVo;

@Controller
public class SignUpController {

	@Autowired(required=true) 
	private HttpServletRequest request;


	
	@RequestMapping(value = "/sign-up", method = RequestMethod.GET)
	public String signUp(Locale locale, Model model) {
		
		
		return "sign-up";
	}
	
	@RequestMapping(value = "/sign-up", method = RequestMethod.POST)
	public String signUp1( Locale locale, Model model, @RequestParam("id")String id) {
		System.out.println("sdf");
		UserVo vo= new UserVo();
		UserDAO userdaoimplDao = new UserDAOImpl();
		request.getAttribute("id");
		request.getAttribute("name");
		request.getAttribute("bDate");
		request.getAttribute("id");
		request.getAttribute("id");
		System.out.println(id);
		
		
		
		return "sign-up";
	}
	
}
