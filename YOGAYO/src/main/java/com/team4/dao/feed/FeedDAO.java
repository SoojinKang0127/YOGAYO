package com.team4.dao.feed;

import com.team4.vo.FeedVo;

public interface FeedDAO {
	
	public void upload(FeedVo vo) throws Exception;
	
	public int getLastFnum() throws Exception;
	

}
 