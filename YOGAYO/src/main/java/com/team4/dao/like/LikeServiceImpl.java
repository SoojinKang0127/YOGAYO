package com.team4.dao.like;

import java.util.List;
import com.team4.user.dao.UserDAOImpl;
import com.team4.vo.LikeVo;
import com.team4.vo.PoseVo;

public class LikeServiceImpl implements LikeService {

	LikeDAO dao = new  LikeDAOImpl();

	@Override
	public void like(LikeVo vo) throws Exception {
		dao.like(vo);
		
	}

	@Override
	public int likeOrNot(LikeVo vo) throws Exception {
		
		return dao.likeOrNot(vo);
	}

	@Override
	public void dislike(LikeVo vo) throws Exception {
		dao.dislike(vo);
		
	}

	@Override
	public int likeCount(LikeVo vo) throws Exception {
		return dao.likeCount(vo);
		
	}

	@Override
	public List<Integer> countCourse(LikeVo vo) throws Exception {
		return dao.countCourse(vo);
	}

	@Override
	public List<Integer> courseAll() throws Exception {
		return dao.courseAll();
	}


}
