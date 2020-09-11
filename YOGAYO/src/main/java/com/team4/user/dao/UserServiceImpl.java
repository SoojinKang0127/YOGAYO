package com.team4.user.dao;

import java.util.List;

import com.team4.vo.CommentVo;
import com.team4.vo.CourseVo;
import com.team4.vo.FeedVo;
import com.team4.vo.UserVo;

public class UserServiceImpl implements UserService {

	UserDAO dao = new UserDAOImpl();
	
	@Override
	public UserVo login(UserVo vo) throws Exception {
		return dao.login(vo);
	}

	@Override
	public void signUp(UserVo vo) throws Exception {
		
		dao.signUp(vo);
	}

	@Override
	public List<String> selectAllid() throws Exception {
		return dao.selectAllId();
		
	}

	@Override
	public void update(UserVo vo) throws Exception {
		
		dao.update(vo);
		
	}

	@Override
	public int lWeight(UserVo vo) throws Exception {
		
		return dao.lWeight(vo);
	}

	@Override
	public int tWeight1(UserVo vo) throws Exception {
		return dao.tWeight1(vo);
	}
	
	@Override
	public int tWeight2(UserVo vo) throws Exception {
		return dao.tWeight2(vo);
	}

	@Override
	public int cWeight(UserVo vo) throws Exception {
		return dao.cWeight(vo);
	}

	@Override
	public int count1week(UserVo vo) throws Exception {
		return dao.count1week(vo);
	}
	
	@Override
	public int count2week(UserVo vo) throws Exception {
		return dao.count2week(vo);
	}
	
	@Override
	public int count3week(UserVo vo) throws Exception {
		return dao.count3week(vo);
	}
	
	@Override
	public int count4week(UserVo vo) throws Exception {
		return dao.count4week(vo);
	}

	@Override
	public List<FeedVo> selectAll(UserVo vo) throws Exception {
		return dao.selectAll(vo);
	}

	@Override
	public List<CourseVo> selectAllCrs(UserVo vo) throws Exception {
		return dao.selectAllCrs(vo);
	}

	@Override
	public String thisday() throws Exception {
		return dao.thisday();
	}

	@Override
	public int thisdate() throws Exception {
		return dao.thisdate();
	}

	@Override
	public String thismonth() throws Exception {
		return dao.thismonth();
	}
	public int tWeight() throws Exception {	
		
		return dao.tWeight();
	}

	@Override
	public int lWeight() throws Exception {
		
		System.out.println(dao.lWeight());
		
		return dao.lWeight();
	}

	@Override
	public UserVo checkDuplication(UserVo vo) throws Exception {
		
		
		return dao.checkDuplication(vo);
	}

	@Override
	public int getUNum(UserVo vo) {
		return dao.getUNum(vo);
	}

	@Override
	public List<UserVo> selectAllUser() throws Exception {
		return dao.selectAllUser();
	}

	@Override
	public String getUName(CourseVo vo) throws Exception {
		
		return dao.getUName(vo);
	}

	@Override
	public List<Integer> selectExceptMe(UserVo vo) throws Exception {
		return dao.selectExceptMe(vo);
	}

	@Override
	public UserVo getUserByCommentVo(CommentVo vo) throws Exception {
		return dao.getUserByCommentVo(vo);
	}


	
	



}
