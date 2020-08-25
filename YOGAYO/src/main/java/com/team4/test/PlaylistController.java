package com.team4.test;


import java.sql.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.dao.pose.PoseDAO;
import com.team4.dao.pose.PoseDAOImpl;
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.vo.PoseVo;




@Controller
public class PlaylistController {
	
	private static final Logger logger = LoggerFactory.getLogger(PlaylistController.class);


	PoseServiceImpl service = new PoseServiceImpl();
	
	
	@RequestMapping(value = "/course_playlist", method = RequestMethod.GET)
	public String course_playlist(Model model
			) {
		
		PoseDAO dao = new PoseDAOImpl();
		List<PoseVo> list = null;
		
		try {
			list=dao.poseSelectAll();
			System.out.println(list.toString());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
//		try {
//			list = service.poseSelectAll();
//			for(PoseVo element : list) {
//				int pNum = element.getpNum();
//				String img_path =element.getImgPath();
//				String title = element.getTitle();
//				String audio_path = element.getAudioPath();
//				int time = element.getTime();
//				int difficulty = element.getDifficulty();
//				Date regdate  = element.getRegDate();
//				System.out.println(img_path);
//				list.get(pNum);
//			}
//			
//			
//			model.addAttribute("poselist",list);
		
//		} catch (Exception e) {
		
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		return "course_playlist";
	}

	
//		@RequestMapping(value = "/course_playlist", method = RequestMethod.POST)
//	public String course_playlist(Model model,
//			@RequestParam("pNum")int pNum,
//			@RequestParam("img_Path")String img_Path,
//			@RequestParam("title")String title,
//			@RequestParam("audio_Path")String audio_Path,
//			@RequestParam("time")int time,
//			@RequestParam("difficulty")int difficulty,
//			@RequestParam("regDate") Date regDate) throws Exception {
//		
//
//		List<PoseVo> list = null;
//
//		try {
//			list = service.poseSelectAll();
//			for(PoseVo element : list) {
//				//System.out.println(a);
//				
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		
//		
//		
//	PoseVo vo = new PoseVo();
//	vo.setpNum(pNum);
//	vo.setImgPath(img_Path);
//	vo.setTitle(title);
//	vo.setAudioPath(audio_Path);
//	vo.setTime(time);
//	vo.setDifficulty(difficulty);
//	vo.setRegDate(regDate);
//	
//	
//	
//	model.addAttribute("poselist", vo);
//	
//	System.out.println(vo.getImgPath());
//	
//	return "course_playlist";
//	
//	}
//	
	
}
			
	
	
	
	
	
	
	


