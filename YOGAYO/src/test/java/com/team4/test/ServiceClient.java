package com.team4.test;

import java.sql.Date;
import java.util.List;

import com.team4.dao.UserDAO;
import com.team4.dao.UserDAOImpl;
import com.team4.dao.course.CourseDAO;
import com.team4.dao.course.CourseService;
import com.team4.dao.course.CourseServiceImpl;
import com.team4.vo.CourseVo;
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
//		
//		try {
//			dao.signUp(vo);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		/*
		 * List<String> list = null;
		 * 
		 * try {
		 * 
		 * list = dao.selectAllId(); } catch (Exception e) { e.printStackTrace(); }
		 * 
		 * System.out.println(list.get(0));
		 */
		
		CourseVo vo = new CourseVo();
//		vo.setTitle("플라잉 요가");
//		vo.setuNum(101);
//		vo.setDscrt("다이어트요가");
//		vo.setMaterial("요가매트");
//		vo.setImgPath("C:\\IMAGES\\yoga.jpg");
//		vo.setSeq1(1);
//		vo.setSeq2(2);
//		vo.setSeq3(3);
//		vo.setSeq4(4);
//		vo.setSeq5(5);
//		vo.setSeq6(6);
//		vo.setSeq7(7);
//		vo.setSeq8(8);
//		
		CourseService service = new CourseServiceImpl();
//		
//		try {
//			service.makeCourse(vo);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		vo.setCrsNum(1);
		
		try {
			CourseVo list = service.selectOne(vo);
			System.out.println(list.getTitle());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
