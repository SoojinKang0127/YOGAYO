package com.team4.dao.admin;

import java.util.List;

import com.team4.vo.AdminVo;

public class AdminServiceImpl implements AdminService {

	AdminDAOImpl dao = new AdminDAOImpl();
	
	
	@Override
	public List<AdminVo> getAllComment() throws Exception {
		return dao.getAllComment();
	}

	 
}
