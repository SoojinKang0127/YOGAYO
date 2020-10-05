package com.team4.dao.admin;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.team4.util.SqlSessionFactoryBean;
import com.team4.vo.AdminVo;
import com.team4.vo.CommentVo;
import com.team4.vo.CourseVo;
import com.team4.vo.FeedVo;
import com.team4.vo.LikeVo;
import com.team4.vo.PoseVo;
import com.team4.vo.UserVo;

public class AdminDAOImpl implements AdminDAO{
	
	
	private SqlSession mybatis;
	
	
	public AdminDAOImpl() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	@Override
	public List<AdminVo> getAllComment() throws Exception {
		
		return mybatis.selectList("AdminDAO.getAllComment");
	}

	@Override
	public void deleteComment(AdminVo vo) throws Exception {
		mybatis.delete("AdminDAO.deleteComment", vo);
		mybatis.commit();
	}

	public List<AdminVo> getAllCourse() throws Exception {
		
		return mybatis.selectList("AdminDAO.getAllCourse");
	}

	public AdminVo getOneCourseByCrsnum(AdminVo vo) throws Exception {
		
		return mybatis.selectOne("AdminDAO.getOneCourseByCrsnum", vo);
	}

	@Override
	public void courseUpdate(AdminVo vo) throws Exception {
		mybatis.update("AdminDAO.courseUpdate", vo);
		mybatis.commit();
	}

	@Override
	public List<UserVo> selectAllUser() throws Exception {
		
		return mybatis.selectList("UserDao.selectAllUser");
	}

	@Override
	public int getLastUnum() throws Exception {
		return mybatis.selectOne("AdminDAO.getLastUnum");
	}

	@Override
	public void subscribeNewsletter(AdminVo vo) throws Exception {
		mybatis.insert("AdminDAO.subscribeNewsletter", vo);
		mybatis.commit();
	}

	@Override
	public List<AdminVo> selectAllNewsletterSubscriber() throws Exception {
		return mybatis.selectList("AdminDAO.selectAllNewsletterSubscriber");
	}

	@Override
	public int countAllSubscriber() throws Exception {
		return mybatis.selectOne("AdminDAO.countAllSubscriber");
	}

	@Override
	public List<AdminVo> selectAllPose() throws Exception {
		return mybatis.selectList("AdminDAO.selectAllPose");
	}

	@Override
	public UserVo selectUserByuNum(UserVo vo) throws Exception {

		return mybatis.selectOne("AdminDAO.selectUserByuNum", vo);
	}

	@Override
	public int countLikeByuNum(UserVo vo) throws Exception {
		return mybatis.selectOne("AdminDAO.countLikeByuNum", vo);
	}

	@Override
	public int countCommentByuNum(UserVo vo) throws Exception {
		return mybatis.selectOne("AdminDAO.countCommentByuNum", vo);
	}

	@Override
	public int countFeedByuNum(UserVo vo) throws Exception {
		return mybatis.selectOne("AdminDAO.countFeedByuNum", vo);
	}

	@Override
	public int countCourseByuNum(UserVo vo) throws Exception {
		return mybatis.selectOne("AdminDAO.countCourseByuNum", vo);
	}

	@Override
	public List<AdminVo> selectLikeByuNum(UserVo vo) throws Exception {
		return mybatis.selectList("AdminDAO.selectLikeByuNum", vo);
	}

	@Override
	public List<CommentVo> selectCommentByuNum(UserVo vo) throws Exception {
		return mybatis.selectList("AdminDAO.selectCommentByuNum", vo);
	}

	@Override
	public List<CourseVo> selectCourseByuNum(UserVo vo) throws Exception {
		return mybatis.selectList("AdminDAO.selectCourseByuNum", vo);
	}

	@Override
	public List<AdminVo> selectFeedByuNum(UserVo vo) throws Exception {
		return mybatis.selectList("AdminDAO.selectFeedByuNum", vo);
	}

	@Override
	public int countFemaleUser() throws Exception {
		return mybatis.selectOne("AdminDAO.countFemaleUser");
	}

	@Override
	public int countMaleUser() throws Exception {
		return mybatis.selectOne("AdminDAO.countMaleUser");
	}

	@Override
	public AdminVo countByLevel() throws Exception {
		return mybatis.selectOne("AdminDAO.countByLevel");
	}

	@Override
	public AdminVo ratioPerAge() throws Exception {
		return mybatis.selectOne("AdminDAO.ratioPerAge");
	}

	@Override
	public void deleteNewsletterList(UserVo vo) throws Exception {
		mybatis.delete("AdminDAO.deleteNewsletterList", vo);
		mybatis.commit();
	}

	@Override
	public int countAllMember() throws Exception {
		return mybatis.selectOne("AdminDAO.countAllMember");		
				
	}

	@Override
	public AdminVo countNewMember() throws Exception {
		
		return mybatis.selectOne("AdminDAO.countNewMember");
	}

	@Override
	public AdminVo countNewFeed() throws Exception {
	
		return mybatis.selectOne("AdminDAO.countNewFeed");
	}

	@Override
	public AdminVo countNewCourse() throws Exception {
		
		return mybatis.selectOne("AdminDAO.countNewCourse");
	}

	@Override
	public AdminVo countNewComment() throws Exception {
		return mybatis.selectOne("AdminDAO.countNewComment");
	}
	
	
	
}