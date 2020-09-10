package com.team4.dao.course;

import java.util.List;

import com.team4.vo.CommentVo;
import com.team4.vo.CoursePosesVo;
import com.team4.vo.CourseVo;
import com.team4.vo.PagingVo;
import com.team4.vo.PoseVo;

public class CourseServiceImpl implements CourseService {

	@Override
	public int getLastCnum() throws Exception {
		// TODO Auto-generated method stub
		return dao.getLastCnum();
	}


	CourseDAO dao = new CourseDAOImpl();

	@Override
	public int get_auto_incrm() throws Exception {
		return dao.get_auto_incrm();
	}

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
	


}
