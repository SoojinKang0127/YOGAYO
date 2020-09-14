package com.team4.dao.like;


import java.util.List;

import com.team4.vo.LikeVo;

public interface LikeDAO {
	
	public void like(LikeVo vo) throws Exception; 
	public int likeOrNot(LikeVo vo) throws Exception;
	public void dislike(LikeVo vo) throws Exception;
	public int likeCount(LikeVo vo) throws Exception;
	public List<Integer> countCourse(LikeVo vo) throws Exception;
	public List<Integer> courseAll() throws Exception; 
	
}
