package com.team4.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.user.dao.UserDAO;
import com.team4.user.dao.UserDAOImpl;
import com.team4.user.dao.UserServiceImpl;

@Controller
public class MyPageController {
	
	UserServiceImpl service = new UserServiceImpl();
	UserDAO dao = new UserDAOImpl();
	
	@RequestMapping(value="/myPage", method = RequestMethod.GET)
	public String myPage(Model model)
			 {
		
		int weight =0 ;
		try {
			weight = service.myPage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		model.addAttribute("banana", weight);
		System.out.println(weight);
		System.out.println("hi");
		
		return "mypage";
	}
	
	@RequestMapping(value="/myPage", method = RequestMethod.POST)
	public String myPage(Model model, HttpServletRequest req,
			@RequestParam(value="userId", defaultValue = "name",
			required = false)String name
			
	) {
		HttpSession session = req.getSession();
		
		return "mypage";
		
	}

}
