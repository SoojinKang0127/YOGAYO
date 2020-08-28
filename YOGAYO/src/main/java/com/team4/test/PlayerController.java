package com.team4.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;

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
	
	
	
	@RequestMapping(value = "/feeds", method = RequestMethod.POST)
	public String test(HttpServletRequest req) {
		req.getParameter("course");
		System.out.println("페이지에 들어온 값" + req.getParameter("course"));
		
		return "test";
	}
	
	
	@RequestMapping(value = "/feed", method = RequestMethod.POST)
	public String review(MultipartHttpServletRequest request,
			@RequestParam(value="course", defaultValue = "name"
					, required = false) String crsNum,
			@RequestParam(value="slevel", defaultValue = "name"
					, required = false) String sLevel,
			@RequestParam(value="dlevel", defaultValue = "name"
					, required = false) String dLevel,
			@RequestParam(value="context", defaultValue = "name"
					, required = false) String context,
			@RequestParam(value="weight", defaultValue = ""
					, required = false) String weight){
		
		System.out.println(request.getParameter("course"));
		
		
			
	
			
		

		
//		System.out.println(crsNum);
//		System.out.println(sLevel);
//		System.out.println(dLevel);
//		System.out.println(context);
//		System.out.println(weight);
		
//		FeedVo vo = new FeedVo();
//		FeedServiceImpl service = new FeedServiceImpl();
//
//		HttpSession session = req.getSession();
//		UserVo user = (UserVo)session.getValue("user");
//		int uNum = user.getuNum();
//		
//		vo.setuNum(uNum);
//		vo.setCrsNum(crsNum);
//		vo.setsLevel(sLevel);
//		vo.setdLevel(dLevel);
//		vo.setContext(context);
//		vo.setWeight(weight);
//	
//		try {
//			service.upload(vo);
//			System.out.println("피드 들어감");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			 System.out.println("피드 안 들어감");
//		}
		
		return "main";
	}
	
	

}
