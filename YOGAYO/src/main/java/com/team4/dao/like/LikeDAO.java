package com.team4.dao.like;


import com.team4.vo.LikeVo;

public interface LikeDAO {
	
	public void like(LikeVo vo) throws Exception; 
	public int likeOrNot(LikeVo vo) throws Exception;
	public void dislike(LikeVo vo) throws Exception;
	
}
