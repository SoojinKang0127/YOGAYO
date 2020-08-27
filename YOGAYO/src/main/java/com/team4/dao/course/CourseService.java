package com.team4.dao.course;

import java.util.List;

import com.team4.vo.CoursePosesVo;
import com.team4.vo.CourseVo;
import com.team4.vo.PoseVo;

public interface CourseService {
	public void makeCourse(CourseVo vo) throws Exception;
	public List<CourseVo> selectAll() throws Exception;
	public CourseVo selectOne(CourseVo vo) throws Exception;
	public CoursePosesVo coursePoses(CourseVo vo) throws Exception;
	
}
