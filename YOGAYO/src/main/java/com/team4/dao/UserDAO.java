package com.team4.dao;

import com.team4.vo.UserVo;

public interface UserDAO {
	
	//로그인
	public UserVo login(UserVo vo) throws Exception;
	public void signUp(UserVo vo) throws Exception;

}
