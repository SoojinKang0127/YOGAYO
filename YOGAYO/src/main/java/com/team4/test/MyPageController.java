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
		
		int tWeight =0;
		int	lWeight =0;
		try {
			tWeight = service.tWeight();
			lWeight = service.lWeight();
		} catch (Exception e) {
			System.out.println("[MyPageController / myPage]" + e.toString());
			e.printStackTrace();
		}

		
		model.addAttribute("tWeight", tWeight);
		model.addAttribute("lWeight", lWeight);

		
		return "mypage";
	}
	
	@RequestMapping(value="/myPage", method = RequestMethod.POST)
	public String myPage(Model model, HttpServletRequest req) {
		HttpSession session = req.getSession();
		
		
		return "mypage";
		
	}

}
