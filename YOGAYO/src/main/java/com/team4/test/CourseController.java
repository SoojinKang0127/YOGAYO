package com.team4.test;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team4.dao.course.CourseServiceImpl;
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.vo.CommentVo;
import com.team4.vo.CoursePosesVo;
import com.team4.vo.CourseVo;

@Controller
public class CourseController {

	CourseServiceImpl service = new CourseServiceImpl();
	PoseServiceImpl pService = new PoseServiceImpl();
	
	
	@RequestMapping(value = "/course-detail-upload-comment", method = RequestMethod.POST)
	public void uploadComment(CommentVo cvo, Model model, @RequestParam("crsNum") int crsNum,
			@RequestParam("uNum") int uNum, @RequestParam("comment") String context,
			@RequestParam("rating") int rate) {
		System.out.println("들어왔음");
		
		System.out.println(uNum);
		System.out.println(context);
		System.out.println(rate);
		System.out.println(crsNum);

		
	}

	@RequestMapping(value = "/course-page", method = RequestMethod.GET)
	public String coueseTitle(Model model) throws Exception {
		List<CourseVo> list = service.selectAll();
		model.addAttribute("courses", list);
		return "course-page";
	}

	@RequestMapping(value = "/addReview", method = RequestMethod.GET)
	public String addReview(CommentVo cvo, Model model, @RequestParam("uNum") int uNum,
			@RequestParam("crsNum") int crsNum, @RequestParam("review") String context,
			@RequestParam("parent") int parent ) {
		cvo = new CommentVo();
		cvo.setuNum(uNum);
		cvo.setCrsNum(crsNum);
		cvo.setContext(context);
		cvo.setParent(parent);
		try {
			service.addReview(cvo);
		} catch (Exception e) {
			System.out.println("[CourseController /  addReview]" + e.toString());
		}

		return "redirect:/course-detail?crsNum=" + crsNum;
	}

	@RequestMapping(value = "/addComment", method = RequestMethod.GET)
	public String addComment(CommentVo cvo, Model model, @RequestParam("crsNum") int crsNum,
			@RequestParam("uNum") int uNum, @RequestParam("comment") String context,
			@RequestParam("rating3") int rate) {
		cvo = new CommentVo();
		cvo.setCrsNum(crsNum);
		cvo.setuNum(uNum);
		cvo.setContext(context);
		cvo.setRate(rate);
		try {
			service.addComment(cvo);
		} catch (Exception e) {
			System.out.println("[CourseController /  addComment]" + e.toString());
		}

		return "redirect:/course-detail?crsNum=" + crsNum;
	}

	@RequestMapping(value = "/course-detail", method = RequestMethod.GET)
	public String makeCourse(CourseVo vo, CoursePosesVo cpvo, HttpServletRequest req, RedirectAttributes rttr,
			Model model, @RequestParam("crsNum") int crsNum) throws Exception {
		int totalTime = 0;
		int totalMin = 0;
		int totalSec = 0;

		vo = new CourseVo();
		cpvo = new CoursePosesVo();

		vo.setCrsNum(crsNum);
		model.addAttribute("crsNum", crsNum);
		CourseVo course;
		CoursePosesVo cpv;
		List<CommentVo> commentList;
		List<CommentVo> reviewList;

		try {

			course = service.selectOne(vo);
			model.addAttribute("course", course);

			cpv = service.coursePoses(vo);
			model.addAttribute("coursePoses", cpv);

			commentList = service.commentAll(vo);
			model.addAttribute("commentList", commentList);

			reviewList = service.reviewAll(vo);
			model.addAttribute("reviewList", reviewList);

			System.out.println(commentList.get(0).getContext());
			
			int[] timeArr = { Integer.parseInt(cpv.getTime1()), Integer.parseInt(cpv.getTime2()),
					Integer.parseInt(cpv.getTime3()), Integer.parseInt(cpv.getTime4()),
					Integer.parseInt(cpv.getTime5()), Integer.parseInt(cpv.getTime6()),
					Integer.parseInt(cpv.getTime7()), Integer.parseInt(cpv.getTime8()) };

			ArrayList mins = new ArrayList();
			ArrayList seconds = new ArrayList();
			String minute;
			String second;

			for (int i = 0; i < timeArr.length; i++) {
				int min = timeArr[i] / 60;
				int sec = timeArr[i] % 60;

				if (min < 10) {
					minute = "0" + Integer.toString(min);
				} else {
					minute = Integer.toString(min);
				}
				if (sec < 10) {
					second = "0" + Integer.toString(sec);
				} else {
					second = Integer.toString(sec);
				}

				mins.add(minute);
				seconds.add(second);
			}
			model.addAttribute("mins", mins);
			model.addAttribute("seconds", seconds);

			totalTime = Integer.parseInt(cpv.getTime1()) + Integer.parseInt(cpv.getTime2())
					+ Integer.parseInt(cpv.getTime3()) + Integer.parseInt(cpv.getTime4())
					+ Integer.parseInt(cpv.getTime5()) + Integer.parseInt(cpv.getTime6())
					+ Integer.parseInt(cpv.getTime7()) + Integer.parseInt(cpv.getTime8());

			totalMin = totalTime / 60;
			totalSec = totalTime % 60;

			model.addAttribute("totalMin", totalMin);
			model.addAttribute("totalSec", totalSec);

		} catch (Exception e) {
			System.out.println("[CourseController /  makeCourse]" + e.toString());
		}

		return "course-detail";

	}

}
