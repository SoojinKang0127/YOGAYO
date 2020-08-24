package com.team4.dao;

import java.util.List;

import com.team4.vo.UserVo;

public interface UserService {
	
	public UserVo login(UserVo vo) throws Exception;
	public void signUp(UserVo vo) throws Exception;
	public void update(UserVo vo) throws Exception;

	
	public List<String> selectAllid() throws Exception;

}
