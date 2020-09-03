package com.team4.user.dao;

import java.util.List;

import com.team4.vo.FeedVo;
import com.team4.vo.UserVo;

public interface UserDAO {
	
	//로그인
	public UserVo login(UserVo vo) throws Exception;
	public void signUp(UserVo vo) throws Exception;
	public void update(UserVo vo) throws Exception;
	public int tWeight() throws Exception;
	public int lWeight() throws Exception;
	public List<String> selectAllId() throws Exception;
	public UserVo checkDuplication(UserVo vo) throws Exception;
	public int getUNum(UserVo vo);
	public List<UserVo> selectAllUser() throws Exception;
}
