package com.team4.user.dao;

import java.util.List;

import com.team4.vo.FeedVo;
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

	@Override
	public void update(UserVo vo) throws Exception {
		
		dao.update(vo);
		
	}

	@Override
	public int tWeight() throws Exception {	
		
		return dao.tWeight();
	}

	@Override
	public int lWeight() throws Exception {
		
		System.out.println(dao.lWeight());
		
		return dao.lWeight();
	}

<<<<<<< HEAD
	@Override
	public UserVo checkDuplication(UserVo vo) throws Exception {
		
		
		return dao.checkDuplication(vo);
	}

	@Override
	public int getUNum(UserVo vo) {
		return dao.getUNum(vo);
	}

	@Override
	public List<UserVo> selectAllUser() throws Exception {
		return dao.selectAllUser();
	}

=======
>>>>>>> master

	
	



}
