package com.team4.test;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.team4.dao.admin.AdminServiceImpl;
import com.team4.user.dao.UserServiceImpl;
import com.team4.vo.AdminVo;
import com.team4.vo.UserVo;

@Controller
public class AdminPageController {

	AdminServiceImpl service = new AdminServiceImpl();
	
	
	@RequestMapping(value = "/admin/", method = RequestMethod.GET)
	public String adminHome(Model model) throws Exception {
		

		return "/admin/admin-home";
	};

	@RequestMapping(value = "/admin/member", method = RequestMethod.GET)
	public String getMember(Model model) throws Exception {

		AdminServiceImpl service = new AdminServiceImpl();
		List<UserVo> list = service.selectAllUser();
		model.addAttribute("userList", list);

		return "/admin/admin-member";
	};

	@RequestMapping(value = "/admin/comment", method = RequestMethod.GET)
	public String getComment(Model model) throws Exception {

		List<AdminVo> list = service.getAllComment();
		model.addAttribute("commentList", list);

		return "/admin/admin-comment";
	};

	@RequestMapping(value = "/admin/commentdelete", method = RequestMethod.GET)
	public String deleteComment(ModelAndView mav, @RequestParam("cmtnum") String cmtnum) throws Exception {

		AdminVo vo = new AdminVo();
		vo.setCmtNum(Integer.parseInt(cmtnum));
		vo.setParent(Integer.parseInt(cmtnum));

		try {
			service.deleteComment(vo);
			System.out.println("댓글 삭제 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERR! 댓글 삭제 실패!");
		}

		return "redirect:/admin/comment";
	};

	@RequestMapping(value = "/admin/course", method = RequestMethod.GET)
	public String course(Model model) throws Exception {

		List<AdminVo> list = service.getAllCourse();
		model.addAttribute("courseList", list);

		return "/admin/admin-course";
	};

	@RequestMapping(value = "/admin/courseupdate", method = RequestMethod.GET)
	public String updateCourse(Model model, @RequestParam("crsnum") String crsnum) throws Exception {

		AdminVo vo = new AdminVo();
		vo.setCrsNum(Integer.parseInt(crsnum));
		AdminVo resultVo = service.getOneCourseByCrsnum(vo);
		model.addAttribute("course", resultVo);

		return "/admin/admin-course-update";
	};

	@RequestMapping(value = "/admin/docourseupdate", method = RequestMethod.GET)
	public String doCourseUpdate(Model model, @RequestParam("crsnum") int crsNum,
			@RequestParam("title") String crsTitle, @RequestParam("description") String crsDscrt, @RequestParam("material") String material,
			@RequestParam("seq1") int seq1Num, @RequestParam("seq2") int seq2Num, @RequestParam("seq3") int seq3Num,
			@RequestParam("seq4") int seq4Num, @RequestParam("seq5") int seq5Num, @RequestParam("seq6") int seq6Num,
			@RequestParam("seq7") int seq7Num, @RequestParam("seq8") int seq8Num) throws Exception {

		
		AdminVo vo = new AdminVo();
		vo.setCrsNum(crsNum);
		vo.setCrsTitle(crsTitle);
		vo.setCrsDscrt(crsDscrt);
		vo.setMaterial(material);
		vo.setSeq1Num(seq1Num);
		vo.setSeq2Num(seq2Num);
		vo.setSeq3Num(seq3Num);
		vo.setSeq4Num(seq4Num);
		vo.setSeq5Num(seq5Num);
		vo.setSeq6Num(seq6Num);
		vo.setSeq7Num(seq7Num);
		vo.setSeq8Num(seq8Num);
		
		
		try {
			service.courseUpdate(vo);
			System.out.println("코스 수정 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERR! 코스 수정 실패");
		}
		
		return "redirect:/admin/course";
	};
	
	
	
	@RequestMapping(value = "/admin/newsletter", method = RequestMethod.GET)
	public String newsLetter(Model model) throws Exception {
		

		AdminServiceImpl service = new AdminServiceImpl();
		List<UserVo> list = service.selectAllUser();
		model.addAttribute("userList", list);
		
	
		return "/admin/admin-newsletter";
	};
	
	
	@RequestMapping(value = "/admin/sendnewsletter", method = RequestMethod.GET)
	public String sendNewsLetter(Model model) throws Exception {
		
		
	
		return "/admin/admin-member";
	};
}
