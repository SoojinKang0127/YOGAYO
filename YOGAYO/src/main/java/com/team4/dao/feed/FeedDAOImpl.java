package com.team4.dao.feed;

import org.apache.ibatis.session.SqlSession;

import com.team4.util.SqlSessionFactoryBean;
import com.team4.vo.FeedVo;

public class FeedDAOImpl implements FeedDAO{

	
	private SqlSession mybatis;
	
	
	public FeedDAOImpl() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	
	@Override
	public void upload(FeedVo vo) throws Exception {
		mybatis.insert("FeedDAO.upload", vo);
		mybatis.commit();
		
		
	}


	@Override
	public int getLastFnum() throws Exception {
		
		return mybatis.selectOne("FeedDAO.getLastFnum");
	}
	
}
