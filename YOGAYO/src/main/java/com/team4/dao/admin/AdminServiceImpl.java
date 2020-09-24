package com.team4.dao.admin;

import java.util.List;

import com.team4.vo.AdminVo;
import com.team4.vo.CommentVo;
import com.team4.vo.CourseVo;
import com.team4.vo.FeedVo;
import com.team4.vo.LikeVo;
import com.team4.vo.PoseVo;
import com.team4.vo.UserVo;

public class AdminServiceImpl implements AdminService {

	AdminDAOImpl dao = new AdminDAOImpl();
	
	
	@Override
	public List<AdminVo> getAllComment() throws Exception {
		return dao.getAllComment();
	}


	@Override
	public void deleteComment(AdminVo vo) throws Exception {
		dao.deleteComment(vo);
	}


	@Override
	public List<AdminVo> getAllCourse() throws Exception {
		return dao.getAllCourse();
	}


	@Override
	public AdminVo getOneCourseByCrsnum(AdminVo vo) throws Exception {
		return dao.getOneCourseByCrsnum(vo);
	}

	public void courseUpdate(AdminVo vo) throws Exception {
		dao.courseUpdate(vo);
	}


	@Override
	public List<UserVo> selectAllUser() throws Exception {
		return dao.selectAllUser();
	}


	@Override
	public int getLastUnum() throws Exception {
		return dao.getLastUnum();
	}


	@Override
	public void subscribeNewsletter(AdminVo vo) throws Exception {
		dao.subscribeNewsletter(vo);
	}


	@Override
	public List<AdminVo> selectAllNewsletterSubscriber() throws Exception {
		return dao.selectAllNewsletterSubscriber();
	}


	@Override
	public int countAllSubscriber() throws Exception {
		return dao.countAllSubscriber();
	}


	@Override
	public List<AdminVo> selectAllPose() throws Exception {
		return dao.selectAllPose();
	}


	@Override
	public UserVo selectUserByuNum(UserVo vo) throws Exception {
		return dao.selectUserByuNum(vo);
	}


	@Override
	public int countLikeByuNum(UserVo vo) throws Exception {
		return dao.countLikeByuNum(vo);
	}


	@Override
	public int countCommentByuNum(UserVo vo) throws Exception {
		return dao.countCommentByuNum(vo);
	}


	@Override
	public int countFeedByuNum(UserVo vo) throws Exception {
		return dao.countFeedByuNum(vo);
	}


	@Override
	public int countCourseByuNum(UserVo vo) throws Exception {
		return dao.countCourseByuNum(vo);
	}


	@Override
	public List<AdminVo> selectLikeByuNum(UserVo vo) throws Exception {
		return dao.selectLikeByuNum(vo);
	}


	@Override
	public List<CommentVo> selectCommentByuNum(UserVo vo) throws Exception {
		return dao.selectCommentByuNum(vo);
	}


	@Override
	public List<CourseVo> selectCourseByuNum(UserVo vo) throws Exception {
		return dao.selectCourseByuNum(vo);
	}


	@Override
	public List<AdminVo> selectFeedByuNum(UserVo vo) throws Exception {
		return dao.selectFeedByuNum(vo);
	}

	 
}
