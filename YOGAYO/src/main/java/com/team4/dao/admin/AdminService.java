package com.team4.dao.admin;

import java.util.List;

import com.team4.vo.AdminVo;

public interface AdminService {
	
	public List<AdminVo> getAllComment() throws Exception;
	public void deleteComment(AdminVo vo) throws Exception;

}
