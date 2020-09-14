package com.team4.dao.feed;

import com.team4.vo.CourseVo;
import com.team4.vo.FeedVo;

public class FeedServiceImpl implements FeedService{
	
	FeedDAO dao = new FeedDAOImpl();

	@Override
	public void upload(FeedVo vo) throws Exception {
		dao.upload(vo);		
	}

	@Override
	public int getLastFnum() throws Exception {
		return dao.getLastFnum();
	}

	@Override
	public int playTotal(CourseVo vo) throws Exception {
		return dao.playTotal(vo);
	}


	
	
	

}
