package com.team4.vo;

import java.sql.Date;

public class CourseVo {
	int crsNum;
	String title;
	int uNum;
	String dscrt;
	String material;
	String imgPath;
	int seq1;
	int seq2;
	int seq3;
	int seq4;
	int seq5;
	int seq6;
	int seq7;
	int seq8;
	Date regDate;
	String total;
	String totalComment;
	
	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getTotalComment() {
		return totalComment;
	}

	public void setTotalComment(String totalComment) {
		this.totalComment = totalComment;
	}
	public int getCrsNum() {
		return crsNum;
	}

	public void setCrsNum(int crsNum) {
		this.crsNum = crsNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getuNum() {
		return uNum;
	}

	public void setuNum(int uNum) {
		this.uNum = uNum;
	}

	public String getDscrt() {
		return dscrt;
	}

	public void setDscrt(String dscrt) {
		this.dscrt = dscrt;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public int getSeq1() {
		return seq1;
	}

	public void setSeq1(int seq1) {
		this.seq1 = seq1;
	}

	public int getSeq2() {
		return seq2;
	}

	public void setSeq2(int seq2) {
		this.seq2 = seq2;
	}

	public int getSeq3() {
		return seq3;
	}

	public void setSeq3(int seq3) {
		this.seq3 = seq3;
	}

	public int getSeq4() {
		return seq4;
	}

	public void setSeq4(int seq4) {
		this.seq4 = seq4;
	}

	public int getSeq5() {
		return seq5;
	}

	public void setSeq5(int seq5) {
		this.seq5 = seq5;
	}

	public int getSeq6() {
		return seq6;
	}

	public void setSeq6(int seq6) {
		this.seq6 = seq6;
	}

	public int getSeq7() {
		return seq7;
	}

	public void setSeq7(int seq7) {
		this.seq7 = seq7;
	}

	public int getSeq8() {
		return seq8;
	}

	public void setSeq8(int seq8) {
		this.seq8 = seq8;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "{\"crsNum\":" + crsNum + ", \"title\":" + title + ", \"uNum\":" + uNum + ", \"dscrt\":" + dscrt
				+ ", \"material\":" + material + ", \"imgPath\":" + imgPath + ", \"seq1\":" + seq1 + ", \"seq2\":"
				+ seq2 + ", \"seq3\":" + seq3 + ", \"seq4\":" + seq4 + ", \"seq5\":" + seq5 + ", \"seq6\":" + seq6
				+ ", \"seq7\":" + seq7 + ", \"seq8\":" + seq8 + ", \"regDate\":" + regDate + "}";

	}
	
	public String toString2() {
		return "{\"crsNum\":" + crsNum + ", \"title\":" +"\"" +title +"\""+ ", \"uNum\":" + uNum + ", \"dscrt\":" + "\""+dscrt+"\""
				+ ", \"material\":" + "\""+material+"\"" + ", \"imgPath\":" + "\""+imgPath+"\"" + ", \"seq1\":" + seq1 + ", \"seq2\":"
				+ seq2 + ", \"seq3\":" + seq3 + ", \"seq4\":" + seq4 + ", \"seq5\":" + seq5 + ", \"seq6\":" + seq6
				+ ", \"seq7\":" + seq7 + ", \"seq8\":" + seq8 + ", \"regDate\":" + "\""+regDate +"\""+ "}";

	}

}
