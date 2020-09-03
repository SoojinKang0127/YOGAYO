package com.team4.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.dao.feed.FeedServiceImpl;
import com.team4.vo.FeedVo;
import com.team4.vo.UserVo;



@Controller
public class PlayerController {
	
	
	
	
	
	@RequestMapping(value = "/player", method = RequestMethod.GET)
	public String player(HttpServletRequest req) {
		
		//session에 저장된 user라는 오브젝트에 접근할 수 있다 
//		HttpSession session = req.getSession();
//		UserVo user = (UserVo)session.getValue("user");
//		System.out.println(user.getuNum());		
		
		System.out.println(req.getParameter("course"));
		
		return "player";
	}
	
	
	@RequestMapping(value = "/feed", method = RequestMethod.POST)
	public String review(HttpServletRequest req,
			@RequestParam("course")int crsNum,
			@RequestParam("slevel")int sLevel,
			@RequestParam("dlevel")int dLevel,
			@RequestParam("context")String context,
			@RequestParam("weight")int weight){
		
		FeedVo vo = new FeedVo();
		FeedServiceImpl service = new FeedServiceImpl();

		HttpSession session = req.getSession();
		UserVo user = (UserVo)session.getValue("user");
		int uNum = user.getuNum();
		
		vo.setuNum(uNum);
		vo.setCrsNum(crsNum);
		vo.setsLevel(sLevel);
		vo.setdLevel(dLevel);
		vo.setContext(context);
		vo.setWeight(weight);
	
		try {
			service.upload(vo);
			System.out.println("피드 들어감");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 System.out.println("피드 안 들어감");
		}
		
		return "main";
	}
	
	

}
