package com.team4.test;

import java.sql.Date;
import java.util.List;

import com.team4.dao.UserDAO;
import com.team4.dao.UserDAOImpl;
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.vo.PoseVo;
import com.team4.vo.UserVo;

//import com.team4.dao.Dao;
//import com.team4.vo.Vo;

public class ServiceClient {

	public static void main(String[] args) {
		// Dao dao = new Dao();

		// Vo vo = new Vo();
		// vo.setNo(13);
		// vo.setName("ㄴㄴㄴ");
//
		// dao.insert(vo);

//		vo.setNo(200);

		// 쿼리문을 만든다 -> dao에 함수를 만든다 ->

		// UserDAO dao = new UserDAOImpl();
//		
//		UserVo vo = new UserVo();
//		vo.setId("11");
//		vo.setPwd("11");
//		vo.setName("11");
//		vo.setbDate(new Date(19910705));
//		vo.setGender('F');
//		
//		
//		
//	
//		
//		try {
//			dao.signUp(vo);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		PoseServiceImpl service = new PoseServiceImpl();

		List<PoseVo> list = null;

		try {
			list = service.poseSelectAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(list.get(1).getTitle());
		System.out.println(list.get(1).getAudioPath());
		System.out.println(list.get(1).getDifficulty());
		System.out.println(list.get(1).getImgPath());
		System.out.println(list.get(1).getTime());
		System.out.println(list.get(1).getpNum());
		
		

	}

}
