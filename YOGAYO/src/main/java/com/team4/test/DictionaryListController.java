package com.team4.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.dao.pose.PoseServiceImpl;
import com.team4.util.UserAuthCheck;
import com.team4.vo.PoseVo;
import com.team4.vo.UserVo;

@Controller
public class DictionaryListController {

	private static final Logger logger = LoggerFactory.getLogger(PlaylistController.class);


	PoseServiceImpl service = new PoseServiceImpl();
	
	
	@RequestMapping(value = "/dictionary", method = RequestMethod.GET)
	public String library(Model model, HttpServletResponse res, HttpServletRequest req, PoseVo vo) throws Exception {
		UserAuthCheck.loginCheck(req, res, model);
		List<PoseVo> list = service.poseSelectAll();
		model.addAttribute("user",(UserVo)req.getSession().getAttribute("user"));
		model.addAttribute("pose", list);

		return "dictionary";
	}
}
