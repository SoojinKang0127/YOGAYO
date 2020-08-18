package com.team4.dao;

import org.apache.ibatis.session.SqlSession;

import com.team4.util.SqlSessionFactoryBean;
import com.team4.vo.Vo;

public class Dao {
	
	
	private SqlSession mybatis;
	
	
	public Dao() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public void insert(Vo vo) {
		mybatis.insert("Dao.insert", vo);
		mybatis.commit();
	}
	
	
	
	public Vo select(int no) {
		Vo vo_ = new Vo();
		
		vo_ = mybatis.selectOne("Dao.select", no);
		mybatis.commit();
		
		return vo_;
	}
	
	
	public void update(String no) {
		mybatis.update(no);
		mybatis.commit();
	}
	

}
