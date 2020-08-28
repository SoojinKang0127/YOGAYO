package com.team4.vo;

import java.sql.Date;

public class PoseVo {
	int  pNum;
	String img_Path;
	String title;
	String audio_Path;
	String time;
	int difficulty;
	Date regDate;
	
	
	public PoseVo() {}


	public PoseVo(int pNum, String img_Path, String title, String audioPath, String time, int difficulty, Date regDate) {
		this.pNum = pNum;
		this.img_Path = img_Path;
		this.title = title;
		this.audio_Path = audioPath;
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


	public String getImg_Path() {
		return img_Path;
	}


	public void setImgPath(String img_Path) {
		this.img_Path = img_Path;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAudioPath() {
		return audio_Path;
	}


	public void setAudioPath(String audioPath) {
		this.audio_Path = audioPath;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
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
		return "PoseVo [pNum=" + pNum + ", imgPath=" + img_Path + ", title=" + title + ", audioPath=" + audio_Path
				+ ", time=" + time + ", difficulty=" + difficulty + ", regDate=" + regDate + "]";
	}

	
	
	
}
