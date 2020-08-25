package com.team4.vo;

import java.sql.Date;

public class PoseVo {
	int  pNum;
	String imgPath;
	String title;
	String audioPath;
	int time;
	int difficulty;
	Date regDate;
	
	
	public PoseVo() {}


	public PoseVo(int pNum, String imgPath, String title, String audioPath, int time, int difficulty, Date regDate) {
		this.pNum = pNum;
		this.imgPath = imgPath;
		this.title = title;
		this.audioPath = audioPath;
		this.time = time;
		this.difficulty = difficulty;
		this.regDate = regDate;
	}


	public int getpNum() {
		return pNum;
	}


	public void setpNum(int pNum) {
		this.pNum = pNum;
	}


	public String getImgPath() {
		return imgPath;
	}


	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAudioPath() {
		return audioPath;
	}


	public void setAudioPath(String audioPath) {
		this.audioPath = audioPath;
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


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	@Override
	public String toString() {
		return "PoseVo [pNum=" + pNum + ", imgPath=" + imgPath + ", title=" + title + ", audioPath=" + audioPath
				+ ", time=" + time + ", difficulty=" + difficulty + ", regDate=" + regDate + "]";
	}

	
	
	
}
