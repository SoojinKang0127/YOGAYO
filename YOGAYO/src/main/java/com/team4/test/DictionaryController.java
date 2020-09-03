package com.team4.test;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
<<<<<<< HEAD
=======
import java.nio.channels.SeekableByteChannel;
>>>>>>> master
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD

=======
import org.springframework.web.bind.annotation.RequestParam;

import com.google.protobuf.Service;
import com.team4.dao.course.CourseServiceImpl;
>>>>>>> master
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.vo.PoseVo;




@Controller
public class DictionaryController {
	
<<<<<<< HEAD
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/dictionary", method = RequestMethod.GET)
	public String dictionary(Locale locale, Model model) {
=======
	
	PoseServiceImpl service = new PoseServiceImpl();

	@RequestMapping(value = "/dictionary-detail", method = RequestMethod.GET)
	public String dictionary( Locale locale, Model model ,PoseVo vo,HttpServletRequest req)throws Exception {
			
		String pnum=req.getParameter("pnum");
		
		int num=Integer.parseInt(pnum);
		vo= new PoseVo();
			vo.setpNum(num);
			PoseVo pose;
		
			try {
				pose = service.poseSelect(vo);
				model.addAttribute("pose" , pose);
			} catch (Exception e) {
				e.printStackTrace();
			}
>>>>>>> master
		
		JSONParser parser = new JSONParser();
		PoseServiceImpl service= new PoseServiceImpl();
		
		
<<<<<<< HEAD
			try {
				JSONObject obj = (JSONObject) parser.parse(new FileReader("c:\\pose.json"));
				
				
				JSONObject obj2 = (JSONObject) obj.get("0");
				
				//System.out.println(obj2.toString());
				JSONArray  watchout= (JSONArray)obj2.get("watchout");
				System.out.println(watchout.toString());
				
				
				JSONArray  tips= (JSONArray)obj2.get("tips");
				System.out.println(tips.toString());
				
				
				JSONArray  stepbystep= (JSONArray)obj2.get("stepbystep");
				System.out.println(stepbystep.toString());
				
				
				JSONArray  benefit= (JSONArray)obj2.get("benefit");
				System.out.println(benefit.toString());
				
				
				JSONArray  variation= (JSONArray)obj2.get("variation");
				System.out.println(variation.toString());
=======
//			try {
//				JSONObject obj = (JSONObject) parser.parse(new FileReader("c:\\pose.json"));
//				
//				
//				JSONObject obj2 = (JSONObject) obj.get("0");
//				
//				//System.out.println(obj2.toString());
//				JSONArray  watchout= (JSONArray)obj2.get("watchout");
//				
//				System.out.println(watchout.toString());
				
				
//				JSONArray  tips= (JSONArray)obj2.get("tips");
//				System.out.println(tips.toString());
//				
//				
//				JSONArray  stepbystep= (JSONArray)obj2.get("stepbystep");
//				System.out.println(stepbystep.toString());
//				
//				
//				JSONArray  benefit= (JSONArray)obj2.get("benefit");
//				System.out.println(benefit.toString());
//				
//				
//				JSONArray  variation= (JSONArray)obj2.get("variation");
//				System.out.println(variation.toString());
>>>>>>> master
				
				
				
//				JSONArray stepbystep = (JSONArray)obj2.get("stepbystep");
//				System.out.println(stepbystep.toString());
//				
//				JSONArray benefit = (JSONArray)obj.get("benefit");
//				System.out.println();
//				
//				JSONArray variation = (JSONArray)obj.get("variation");
//				System.out.println(variation.toString());
				
//				for(int i= 0 ; i < ((CharSequence) obj2).length(); i++ ) {
//				String  watchout= (String)obj.get("watchout");
//				String	tips    = (String)obj.get("tips");
//				String  stepbystep= (String)obj.get("stepbystep");
//				String  benefit = (String)obj.get("benefit");
//				String  variation = (String)obj.get("variation");
//				
//				System.out.println(watchout);
//				System.out.println(tips);
//				System.out.println(stepbystep);
//				System.out.println(benefit);
//				System.out.println(variation);
//				}
				
				
<<<<<<< HEAD
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
=======
//			}catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
>>>>>>> master
			
		return "dictionary-detail";
	};
	
	
<<<<<<< HEAD
//	@RequestMapping(value = "/main", method = RequestMethod.GET)
//	public String main(Model model, HttpServletRequest req) {
//		
//		HttpSession session = req.getSession();	
//		
//		Object user = session.getAttribute("user");
//		if(user == null) {
//			String errMessage = "로그인 후 이용이 가능합니다.";
//			model.addAttribute("errMessage", errMessage);
//			return "login";
//		}
//		return "main";
//	}
//	
//	
//	
//	@RequestMapping(value = "/course-page", method = RequestMethod.GET)
//	public String couesePage(Model model) {
//		return "course-page";
//	}
//	
//	
//	
//	
//	
//	
//	@RequestMapping(value = "/course-detail", method = RequestMethod.GET)
//	public String coueseDetail(Model model) {
//
//		return "course-detail";
//	}
//	
//	
//	@RequestMapping(value = "/my-page", method = RequestMethod.GET)
//	public String myPage(Model model) {
//
//		return "mypage";
//	}
//
//	
//	@RequestMapping(value = "/pose", method = RequestMethod.GET)
//	public String pose(Model model) {
//
//		return "dictionary-detail";
//	}
	
=======
>>>>>>> master

	
	
	
	

}
