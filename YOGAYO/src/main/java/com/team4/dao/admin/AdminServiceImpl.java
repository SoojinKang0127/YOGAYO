package com.team4.dao.admin;

import java.util.List;

import com.team4.vo.AdminVo;

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

	 
}
