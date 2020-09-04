package com.team4.test;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.dao.pose.PoseServiceImpl;
import com.team4.vo.PoseVo;

@Controller
public class LibraryController {

	private static final Logger logger = LoggerFactory.getLogger(PlaylistController.class);


	PoseServiceImpl service = new PoseServiceImpl();
	
	
	@RequestMapping(value = "/library", method = RequestMethod.GET)
	public String library(Model model,
			HttpServletResponse res
			) throws Exception {
		
		List<PoseVo> list = service.poseSelectAll();
		model.addAttribute("pose", list);
		
		
		System.out.println(list);
		
		return "library";
	}
}
