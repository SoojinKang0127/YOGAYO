package com.team4.test;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team4.dao.course.CourseDAO;
import com.team4.dao.course.CourseDAOImpl;
import com.team4.dao.course.CourseServiceImpl;
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.vo.CoursePosesVo;
import com.team4.vo.CourseVo;
import com.team4.vo.PagingVo;
import com.team4.vo.PoseVo;

@Controller
public class CourseController {

	CourseServiceImpl service = new CourseServiceImpl();
	PoseServiceImpl pService = new PoseServiceImpl();

	@RequestMapping(value = "/course-page", method = RequestMethod.GET)
	public String coueseTitle(Model model) throws Exception {
		List<CourseVo> list = service.selectAll();
		model.addAttribute("courses", list);
		return "course-page";

	}

	@RequestMapping(value = "/course-detail", method = RequestMethod.GET)
	public String makeCourse(CourseVo vo,CoursePosesVo cpvo, HttpServletRequest req,
			RedirectAttributes rttr, Model model, @RequestParam("crsNum") int crsNum) throws Exception {
		int totalTime = 0;
		int totalMin = 0;
		int totalSec = 0;

		vo = new CourseVo();
		cpvo = new CoursePosesVo();

		vo.setCrsNum(crsNum);

		CourseVo course;
		CoursePosesVo cpv;

		try {
			course = service.selectOne(vo);
			model.addAttribute("course", course);
			
			cpv = service.coursePoses(vo);
			model.addAttribute("coursePoses", cpv);
			
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
//		CourseVo vo=service.selectOne(vo);
//		int seq1=vo.getSeq1()
//				=>포즈를 불러올수 있다
//			PoseVO posevo=servicePose.selcetPose(new PoseVo(seq1))
//			posevo.getTime
//			posevo.gettitle
/*
 * HttpSession session = req.getSession(); CourseVo course =
 * service.selectOne(vo); session.setAttribute("course", course);
 */
