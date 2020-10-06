package com.team4.test;

import java.io.IOException;
import java.util.ArrayList;
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

import com.team4.dao.course.CourseServiceImpl;
import com.team4.util.CosineSimilarity;
import com.team4.util.UserAuthCheck;
import com.team4.vo.CourseVo;
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
	
	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public void cos(Model model, HttpServletRequest req,HttpServletResponse res) {
		UserAuthCheck.loginCheck(req, res, model);
		CourseServiceImpl cservice= new CourseServiceImpl();
		UserVo vo= (UserVo)req.getSession().getValue("user");
		ArrayList<Integer> recommendation= CosineSimilarity.calc(vo);
		String crsRec="{";
		int k=0;
		for(int crsNum:recommendation) {
			try {
				CourseVo cvo=cservice.selectCourseByCrsNum(crsNum);
				crsRec+="\""+k+"\":"+cvo.toString2()+",";
				k++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		crsRec+="}";
		try {
			res.getWriter().write(crsRec);
		} catch (IOException e) {
			e.printStackTrace();
		};
	}


}
