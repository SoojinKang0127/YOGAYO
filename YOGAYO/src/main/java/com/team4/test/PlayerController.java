package com.team4.test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;

import com.team4.dao.course.CourseServiceImpl;
import com.team4.dao.feed.FeedServiceImpl;
import com.team4.dao.like.LikeServiceImpl;
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.user.dao.UserServiceImpl;
import com.team4.vo.CourseVo;
import com.team4.vo.FeedVo;
import com.team4.vo.LikeVo;
import com.team4.vo.PoseVo;
import com.team4.vo.UserVo;

@Controller
public class PlayerController {

	FeedVo vo = new FeedVo();
	FeedServiceImpl fservice = new FeedServiceImpl();
	CourseServiceImpl cservice = new CourseServiceImpl();
	PoseServiceImpl pservice = new PoseServiceImpl();
	LikeServiceImpl lservice = new LikeServiceImpl();
	UserServiceImpl uservice = new UserServiceImpl();

	@RequestMapping(value = "/player", method = RequestMethod.GET)
	public String player(HttpServletRequest req, @RequestParam("course") String course, Model model) {

		int no = Integer.parseInt(course);
		CourseVo cvo = new CourseVo();
		cvo.setCrsNum(no);
		CourseVo resultCvo = null;
		UserVo uvo = (UserVo) req.getSession().getValue("user");
		LikeVo lvo = new LikeVo();
		lvo.setCrsNum(no);
		lvo.setuNum(uvo.getuNum());
		int likeFlag = 0;
		int likeCount = 0;
		String userName="";
		int playTotal=0;
		
		try {
			likeFlag = lservice.likeOrNot(lvo);
			likeCount = lservice.likeCount(lvo);
			playTotal=fservice.playTotal(cvo);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		if (likeFlag == 1) {
			model.addAttribute("like", "fas fa-heart");
		} else {
			model.addAttribute("like", "far fa-heart");
		}
		model.addAttribute("likeCount", likeCount);

		try {
			resultCvo = cservice.selectOne(cvo);
			userName=uservice.getUName(resultCvo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int poseNo1 = resultCvo.getSeq1();
		int poseNo2 = resultCvo.getSeq2();
		int poseNo3 = resultCvo.getSeq3();
		int poseNo4 = resultCvo.getSeq4();
		int poseNo5 = resultCvo.getSeq5();
		int poseNo6 = resultCvo.getSeq6();
		int poseNo7 = resultCvo.getSeq7();
		int poseNo8 = resultCvo.getSeq8();

		PoseVo pose1 = new PoseVo();
		PoseVo pose2 = new PoseVo();
		PoseVo pose3 = new PoseVo();
		PoseVo pose4 = new PoseVo();
		PoseVo pose5 = new PoseVo();
		PoseVo pose6 = new PoseVo();
		PoseVo pose7 = new PoseVo();
		PoseVo pose8 = new PoseVo();

		PoseVo resultPvo1 = null;
		PoseVo resultPvo2 = null;
		PoseVo resultPvo3 = null;
		PoseVo resultPvo4 = null;
		PoseVo resultPvo5 = null;
		PoseVo resultPvo6 = null;
		PoseVo resultPvo7 = null;
		PoseVo resultPvo8 = null;

		pose1.setpNum(poseNo1);
		pose2.setpNum(poseNo2);
		pose3.setpNum(poseNo3);
		pose4.setpNum(poseNo4);
		pose5.setpNum(poseNo5);
		pose6.setpNum(poseNo6);
		pose7.setpNum(poseNo7);
		pose8.setpNum(poseNo8);

		try {
			resultPvo1 = pservice.poseSelect(pose1);
			resultPvo2 = pservice.poseSelect(pose2);
			resultPvo3 = pservice.poseSelect(pose3);
			resultPvo4 = pservice.poseSelect(pose4);
			resultPvo5 = pservice.poseSelect(pose5);
			resultPvo6 = pservice.poseSelect(pose6);
			resultPvo7 = pservice.poseSelect(pose7);
			resultPvo8 = pservice.poseSelect(pose8);
		} catch (Exception e) {
			e.printStackTrace();
		}

		model.addAttribute("course", resultCvo);
		model.addAttribute("pose1", resultPvo1);
		model.addAttribute("pose2", resultPvo2);
		model.addAttribute("pose3", resultPvo3);
		model.addAttribute("pose4", resultPvo4);
		model.addAttribute("pose5", resultPvo5);
		model.addAttribute("pose6", resultPvo6);
		model.addAttribute("pose7", resultPvo7);
		model.addAttribute("pose8", resultPvo8);
		model.addAttribute("uvo",uvo);
		model.addAttribute("crsNum", course);
		model.addAttribute("userName",userName);
		model.addAttribute("playTotal",playTotal);

		return "player";
	}

	@RequestMapping(value = "/feedupload", method = RequestMethod.POST)
	public String feedupload(MultipartHttpServletRequest multi, HttpServletRequest req) {

		HttpSession session = req.getSession();
		UserVo user = (UserVo) session.getValue("user");
		int uNum = user.getuNum();

		int course = Integer.parseInt(multi.getParameter("course"));
		int slevel = Integer.parseInt(multi.getParameter("slevel"));
		int dlevel = Integer.parseInt(multi.getParameter("dlevel"));
		String context = multi.getParameter("context");
		int weight = Integer.parseInt(multi.getParameter("weight"));

		MultipartFile mf = multi.getFile("file");
		String originalFileName = mf.getOriginalFilename();
		String fileType = originalFileName.substring(originalFileName.lastIndexOf('.'), originalFileName.length());

		String realPath = multi.getRealPath("/");
		String curUserPath = realPath.substring(0, realPath.indexOf(".metadata"));
		curUserPath = curUserPath.replace('\\', '/');
		String path = null;
		if (curUserPath.indexOf("YOGAYO") == -1) {
			path = curUserPath + "YOGAYO/YOGAYO/src/main/webapp/resources/image/feedimages/";
		} else {

			path = curUserPath + "YOGAYO/src/main/webapp/resources/image/feedimages/";
		}
		String projectPath = "resources/image/feedimages/";

		int no = 0;
		try {
			no = fservice.getLastFnum() + 1;
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String safeFile = path + "feed" + Integer.toString(no) + fileType;
		String prjPathandName = projectPath + "feed" + Integer.toString(no) + fileType;

		try {
			mf.transferTo(new File(safeFile));
			System.out.println("파일 들어감");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("오류! 파일 안 들어감");
		}

		vo.setuNum(uNum);
		vo.setCrsNum(course);
		vo.setsLevel(slevel);
		vo.setdLevel(dlevel);
		vo.setContext(context);
		vo.setWeight(weight);
		vo.setuImg1(prjPathandName);

		try {
			fservice.upload(vo);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류! 피드 안 들어감");
		}

		return "mypage";
	}
	
	@RequestMapping(value = "/likeCourse", method = RequestMethod.POST)
	public void likeCourse(HttpServletResponse res,@RequestParam("uNum") int uNum, @RequestParam("crsNum") int crsNum ) {
		LikeVo lvo = new LikeVo();
		lvo.setuNum(uNum);
		lvo.setCrsNum(crsNum);
		int count=0;
		try {
			int flag=lservice.likeOrNot(lvo);
			if(flag==0) {
				lservice.like(lvo);
			}
			 count =lservice.likeCount(lvo);
			 res.getWriter().write(Integer.toString(count));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	@RequestMapping(value = "/dislikeCourse", method = RequestMethod.POST)
	public void dislikeCourse(HttpServletResponse res,@RequestParam("uNum") int uNum, @RequestParam("crsNum") int crsNum ) {
		
		LikeVo lvo = new LikeVo();
		lvo.setuNum(uNum);
		lvo.setCrsNum(crsNum);
		int count=0;
		try {
			int flag=lservice.likeOrNot(lvo);
			if(flag==1) {
				lservice.dislike(lvo);
			}
			 count=lservice.likeCount(lvo);
			 res.getWriter().write(Integer.toString(count));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
