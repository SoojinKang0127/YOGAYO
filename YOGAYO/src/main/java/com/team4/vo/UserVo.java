package com.team4.vo;

import java.sql.Date;

public class UserVo {

	int uNum;
	String id;
	String pwd;
	String name;
	Date bDate;
	char gender;
	String img;
	Date regDate;
	
	public UserVo() {
	}
	
	

	public UserVo(int uNum, String id, String pwd, String name, Date bDate, char gender, String img, Date regDate) {
		super();
		this.uNum = uNum;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.bDate = bDate;
		this.gender = gender;
		this.img = img;
		this.regDate = regDate;
	}



	@Override
	public String toString() {
		return "UserVo [uNum=" + uNum + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", bDate=" + bDate
				+ ", gender=" + gender + ", img=" + img + ", regDate=" + regDate + "]";
	}

	public int getuNum() {
		return uNum;
	}

	public void setuNum(int uNum) {
		this.uNum = uNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getbDate() {
		return bDate;
	}

	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}



}
