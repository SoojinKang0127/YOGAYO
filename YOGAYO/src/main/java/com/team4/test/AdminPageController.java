package com.team4.test;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.user.dao.UserServiceImpl;
import com.team4.vo.UserVo;

@Controller
public class AdminPageController {

	
	
	@RequestMapping(value = "/admin/member", method = RequestMethod.GET)
	public String home(Model model) throws Exception {
		
		
		
		UserServiceImpl service = new UserServiceImpl();
		List<UserVo> list = service.selectAllUser();
		
		model.addAttribute("userList", list);
		
		return "/admin/admin-member";
	};
	
	
	
}
