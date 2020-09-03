package com.team4.vo;

import java.sql.Date;

public class AdminVo {
	
	Date regDate;
	int uNum;
	int crsNum;
	int rate;
	String context;
	int parent;
	int cmtNum;
	
	String img;
	String name;
	
	
	public int getCmtNum() {
		return cmtNum;
	}
	public void setCmtNum(int cmtNum) {
		this.cmtNum = cmtNum;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getuNum() {
		return uNum;
	}
	public void setuNum(int uNum) {
		this.uNum = uNum;
	}
	public int getCrsNum() {
		return crsNum;
	}
	public void setCrsNum(int crsNum) {
		this.crsNum = crsNum;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "AdminVo [regDate=" + regDate + ", uNum=" + uNum + ", crsNum=" + crsNum + ", rate=" + rate + ", context="
				+ context + ", parent=" + parent + ", cmtNum=" + cmtNum + ", img=" + img + ", name=" + name + "]";
	}

	
	
	
	
	
	
	
	
	
	
}
