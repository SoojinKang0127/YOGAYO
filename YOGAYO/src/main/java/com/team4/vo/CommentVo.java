package com.team4.vo;

import java.sql.Date;

public class CommentVo {
	int cmtNum;
	int uNum;
	int crsNum;
	int rate;
	String context;
	int parent;
	Date regDate;

	public int getCmtNum() {
		return cmtNum;
	}

	public void setCmtNum(int cmtNum) {
		this.cmtNum = cmtNum;
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

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "{\"cmtNum\":" + cmtNum + ", \"uNum\":" + uNum + ", \"crsNum\":" + crsNum + ", \"rate\":" + rate + ", \"context\":"
				+ "\""+context+"\"" + ", \"parent\":" + parent + ", \"regDate\":" +"\""+ regDate+"\"" + ",";
	}

}
