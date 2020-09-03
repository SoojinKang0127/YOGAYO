package com.team4.dao.pose;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.team4.util.SqlSessionFactoryBean;
import com.team4.vo.PoseVo;

public class PoseDAOImpl implements PoseDAO {
	
	private SqlSession mybatis;
	
	public PoseDAOImpl() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	@Override
	public PoseVo poseSelect(PoseVo vo) throws Exception {
		return mybatis.selectOne("PoseDao.poseSelectOne", vo);
	}

	@Override
	public void poseInsert(PoseVo vo) throws Exception {
		mybatis.insert("PoseDao.poseInsert", vo);
		mybatis.commit();
	}

	@Override
<<<<<<< HEAD
	public List<String> poseSelectAll() throws Exception {
=======
	public List<PoseVo> poseSelectAll() throws Exception {
>>>>>>> master
		return mybatis.selectList("PoseDao.poseSelectAll");
	}

	@Override
	public void poseDefaultSet(PoseVo vo) throws Exception {
		mybatis.insert("PoseDao.poseDefaultSet", vo);
		mybatis.commit();
		
	}

	@Override
	public void poseUpdate(PoseVo vo) throws Exception {
		mybatis.update("PoseDao.poseUpdate",vo);
		mybatis.commit();
	}

<<<<<<< HEAD
=======

	public List<String> poseSelectJSON(String string) throws Exception {
		return mybatis.selectList("PoseDao.poseSelectJSON");
	}

>>>>>>> master
}
