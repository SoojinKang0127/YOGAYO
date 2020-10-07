package com.team4.dao.course;

import java.util.HashMap;
import java.util.List;

import com.team4.vo.CommentVo;
import com.team4.vo.CoursePosesVo;
import com.team4.vo.CourseVo;
import com.team4.vo.DiffiVo;
import com.team4.vo.UserVo;

public class CourseServiceImpl implements CourseService {



	CourseDAO dao = new CourseDAOImpl();


	@Override
	public void makeCourse(CourseVo vo) throws Exception {
		dao.makeCourse(vo);
	}

	@Override
	public List<CourseVo> selectAll(int startNum) throws Exception {
		return dao.selectAll(startNum);
	}

	@Override
	public CourseVo selectOne(CourseVo vo) throws Exception {
		return dao.selectOne(vo);
	}
	
	@Override
	public CoursePosesVo coursePoses(CourseVo vo) throws Exception {
		return dao.coursePoses(vo);

	}

	@Override
	public void addComment(CommentVo cvo) throws Exception {
		dao.addComment(cvo);
		
	}

	@Override
	public List<CommentVo> commentAll(CourseVo vo) throws Exception {
		return dao.commentAll(vo);
	}

	@Override
	public void addReview(CommentVo cvo) throws Exception {
		dao.addReview(cvo);
		
	}

	@Override
	public List<CommentVo> reviewAll(CourseVo vo) throws Exception {
		return dao.reviewAll(vo);
	}

	@Override
	public int commentCount(CourseVo vo) throws Exception {
		return dao.commentCount(vo);
	}

	@Override
	public double commentAvg(CourseVo vo) throws Exception {
		return dao.commentAvg(vo);
	}
	

	public int getLastCnum() throws Exception {
		
		return dao.getLastCnum();
	}

	@Override
	public List<Integer> courseAll() throws Exception {
		return dao.courseAll();
	}

	@Override
	public List<CourseVo> searchCourse(int uNum, String sort, int startNum) throws Exception {
		return dao.searchCourse(uNum, sort, startNum);
	}

	@Override
	public UserVo makerInfo(CourseVo vo) throws Exception {
		return dao.makerInfo(vo);
	}

	@Override
	public int userCount(CourseVo vo) throws Exception {
		return dao.userCount(vo);
	}

	@Override
	public DiffiVo courseDiffi(CourseVo vo) throws Exception {
		return dao.courseDiffi(vo);
	}

	@Override
	public List<CommentVo> commentAllMore(CourseVo vo) throws Exception {
		return dao.commentAllMore(vo);
	
	}

	@Override
	public CourseVo selectCourseByCrsNum(Integer crsNum) throws Exception {
		return dao.selectCourseByCrsNum(crsNum);
	}

	@Override
	public List<CourseVo> selectMoreCourse(HashMap map) throws Exception {
		return dao.selectMoreCourse(map);
	}

}
