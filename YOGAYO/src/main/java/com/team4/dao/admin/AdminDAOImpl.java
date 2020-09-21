package com.team4.dao.admin;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.team4.util.SqlSessionFactoryBean;
import com.team4.vo.AdminVo;
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
	
	
	
}
