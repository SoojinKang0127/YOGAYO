package com.team4.test;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.dao.course.CourseDAO;
import com.team4.dao.course.CourseDAOImpl;
import com.team4.dao.course.CourseServiceImpl;
import com.team4.vo.CourseVo;

@Controller
public class CourseController {
	
	CourseServiceImpl service = new CourseServiceImpl();
	
	@RequestMapping(value = "/course-detail", method = RequestMethod.GET)
	public String makeCourse(Model model,
			@RequestParam("crsNum")int crsNum) {
		

		CourseVo vo = new CourseVo();
		
		vo.setCrsNum(crsNum);
			
		CourseVo course;
		try {
			course = service.selectOne(vo);
			model.addAttribute("course",course);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "course-detail";
	}

}
