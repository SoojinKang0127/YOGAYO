package com.team4.vo;

import java.sql.Date;

public class PoseVo {
	int  pNum;
	String img_Path;
	String title;
	String audio_Path;
	int time;
	int difficulty;
	Date regDate;
	
	
	public PoseVo() {}


	public int getpNum() {
		return pNum;
	}


	public void setpNum(int pNum) {
		this.pNum = pNum;
	}


	public String getImg_Path() {
		return img_Path;
	}


	public void setImg_Path(String img_Path) {
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


	public void setAudioPath(String audio_Path) {
		this.audio_Path = audio_Path;
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


	public PoseVo(int pNum, String img_Path, String title, String audio_Path, int time, int difficulty, Date regDate) {
		super();
		this.pNum = pNum;
		this.img_Path = img_Path;
		this.title = title;
		this.audio_Path = audio_Path;
		this.time = time;
		this.difficulty = difficulty;
		this.regDate = regDate;
	}


	@Override
	public String toString() {
		return "PoseVo [pNum=" + pNum + ", img_Path=" + img_Path + ", title=" + title + ", audio_Path=" + audio_Path
				+ ", time=" + time + ", difficulty=" + difficulty + ", regDate=" + regDate + "]";
	}

	
	
	
	
}
