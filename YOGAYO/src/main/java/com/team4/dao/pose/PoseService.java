package com.team4.dao.pose;

import java.util.List;

import com.team4.vo.PoseVo;

public interface PoseService {

	public PoseVo poseSelect(PoseVo vo) throws Exception;
	public void poseInsert(PoseVo vo) throws Exception;
	public void poseDefaultSet(PoseVo vo) throws Exception;
	public List<PoseVo> poseSelectAll() throws Exception;
	public void update(PoseVo vo) throws Exception;

}
