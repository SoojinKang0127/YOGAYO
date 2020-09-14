package com.team4.vo;

public class LikeVo {
	
	int lNum;
	int uNum;
	int crsNum;
	String regDate;
	
	public int getlNum() {
		return lNum;
	}
	public void setlNum(int lNum) {
		this.lNum = lNum;
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
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "LikeVo [lNum=" + lNum + ", uNum=" + uNum + ", crsNum=" + crsNum + ", regDate=" + regDate + "]";
	}
	
	

}
