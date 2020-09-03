package com.team4.dao;

import java.util.List; 
import com.team4.vo.UserVo;

public class UserServiceImpl implements UserService {

	UserDAO dao = new UserDAOImpl();
	
	@Override
	public UserVo login(UserVo vo) throws Exception {
		return dao.login(vo);
	}

	@Override
	public void signUp(UserVo vo) throws Exception {
		
		dao.signUp(vo);
	}

	@Override
	public List<String> selectAllid() throws Exception {
		return dao.selectAllId();
		
	}



}
