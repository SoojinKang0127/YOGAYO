package com.team4.dao.course;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.team4.util.SqlSessionFactoryBean;
import com.team4.vo.CommentVo;
import com.team4.vo.CoursePosesVo;
import com.team4.vo.CourseVo;
import com.team4.vo.PagingVo;
import com.team4.vo.PoseVo;

public class CourseDAOImpl implements CourseDAO {
	
	private SqlSession mybatis;
	
	@Override
	public int getLastCnum() throws Exception {
		// TODO Auto-generated method stub
		return mybatis.selectOne("CourseDao.getLastCnum");
	}

	@Override
	public int get_auto_incrm() throws Exception {
		return mybatis.selectOne("CourseDao.get_auto_incrm");
	
				
	}

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

	public CoursePosesVo coursePoses(CourseVo vo) throws Exception {
		return mybatis.selectOne("CourseDao.coursePoses",vo);
	}
	@Override
	public void addComment(CommentVo cvo) throws Exception {
		mybatis.insert("CourseDao.addComment",cvo);
		mybatis.commit();
		
	}

	@Override
	public List<CommentVo> commentAll(CourseVo vo) throws Exception {
		return mybatis.selectList("CourseDao.commentAll",vo);
	}

	@Override
	public void addReview(CommentVo cvo) throws Exception {
		mybatis.insert("CourseDao.addReview",cvo);
		mybatis.commit();
		
	}

	@Override
	public List<CommentVo> reviewAll(CourseVo vo) throws Exception {
		return mybatis.selectList("CourseDao.reviewAll",vo);
	}

	@Override
	public int commentCount(CourseVo vo) throws Exception {
		return mybatis.selectOne("CourseDao.commentCount", vo);
	}

	@Override
	public double commentAvg(CourseVo vo) throws Exception {
		return mybatis.selectOne("CourseDao.commentAvg",vo);
	}
	
	

}
