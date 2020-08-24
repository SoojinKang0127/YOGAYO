package com.team4.test;

import java.sql.Date;
import java.util.List;
import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.dao.UserDAO;
import com.team4.dao.UserDAOImpl;
import com.team4.dao.UserServiceImpl;
import com.team4.vo.UserVo;

@Controller
public class SignUpController {
	
	UserServiceImpl service = new UserServiceImpl();
	UserDAO dao = new UserDAOImpl();
	
	@RequestMapping(value = "/sign-up", method = RequestMethod.GET)
	public String signUp(Locale locale, Model model) {
		List<String> list = null;
		try {
			list = dao.selectAllId();
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("idList", list);
		return "sign-up";
	}
	
	
	@RequestMapping(value = "/sign-up", method = RequestMethod.POST)
	public String signUp1(Model model, 
			@RequestParam("id")String id,
			@RequestParam("name")String name,
			@RequestParam("bDate")Date date,
			@RequestParam("pwd")String pwd,
			@RequestParam("gender")char gender) {

		
		UserVo vo= new UserVo();
		vo.setId(id);
		vo.setName(name);
		vo.setPwd(pwd);
		vo.setbDate(date);
		vo.setGender(gender);
		
			
		try {
			service.signUp(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String errMessage = "가입을 축하합니다. 로그인을 해주세요!";
		model.addAttribute("errMessage", errMessage);
		return "login";
	}
	
}
