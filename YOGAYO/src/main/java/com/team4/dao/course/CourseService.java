package com.team4.dao.course;

import java.util.List;

import com.team4.vo.CourseVo;

public interface CourseService {
	public void makeCourse(CourseVo vo) throws Exception;
	public List<CourseVo> selectAll() throws Exception;
	public CourseVo selectOne(CourseVo vo) throws Exception;
	public int getLastCnum() throws Exception;
}
