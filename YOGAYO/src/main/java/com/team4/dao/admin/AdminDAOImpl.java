package com.team4.dao.admin;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.team4.util.SqlSessionFactoryBean;
import com.team4.vo.AdminVo;

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

}
