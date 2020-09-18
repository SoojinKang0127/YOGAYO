package com.team4.dao.admin;

import java.util.List;

import com.team4.vo.AdminVo;
import com.team4.vo.UserVo;

public class AdminServiceImpl implements AdminService {

	AdminDAOImpl dao = new AdminDAOImpl();
	
	
	@Override
	public List<AdminVo> getAllComment() throws Exception {
		return dao.getAllComment();
	}


	@Override
	public void deleteComment(AdminVo vo) throws Exception {
		dao.deleteComment(vo);
	}


	@Override
	public List<AdminVo> getAllCourse() throws Exception {
		return dao.getAllCourse();
	}


	@Override
	public AdminVo getOneCourseByCrsnum(AdminVo vo) throws Exception {
		return dao.getOneCourseByCrsnum(vo);
	}

	public void courseUpdate(AdminVo vo) throws Exception {
		dao.courseUpdate(vo);
	}


	@Override
	public List<UserVo> selectAllUser() throws Exception {
		return dao.selectAllUser();
	}


	@Override
	public int getLastUnum() throws Exception {
		return dao.getLastUnum();
	}


	@Override
	public void subscribeNewsletter(AdminVo vo) throws Exception {
		dao.subscribeNewsletter(vo);
	}


	@Override
	public List<AdminVo> selectAllNewsletterSubscriber() throws Exception {
		return dao.selectAllNewsletterSubscriber();
	}


	@Override
	public int countAllSubscriber() throws Exception {
		return dao.countAllSubscriber();
	}

	 
}
