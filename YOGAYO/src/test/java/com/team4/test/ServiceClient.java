package com.team4.test;

import java.sql.Date;
import java.util.List;

import com.team4.dao.UserDAO;
import com.team4.dao.UserDAOImpl;
import com.team4.dao.feed.FeedServiceImpl;
import com.team4.vo.FeedVo;
import com.team4.vo.UserVo;

//import com.team4.dao.Dao;
//import com.team4.vo.Vo;

public class ServiceClient {

	public static void main(String[] args) {
	//	Dao dao = new Dao();

	//	Vo vo = new Vo();
	//	vo.setNo(13); 
	//	vo.setName("ㄴㄴㄴ");
//
		//dao.insert(vo);
		
//		vo.setNo(200);
		
		// 쿼리문을 만든다 -> dao에 함수를 만든다 -> 
		
		
		UserDAO dao = new UserDAOImpl();
//		
//		UserVo vo = new UserVo();
//		vo.setId("11");
//		vo.setPwd("11");
//		vo.setName("11");
//		vo.setbDate(new Date(19910705));
//		vo.setGender('F');

//		
//		try {
//			dao.signUp(vo);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		List<String> list = null;
//		
//		try {
//			
//			list = dao.selectAllId();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(list.get(0));


//		FeedServiceImpl ser = new FeedServiceImpl();
//		FeedVo vo = new FeedVo();
//
//		vo.setuNum(1001);
//		vo.setCrsNum(20);
//		vo.setsLevel(5);
//		vo.setdLevel(4);
//		vo.setContext("오늘 이 요가 코스는 정말 짱이었다!");
//		vo.setuImg1("img주소");
//		vo.setWeight(20);
//		
//		try {
//			ser.upload(vo);
//			System.out.println("들어감");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

	}

}
