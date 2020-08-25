package com.team4.dao.pose;

import java.util.List;

import com.team4.dao.UserDAOImpl;
import com.team4.vo.PoseVo;

public class PoseServiceImpl implements PoseService {

	PoseDAO dao = new  PoseDAOImpl();
	
	@Override
	public PoseVo poseSelect(PoseVo vo) throws Exception {
		return dao.poseSelect(vo);
	}

	@Override
	public void poseInsert(PoseVo vo) throws Exception {
		dao.poseInsert(vo);
	}

	@Override
	public List<PoseVo> poseSelectAll() throws Exception {
		return dao.poseSelectAll();
	}

	@Override
	public void poseDefaultSet(PoseVo vo) throws Exception {
		dao.poseDefaultSet(vo);
	}

}
