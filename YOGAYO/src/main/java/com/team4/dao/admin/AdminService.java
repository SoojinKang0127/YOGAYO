package com.team4.dao.admin;

import java.util.List;

import com.team4.vo.AdminVo;
import com.team4.vo.CommentVo;
import com.team4.vo.CourseVo;
import com.team4.vo.FeedVo;
import com.team4.vo.LikeVo;
import com.team4.vo.PoseVo;
import com.team4.vo.UserVo;

public interface AdminService {
	
	public List<AdminVo> getAllComment() throws Exception;
	public void deleteComment(AdminVo vo) throws Exception;
	public List<AdminVo> getAllCourse() throws Exception;
	public AdminVo getOneCourseByCrsnum(AdminVo vo) throws Exception;
	public void courseUpdate(AdminVo vo) throws Exception;
	public List<UserVo> selectAllUser() throws Exception;
	public int getLastUnum() throws Exception;
	public void subscribeNewsletter(AdminVo vo) throws Exception;
	public List<AdminVo> selectAllNewsletterSubscriber() throws Exception;
	public int countAllSubscriber() throws Exception;
	public List<AdminVo> selectAllPose() throws Exception;
	public UserVo selectUserByuNum(UserVo vo) throws Exception;
	public int countLikeByuNum(UserVo vo) throws Exception;
	public int countCommentByuNum(UserVo vo) throws Exception;
	public int countFeedByuNum(UserVo vo) throws Exception;
	public int countCourseByuNum(UserVo vo) throws Exception;
	public List<AdminVo> selectLikeByuNum(UserVo vo) throws Exception;
	public List<CommentVo> selectCommentByuNum(UserVo vo) throws Exception;
	public List<CourseVo> selectCourseByuNum(UserVo vo) throws Exception;
	public List<AdminVo> selectFeedByuNum(UserVo vo) throws Exception;
	public int countFemaleUser() throws Exception;
	public int countMaleUser() throws Exception;
	public AdminVo countByLevel() throws Exception;
	public AdminVo ratioPerAge() throws Exception;
	public void deleteNewsletterList(UserVo vo) throws Exception;
	public int countAllMember() throws Exception;
}