package com.team4.dao.course;

import java.util.HashMap;
import java.util.List;

import com.team4.vo.CommentVo;
import com.team4.vo.CoursePosesVo;
import com.team4.vo.CourseVo;
import com.team4.vo.DiffiVo;
import com.team4.vo.UserVo;

public interface CourseDAO {
	public void makeCourse(CourseVo vo) throws Exception;
	public List<CourseVo> selectAll(int startNum) throws Exception;
	public List<CourseVo> searchCourse(int uNum, String sort, int StartNum) throws Exception;
	public CourseVo selectOne(CourseVo vo) throws Exception;
	public int getLastCnum() throws Exception;
	public CoursePosesVo coursePoses(CourseVo vo) throws Exception;
	
	public void addComment(CommentVo cvo) throws Exception;
	public List<CommentVo> commentAll(CourseVo vo) throws Exception;
	public int commentCount(CourseVo vo) throws Exception;
	public double commentAvg(CourseVo vo) throws Exception;
	public void addReview(CommentVo cvo) throws Exception;
	public List<CommentVo> reviewAll(CourseVo vo) throws Exception;
	
	public List<CommentVo> commentAllMore(CourseVo vo) throws Exception;
	
	public List<Integer> courseAll() throws Exception;
	public UserVo makerInfo(CourseVo vo) throws Exception;
	public int userCount(CourseVo vo) throws Exception;
	public DiffiVo courseDiffi(CourseVo vo) throws Exception;
	public CourseVo selectCourseByCrsNum(Integer crsNum) throws Exception;
	public List<CourseVo> selectMoreCourse(HashMap map) throws Exception;
	
}
	