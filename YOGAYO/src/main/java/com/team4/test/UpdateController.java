package com.team4.test;



import java.sql.Date;

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
import com.team4.vo.UserVo;

@Controller
public class UpdateController {
	
	UserServiceImpl service = new UserServiceImpl();
	UserDAO dao = new UserDAOImpl();
	
	@RequestMapping(value="/update", method = RequestMethod.GET)
	public String update() {
		
		return "update";
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String update(Model model, HttpServletRequest req,
		@RequestParam(value="userName", defaultValue = "name"
		, required = false)String name,
		@RequestParam(value="userBirthDay", defaultValue = "bDate"
				, required = false)Date date,
		@RequestParam(value="password1", defaultValue = "pwd"
				, required = false)String pwd,
		@RequestParam(value="gender", defaultValue = "gender"
				, required = false)char gender
		) {
		HttpSession session = req.getSession();
		UserVo user = (UserVo)session.getValue("user");
		String id = user.getId();
		
//		String name = req.getParameter("userName");
//		Date date = (String)req.getParameter("userBirthDay");
//		String pwd = req.getParameter("password1");
//		String gender = req.getParameter("gender");
		
		System.out.println(name);
		System.out.println(date);
		System.out.println(pwd);
		System.out.println(gender);
		System.out.println(id);

		
		UserVo vo = new UserVo();
		vo.setName(name);
		vo.setbDate(date);
		vo.setPwd(pwd);
		vo.setGender(gender);
		vo.setId(id);
		try {
			service.update(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "update";
	}

}
