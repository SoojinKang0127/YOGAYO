package com.team4.test;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
import com.team4.vo.CourseVo;

@Controller
public class CourseController {

	CourseServiceImpl service = new CourseServiceImpl();

	@RequestMapping(value = "/course-page", method = RequestMethod.GET)
	public String coueseTitle(Model model) throws Exception {
		List<CourseVo> list = service.selectAll();
		model.addAttribute("courses", list);
		return "course-page";

	}

	@RequestMapping(value = "/course-detail", method = RequestMethod.GET)
	public String makeCourse(CourseVo vo, HttpServletRequest req, RedirectAttributes rttr, Model model,
			@RequestParam("crsNum") int crsNum) throws Exception {
		vo = new CourseVo();
		vo.setCrsNum(crsNum);
		CourseVo course;
		try {
			course = service.selectOne(vo);
			model.addAttribute("course", course);
		} catch (Exception e) {
			e.printStackTrace();
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
