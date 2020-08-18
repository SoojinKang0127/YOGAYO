package com.team4.vo;

public class UserVo {
	
	
	private String userId;
	private int password;
	
	
	public UserVo() {
	}
	
	
	
	public UserVo(String userId, int password) {
		this.userId = userId;
		this.password = password;
	}

	


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "UserDao [userId=" + userId + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	
	

}
