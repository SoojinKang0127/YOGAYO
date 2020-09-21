package com.team4.test;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.cj.xdevapi.JsonArray;
import com.team4.user.dao.UserDAO;
import com.team4.user.dao.UserDAOImpl;
import com.team4.user.dao.UserService;
import com.team4.user.dao.UserServiceImpl;
import com.team4.util.UserAuthCheck;
import com.team4.vo.CourseVo;
import com.team4.vo.FeedVo;
import com.team4.vo.UserVo;

@Controller
public class MyPageController {
	
	
	@RequestMapping(value="/myPage", method = RequestMethod.GET)
	public String myPage(Model model,HttpServletRequest req, HttpServletResponse res) 
			 {
		UserAuthCheck.loginCheck(req, res, model);
		model.addAttribute("user",(UserVo)req.getSession().getAttribute("user"));
		UserServiceImpl service = new UserServiceImpl();
		UserVo vo = new UserVo();
		HttpSession session = req.getSession();
		UserVo user = (UserVo)session.getValue("user");
		int uNum = user.getuNum();
		
		vo.setuNum(uNum);
		
		System.out.println(uNum);
		
		List<CourseVo> crsList = null;
		List<FeedVo> feList = null;
		List<CourseVo> likeList = null;

		int cWeight =0;
		int tWeight1 =0;
		int tWeight2 =0;
		int	lWeight =0;
		int count1week = 0;
		int count2week = 0;
		int count3week = 0;
		int count4week = 0;
		int count1week2 = 0;
		int count2week2 = 0;
		int count3week2 = 0;
		int count4week2 = 0;
		int thisdate = 0;
		String thismonth = "";
		String thisday ="";
	
		try {
			cWeight = service.cWeight(vo);
			tWeight1 = service.tWeight1(vo);
			tWeight2 = service.tWeight2(vo);
			lWeight = service.lWeight(vo);
			count1week = service.count1week(vo);
			count2week = service.count2week(vo);
			count3week = service.count3week(vo);
			count4week = service.count4week(vo);
			count1week2 = service.count1week2(vo);
			count2week2 = service.count2week2(vo);
			count3week2 = service.count3week2(vo);
			count4week2 = service.count4week2(vo);
			crsList = service.selectAllCrs(vo);
			feList = service.selectAll(vo);
			thisday = service.thisday();
			thisdate = service.thisdate();
			thismonth = service.thismonth();
			likeList = service.allLikey(vo);
			
			System.out.println("crsList: " + crsList);
			System.out.println("feList" + feList);
			System.out.println("likeList" + likeList);
						
	
		} catch (Exception e) {
			System.out.println("[MyPageController / myPage]" + e.toString());
			e.printStackTrace();
		}
		
		int tWeight = tWeight1 - tWeight2;

		model.addAttribute("cWeight", cWeight);
		model.addAttribute("tWeight", tWeight);
		model.addAttribute("lWeight", lWeight);
		model.addAttribute("count1week", count1week);
		model.addAttribute("count2week", count2week);
		model.addAttribute("count3week", count3week);
		model.addAttribute("count4week", count4week);
		model.addAttribute("count1week2", count1week2);
		model.addAttribute("count2week2", count2week2);
		model.addAttribute("count3week2", count3week2);
		model.addAttribute("count4week2", count4week2);
		model.addAttribute("crsList", crsList);
		model.addAttribute("thisday", thisday);
		model.addAttribute("thisdate", thisdate);
		model.addAttribute("thismonth", thismonth);
		model.addAttribute("feList", feList);
		model.addAttribute("likeList", likeList);
			
		return "mypage";
	}
	
	@RequestMapping(value = "/myPage", method = RequestMethod.POST) 
	public void myFeed(@RequestParam("feed") String feed, HttpServletResponse res) throws IOException {
		
	}	
}
