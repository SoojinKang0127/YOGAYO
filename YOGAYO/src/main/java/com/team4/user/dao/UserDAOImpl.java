package com.team4.user.dao;

import java.util.List;

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
	public int lWeight(UserVo vo) throws Exception {
		return mybatis.selectOne("UserDao.lWeight", vo);

	}



	@Override
	public int tWeight1(UserVo vo) throws Exception {
		return mybatis.selectOne("UserDao.tWeight1", vo);
	}
	
	@Override
	public int tWeight2(UserVo vo) throws Exception {
		return mybatis.selectOne("UserDao.tWeight2", vo);
	}


	@Override
	public int cWeight(UserVo vo) throws Exception {
		return mybatis.selectOne("UserDao.cWeight", vo);
	}


	@Override
	public int count1week(UserVo vo) throws Exception {
		return mybatis.selectOne("UserDao.count1week", vo);
	}
	
	@Override
	public int count2week(UserVo vo) throws Exception {
		return mybatis.selectOne("UserDao.count2week", vo);
	}
	
	@Override
	public int count3week(UserVo vo) throws Exception {
		return mybatis.selectOne("UserDao.count3week", vo);
	}
	
	@Override
	public int count4week(UserVo vo) throws Exception {
		return mybatis.selectOne("UserDao.count4week", vo);
	}


	@Override
	public List<FeedVo> selectAll(UserVo vo) throws Exception {
		return mybatis.selectList("UserDao.selectAll", vo);
	}

	


}


