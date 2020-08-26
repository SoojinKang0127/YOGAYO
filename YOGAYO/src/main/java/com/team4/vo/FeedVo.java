package com.team4.vo;

import java.sql.Date;

public class FeedVo {
	
	int fNum;
	int uNum;
	int crsNum;
	int sLevel;
	int dLevel;
	String context;
	String uImg1;
	String uImg2;
	String uImg3;
	int weight;
	String regDate;
	
	public FeedVo() {
		// TODO Auto-generated constructor stub
	}

	public FeedVo(int fNum, int nNum, int crsNum, int sLevel, int dLevel, String context, String uImg1, String uImg2,
			String uImg3, int weight, String regDate) {
		super();
		this.fNum = fNum;
		this.nNum = nNum;
		this.crsNum = crsNum;
		this.sLevel = sLevel;
		this.dLevel = dLevel;
		this.context = context;
		this.uImg1 = uImg1;
		this.uImg2 = uImg2;
		this.uImg3 = uImg3;
		this.weight = weight;
		this.regDate = regDate;
	}

	public int getfNum() {
		return fNum;
	}

	public void setfNum(int fNum) {
		this.fNum = fNum;
	}

	public int getnNum() {
		return nNum;
	}

	public void setnNum(int nNum) {
		this.nNum = nNum;
	}

	public int getCrsNum() {
		return crsNum;
	}

	public void setCrsNum(int crsNum) {
		this.crsNum = crsNum;
	}

	public int getsLevel() {
		return sLevel;
	}

	public void setsLevel(int sLevel) {
		this.sLevel = sLevel;
	}

	public int getdLevel() {
		return dLevel;
	}

	public void setdLevel(int dLevel) {
		this.dLevel = dLevel;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getuImg1() {
		return uImg1;
	}

	public void setuImg1(String uImg1) {
		this.uImg1 = uImg1;
	}

	public String getuImg2() {
		return uImg2;
	}

	public void setuImg2(String uImg2) {
		this.uImg2 = uImg2;
	}

	public String getuImg3() {
		return uImg3;
	}

	public void setuImg3(String uImg3) {
		this.uImg3 = uImg3;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "FeedVo [fNum=" + fNum + ", nNum=" + nNum + ", crsNum=" + crsNum + ", sLevel=" + sLevel + ", dLevel="
				+ dLevel + ", context=" + context + ", uImg1=" + uImg1 + ", uImg2=" + uImg2 + ", uImg3=" + uImg3
				+ ", weight=" + weight + ", regDate=" + regDate + "]";
	}
	
	

}
