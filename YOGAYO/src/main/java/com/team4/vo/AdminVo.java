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
	String id;
	String statement;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	String img;
	String name;
	
	String crsTitle;
	String crsDscrt;
	String material;
	
	
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	public String getpTitle() {
		return pTitle;
	}
	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	int seq1Num;
	int seq2Num;
	int seq3Num;
	int seq4Num;
	int seq5Num;
	int seq6Num;
	int seq7Num;
	int seq8Num;
	
	String seq1Title;
	String seq2Title;
	String seq3Title;
	String seq4Title;
	String seq5Title;
	String seq6Title;
	String seq7Title;
	String seq8Title;
	
	int pNum;
	String pTitle;
	int time;
	int difficulty;
	
	
	
	public String getCrsTitle() {
		return crsTitle;
	}
	public void setCrsTitle(String crsTitle) {
		this.crsTitle = crsTitle;
	}
	public String getCrsDscrt() {
		return crsDscrt;
	}
	public void setCrsDscrt(String crsDscrt) {
		this.crsDscrt = crsDscrt;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getSeq1Num() {
		return seq1Num;
	}
	public void setSeq1Num(int seq1Num) {
		this.seq1Num = seq1Num;
	}
	public int getSeq2Num() {
		return seq2Num;
	}
	public void setSeq2Num(int seq2Num) {
		this.seq2Num = seq2Num;
	}
	public int getSeq3Num() {
		return seq3Num;
	}
	public void setSeq3Num(int seq3Num) {
		this.seq3Num = seq3Num;
	}
	public int getSeq4Num() {
		return seq4Num;
	}
	public void setSeq4Num(int seq4Num) {
		this.seq4Num = seq4Num;
	}
	public int getSeq5Num() {
		return seq5Num;
	}
	public void setSeq5Num(int seq5Num) {
		this.seq5Num = seq5Num;
	}
	public int getSeq6Num() {
		return seq6Num;
	}
	public void setSeq6Num(int seq6Num) {
		this.seq6Num = seq6Num;
	}
	public int getSeq7Num() {
		return seq7Num;
	}
	public void setSeq7Num(int seq7Num) {
		this.seq7Num = seq7Num;
	}
	public int getSeq8Num() {
		return seq8Num;
	}
	public void setSeq8Num(int seq8Num) {
		this.seq8Num = seq8Num;
	}
	public String getSeq1Title() {
		return seq1Title;
	}
	public void setSeq1Title(String seq1Title) {
		this.seq1Title = seq1Title;
	}
	public String getSeq2Title() {
		return seq2Title;
	}
	public void setSeq2Title(String seq2Title) {
		this.seq2Title = seq2Title;
	}
	public String getSeq3Title() {
		return seq3Title;
	}
	public void setSeq3Title(String seq3Title) {
		this.seq3Title = seq3Title;
	}
	public String getSeq4Title() {
		return seq4Title;
	}
	public void setSeq4Title(String seq4Title) {
		this.seq4Title = seq4Title;
	}
	public String getSeq5Title() {
		return seq5Title;
	}
	public void setSeq5Title(String seq5Title) {
		this.seq5Title = seq5Title;
	}
	public String getSeq6Title() {
		return seq6Title;
	}
	public void setSeq6Title(String seq6Title) {
		this.seq6Title = seq6Title;
	}
	public String getSeq7Title() {
		return seq7Title;
	}
	public void setSeq7Title(String seq7Title) {
		this.seq7Title = seq7Title;
	}
	public String getSeq8Title() {
		return seq8Title;
	}
	public void setSeq8Title(String seq8Title) {
		this.seq8Title = seq8Title;
	}

	
	
	
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
		return "AdminVo [crsNum=" + crsNum + ", img=" + img + ", name=" + name + ", crsTitle=" + crsTitle
				+ ", crsDscrt=" + crsDscrt + ", material=" + material + ", seq1Num=" + seq1Num + ", seq2Num=" + seq2Num
				+ ", seq3Num=" + seq3Num + ", seq4Num=" + seq4Num + ", seq5Num=" + seq5Num + ", seq6Num=" + seq6Num
				+ ", seq7Num=" + seq7Num + ", seq8Num=" + seq8Num + "]";
	}
	
	


	
	
	
	
	
	
	
	
	
	
}
