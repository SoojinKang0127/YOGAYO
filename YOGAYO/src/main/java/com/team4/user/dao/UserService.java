package com.team4.user.dao;

import java.util.List;

import com.team4.vo.FeedVo;
import com.team4.vo.UserVo;

public interface UserService {
	
	public UserVo login(UserVo vo) throws Exception;
	public void signUp(UserVo vo) throws Exception;
	public void update(UserVo vo) throws Exception;
	public int tWeight1(UserVo vo) throws Exception;
	public int tWeight2(UserVo vo) throws Exception;
	public int lWeight(UserVo vo) throws Exception;
	public int cWeight(UserVo vo) throws Exception;
	public int count1week(UserVo vo) throws Exception;
	public int count2week(UserVo vo) throws Exception;
	public int count3week(UserVo vo) throws Exception;
	public int count4week(UserVo vo) throws Exception;
	public List<FeedVo> selectAll(UserVo vo) throws Exception;




	
	public List<String> selectAllid() throws Exception;

}
