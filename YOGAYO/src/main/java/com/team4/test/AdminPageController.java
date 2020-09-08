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
	
	@RequestMapping(value = "/admin/member", method = RequestMethod.GET)
	public String member(Model model) throws Exception {
		
		UserServiceImpl service = new UserServiceImpl();
		List<UserVo> list = service.selectAllUser();
		model.addAttribute("userList", list);
		
		return "/admin/admin-member";
	};
	
	
	@RequestMapping(value = "/admin/comment", method = RequestMethod.GET)
	public String comment(Model model) throws Exception {
		
		List<AdminVo> list = service.getAllComment();
		model.addAttribute("commentList", list);
		
		return "/admin/admin-comment";
	};
	
	
	@RequestMapping(value = "/admin/commentdelete", method = RequestMethod.GET)
	public String deleteComment (ModelAndView mav, @RequestParam("cmtnum") String cmtnum) throws Exception {
				
		AdminVo vo = new AdminVo();
		vo.setCmtNum(Integer.parseInt(cmtnum));
		vo.setParent(Integer.parseInt(cmtnum));
		service.deleteComment(vo);
		System.out.println("댓글 삭제 완료");
		
		return "redirect:/admin/comment";
	};
	
	@RequestMapping(value = "/admin/course", method = RequestMethod.GET)
	public String course(Model model) throws Exception {
		
	
		
		return "/admin/admin-course";
	};
	
	
}
