package com.team4.dao.course;

import java.util.List;

import com.team4.vo.CourseVo;

public class CourseServiceImpl implements CourseService {
	
	CourseDAO dao = new CourseDAOImpl(); 

	@Override
	public void makeCourse(CourseVo vo) throws Exception {
		dao.makeCourse(vo);
		
	}

	@Override
	public List<CourseVo> selectAll() throws Exception {
		return dao.selectAll();
	}

	@Override
	public CourseVo selectOne(CourseVo vo) throws Exception {
		return dao.selectOne(vo);
	}

	public int getLastCnum() throws Exception {
		
		return dao.getLastCnum();
	}



}
