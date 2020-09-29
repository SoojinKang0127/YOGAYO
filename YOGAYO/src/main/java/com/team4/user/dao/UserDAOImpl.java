package com.team4.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.team4.util.SqlSessionFactoryBean;
import com.team4.vo.CommentVo;
import com.team4.vo.CourseVo;
import com.team4.vo.FeedVo;
import com.team4.vo.UserVo;

public class UserDAOImpl implements UserDAO {
	
	private SqlSession mybatis;
	
	
	public UserDAOImpl() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	
	@Override
	public UserVo login(UserVo vo) throws Exception {
		return mybatis.selectOne("UserDao.login", vo);
	}

	
	@Override
	public void signUp(UserVo vo) throws Exception {
		mybatis.insert("UserDao.signup", vo);
		mybatis.commit();
	}

	
	@Override
	public java.util.List<String> selectAllId() throws Exception {
		return mybatis.selectList("UserDao.selectAllId");
	}


	@Override
	public void update(UserVo vo) throws Exception {
		mybatis.update("update.update", vo);
		mybatis.commit();
		
	}



	@Override
	public int lWeight1(UserVo vo) throws Exception {
		return mybatis.selectOne("MyPage.lWeight1", vo);

	}
	
	@Override
	public int lWeight2(UserVo vo) throws Exception {
		return mybatis.selectOne("MyPage.lWeight2", vo);

	}



	@Override
	public int tWeight1(UserVo vo) throws Exception {
		return mybatis.selectOne("MyPage.tWeight1", vo);
	}
	
	@Override
	public int tWeight2(UserVo vo) throws Exception {
		return mybatis.selectOne("MyPage.tWeight2", vo);
	}


	@Override
	public int cWeight(UserVo vo) throws Exception {
		return mybatis.selectOne("MyPage.cWeight", vo);
	}


	@Override
	public int count1week(UserVo vo) throws Exception {
		return mybatis.selectOne("MyPage.count1week", vo);
	}
	
	@Override
	public int count2week(UserVo vo) throws Exception {
		return mybatis.selectOne("MyPage.count2week", vo);
	}
	
	@Override
	public int count3week(UserVo vo) throws Exception {
		return mybatis.selectOne("MyPage.count3week", vo);
	}
	
	@Override
	public int count4week(UserVo vo) throws Exception {
		return mybatis.selectOne("MyPage.count4week", vo);
	}
	@Override
	public int tWeight() throws Exception {
		return mybatis.selectOne("MyPage.tWeight");
		
	}


	@Override
	public List<FeedVo> selectAll(UserVo vo) throws Exception {
		return mybatis.selectList("MyPage.selectAll", vo);
	}


	@Override
	public List<CourseVo> selectAllCrs(UserVo vo) throws Exception {
		return mybatis.selectList("MyPage.selectAllCrs", vo);

	}
	public int lWeight() throws Exception {
		return mybatis.selectOne("MyPage.lWeight");

	}


	@Override
	public String thisday() {
		return mybatis.selectOne("MyPage.thisday");
	}
	
	public UserVo checkDuplication(UserVo vo) throws Exception {
		return mybatis.selectOne("UserDao.checkDuplication", vo);
	}


	@Override
	public String thismonth() {
		return mybatis.selectOne("MyPage.thismonth");
	}
		
	public int getUNum(UserVo vo) {
		return mybatis.selectOne("UserDao.getUnum",vo);
	}

	@Override
	public int thisdate() {
		return mybatis.selectOne("MyPage.thisdate");
	}
	public List<UserVo> selectAllUser() throws Exception {
		return mybatis.selectList("MyPage.selectAllUser");
	}


	@Override
	public List<CourseVo> allLikey(UserVo vo) throws Exception {
		return mybatis.selectList("MyPage.allLikey", vo);
	}


	@Override
	public int count1week2(UserVo vo) throws Exception {
		return mybatis.selectOne("MyPage.count1week2", vo);
	}


	@Override
	public int count2week2(UserVo vo) throws Exception {
		return mybatis.selectOne("MyPage.count2week2", vo);
	}


	@Override
	public int count3week2(UserVo vo) throws Exception {
		return mybatis.selectOne("MyPage.count3week2", vo);

	}


	@Override
	public int count4week2(UserVo vo) throws Exception {
		return mybatis.selectOne("MyPage.count4week2", vo);

	}


	@Override
	public String getUName(CourseVo vo) throws Exception {
		
		return mybatis.selectOne("UserDao.getUName", vo);
	}


	@Override
	public List<Integer> selectExceptMe(UserVo vo) throws Exception {
		return mybatis.selectList("UserDao.selectExceptMe", vo);
	}


	@Override
	public UserVo getUserByCommentVo(CommentVo vo) throws Exception {
		return mybatis.selectOne("UserDao.getUserByCommentVo", vo);
	}
	
	


}


