package com.team4.test;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.protobuf.Service;
import com.team4.dao.course.CourseServiceImpl;
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.vo.PoseVo;




@Controller
public class DictionaryController {
	
	
	PoseServiceImpl service = new PoseServiceImpl();

	@RequestMapping(value = "/dictionary-detail", method = RequestMethod.GET)
	public String dictionary( Locale locale, Model model ,PoseVo vo,HttpServletRequest req)throws Exception {
	
		String pnum=req.getParameter("pnum");
		
		int num=Integer.parseInt(pnum);  
		
		vo= new PoseVo();
			vo.setpNum(num);
			PoseVo pose ;
		
			
			
			try {
				pose = service.poseSelect(vo);				
				model.addAttribute("pose" , pose);
				
				
				int minu = pose.getTime() / 60;
				if (minu!=0) {
					String minu2 = Integer.toString(minu)+"분";
					System.out.println(minu2);
					model.addAttribute("minu2",minu2);
				}else {
					
				}
				int second = pose.getTime() % 60;
				
				
				model.addAttribute("second",second);
				

			} catch (Exception e) {
				e.printStackTrace();
			}
		
		JSONParser parser = new JSONParser();
		PoseServiceImpl service= new PoseServiceImpl();
		
		
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
				
				
//			}catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
			
		return "dictionary-detail";
	};
	
	

	
	
	
	

}
