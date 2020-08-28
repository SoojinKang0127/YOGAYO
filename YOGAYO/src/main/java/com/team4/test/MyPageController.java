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
import com.team4.vo.FeedVo;
import com.team4.vo.UserVo;

@Controller
public class MyPageController {
	
	UserServiceImpl service = new UserServiceImpl();
	UserDAO dao = new UserDAOImpl();
	UserVo vo = new UserVo();
	FeedVo fvo = new FeedVo();
	
	@RequestMapping(value="/myPage", method = RequestMethod.GET)
	public String myPage(Model model,HttpServletRequest req, HttpServletResponse res) 
			 {
		HttpSession session = req.getSession();
		UserVo user = (UserVo)session.getValue("user");
		int uNum = user.getuNum();
			
		vo.setuNum(uNum);
		
		System.out.println(uNum);

		int cWeight =0;
		int tWeight1 =0;
		int tWeight2 =0;
		int	lWeight =0;
		int count1week = 0;
		int count2week = 0;
		int count3week = 0;
		int count4week = 0;

		
		try {
			cWeight = service.cWeight(vo);
			tWeight1 = service.tWeight1(vo);
			tWeight2 = service.tWeight2(vo);
			lWeight = service.lWeight(vo);
			count1week = service.count1week(vo);
			count2week = service.count2week(vo);
			count3week = service.count3week(vo);
			count4week = service.count4week(vo);
	
			
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
		
		
		
		
		return "mypage";
	}
	
	@RequestMapping(value = "/myPage", method = RequestMethod.POST) 
	public void playListAJAX(@RequestParam("feed") String feed, HttpServletResponse res) throws IOException {
		
		UserService dao = new UserServiceImpl();
		JsonArray jsonarr = new JsonArray();
		JSONObject jsonobj = new JSONObject();
		
		List<FeedVo> list =null;
		
		try {
			list=dao.selectAll(vo);
			System.out.println(list);
			} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JSONObject listObj= new JSONObject();
		int k=0;
		for(FeedVo vo:list) {
			JSONObject obj = new JSONObject();
			obj.put("uNum", vo.getuNum());
			obj.put("fNum", vo.getfNum());
			obj.put("crsNum", vo.getCrsNum());
			obj.put("sLevel", vo.getsLevel());
			obj.put("context", vo.getContext());
			obj.put("uImg1", vo.getuImg1());
			obj.put("regDate", vo.getRegDate());

			listObj.put(Integer.toString(k),obj);
			k++;
		}
		String msg= listObj.toString();
		
		res.getWriter().write(msg);

		System.out.println(msg);
		
	}

}
