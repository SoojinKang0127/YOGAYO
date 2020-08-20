package com.team4.dao;

import com.team4.vo.UserVo;

public class UserServiceImpl implements UserService {

		UserDAO dao = new UserDAOImpl();
	
	@Override
	public UserVo login(UserVo vo) throws Exception {
		return dao.login(vo);
	}

}
