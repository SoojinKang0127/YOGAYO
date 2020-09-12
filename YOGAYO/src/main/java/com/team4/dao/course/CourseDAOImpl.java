package com.team4.dao.course;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.team4.util.SqlSessionFactoryBean;
import com.team4.vo.CommentVo;
import com.team4.vo.CoursePosesVo;
import com.team4.vo.CourseVo;
import com.team4.vo.DiffiVo;
import com.team4.vo.PagingVo;
import com.team4.vo.PoseVo;
import com.team4.vo.UserVo;

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

	@Override
	public List<Integer> courseAll() throws Exception {
		return mybatis.selectList("CourseDao.courseAll");
	}

	@Override
	public List<CourseVo> searchCourse(int uNum,String sort) throws Exception{	
		if(uNum == 101 && sort==null) {
			return mybatis.selectList("CourseDao.searchCourse");				
		}else if(uNum != 101 && sort == null) {	
			return mybatis.selectList("CourseDao.searchCourse_user");		
		}else if(sort.equals("date")) {
			return mybatis.selectList("CourseDao.searchCourse_date");
		}else if(sort.equals("total")) {
			return mybatis.selectList("CourseDao.searchCourse_total");
		}else/* if(sort.equals("totalComment"))*/ {
			return mybatis.selectList("CourseDao.searchCourse_totalComment");
		}
	}

	@Override
	public UserVo makerInfo(CourseVo vo) throws Exception {
		return mybatis.selectOne("CourseDao.userThing", vo);
	}

	@Override
	public int userCount(CourseVo vo) throws Exception {
		return mybatis.selectOne("CourseDao.userCount",vo);
	}

	@Override
	public DiffiVo courseDiffi(CourseVo vo) throws Exception {
		return mybatis.selectOne("CourseDao.courseDiffi", vo);
	}

	@Override
	public List<CommentVo> commentAllMore(CourseVo vo) throws Exception {
		return mybatis.selectList("CourseDao.commentAllMore",vo);
	}
	
	

}
