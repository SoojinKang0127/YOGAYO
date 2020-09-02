package com.team4.dao.course;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.team4.util.SqlSessionFactoryBean;
import com.team4.vo.CourseVo;

public class CourseDAOImpl implements CourseDAO {
	
	private SqlSession mybatis;
	
	public CourseDAOImpl() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	@Override
	public void makeCourse(CourseVo vo) throws Exception {
		mybatis.insert("CourseDao.makeCourse", vo);
		mybatis.commit();
	}
	
	public List<CourseVo> selectAll() throws Exception{
		return mybatis.selectList("CourseDao.selectAll");
	}

	@Override
	public CourseVo selectOne(CourseVo vo) throws Exception {
		return mybatis.selectOne("CourseDao.selectOne",vo);
	}

	@Override
	public int getLastCnum() throws Exception {
		return mybatis.selectOne("CourseDao.getLastCnum");
	}
	
	

}
