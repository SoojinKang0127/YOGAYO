package com.team4.test;

import java.sql.Date;
import java.util.List;

import com.team4.user.dao.UserDAO;
import com.team4.user.dao.UserDAOImpl;
import com.team4.user.dao.UserServiceImpl;
import com.team4.vo.UserVo;

//import com.team4.dao.Dao;
//import com.team4.vo.Vo;

public class ServiceClient {

	public static void main(String[] args) {
		
	
		try {
			UserDAO dao = new UserDAOImpl();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("[SAervu=iceClient / main ]"+ e.toString());
		}
		
	}

}
