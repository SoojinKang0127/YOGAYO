package com.team4.dao.like;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.team4.util.SqlSessionFactoryBean;
import com.team4.vo.LikeVo;
import com.team4.vo.PoseVo;

public class LikeDAOImpl implements LikeDAO {
	
	
	private SqlSession mybatis;

	public LikeDAOImpl() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	@Override
	public void like(LikeVo vo) throws Exception {
		mybatis.insert("LikeDAO.like", vo);
		mybatis.commit();

	}

	@Override
	public int likeOrNot(LikeVo vo) throws Exception {
		return mybatis.selectOne("LikeDAO.likeOrNot", vo);
	}

	@Override
	public void dislike(LikeVo vo) throws Exception {
		mybatis.selectList("LikeDAO.dislike", vo);
		mybatis.commit();

	}

	@Override
	public int likeCount(LikeVo vo) throws Exception {
		return mybatis.selectOne("LikeDAO.likeCount", vo);
	}

	@Override
	public List<Integer> countCourse(LikeVo vo) throws Exception {
		return mybatis.selectList("LikeDAO.countCourse", vo);
	}

	@Override
	public List<Integer> courseAll() throws Exception {
		return mybatis.selectList("LikeDAO.selectAllCousre");
	}

}
