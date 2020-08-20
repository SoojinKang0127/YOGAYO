package com.team4.test;

import com.team4.dao.Dao;
import com.team4.vo.Vo;

public class ServiceClient {

	public static void main(String[] args) {
		Dao dao = new Dao();

		Vo vo = new Vo();
		vo.setNo(13);
		vo.setName("ㄴㄴㄴ");
//
		dao.insert(vo);
		
//		vo.setNo(200);
		
		// 쿼리문을 만든다 -> dao에 함수를 만든다 -> 
		

		
		

	}

}
