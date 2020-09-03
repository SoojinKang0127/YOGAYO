package com.team4.dao.like;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.team4.util.SqlSessionFactoryBean;
import com.team4.vo.LikeVo;
import com.team4.vo.PoseVo;

public class LikeDAOImpl implements LikeDAO {

	private SqlSession mybatis;

	@Override
	public void like(LikeVo vo) throws Exception {
		mybatis.insert("LikeDAO.like", vo);
		mybatis.commit();

	}

	@Override
	public int likeOrNot(LikeVo vo) throws Exception {
		List<LikeVo> list=null;
		list = mybatis.selectList("LikeDAO.likeOrNot", vo);
		if (list!=null) {
			return 1;
		}
		return 0;
	}

	@Override
	public void dislike(LikeVo vo) throws Exception {
		mybatis.selectList("LikeDAO.dislike", vo);
		mybatis.commit();

	}

}
