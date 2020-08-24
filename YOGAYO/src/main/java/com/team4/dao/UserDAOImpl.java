package com.team4.dao;

import org.apache.ibatis.session.SqlSession;
import com.team4.util.SqlSessionFactoryBean;
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

}


