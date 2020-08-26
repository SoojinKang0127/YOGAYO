package com.team4.user.dao;

import org.apache.ibatis.session.SqlSession;
import com.team4.util.SqlSessionFactoryBean;
import com.team4.vo.FeedVo;
import com.team4.vo.UserVo;

public class UserDAOImpl implements UserDAO {
	
	private SqlSession mybatis;
	
	
	public UserDAOImpl() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	
	@Override
	public UserVo login(UserVo vo) throws Exception {
		return mybatis.selectOne("UserDao.login", vo);
	}

	
	@Override
	public void signUp(UserVo vo) throws Exception {
		mybatis.insert("UserDao.signup", vo);
		mybatis.commit();
	}

	
	@Override
	public java.util.List<String> selectAllId() throws Exception {
		return mybatis.selectList("UserDao.selectAllId");
	}


	@Override
	public void update(UserVo vo) throws Exception {
		mybatis.update("UserDao.update", vo);
		mybatis.commit();
		
	}


	@Override
	public int tWeight() throws Exception {
		return mybatis.selectOne("UserDao.tWeight");
		
	}


	@Override
	public int lWeight() throws Exception {
		return mybatis.selectOne("UserDao.lWeight");

	}


	@Override
	public UserVo checkDuplication(UserVo vo) throws Exception {
		return mybatis.selectOne("UserDao.checkDuplication", vo);
	}


	@Override
	public int getUNum(UserVo vo) {
		return mybatis.selectOne("UserDao.getUnum",vo);
	}

	


}


