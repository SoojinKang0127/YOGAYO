package com.team4.dao.pose;

import java.util.List;

import com.team4.vo.PoseVo;

public interface PoseDAO {

	public PoseVo poseSelect(PoseVo vo) throws Exception;
	public void poseInsert(PoseVo vo) throws Exception;
	public void poseDefaultSet(PoseVo vo) throws Exception;
	public void poseUpdate(PoseVo vo) throws Exception;
	
	public List<String> poseSelectAll() throws Exception;
	

	
	
	
	
	
}
