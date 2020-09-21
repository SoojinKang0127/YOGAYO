package com.team4.dao.admin;

import java.util.List;

import com.team4.vo.AdminVo;
import com.team4.vo.PoseVo;
import com.team4.vo.UserVo;

public interface AdminDAO {
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

}
