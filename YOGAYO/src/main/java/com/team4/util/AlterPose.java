package com.team4.util;

import com.team4.dao.pose.PoseServiceImpl;
import com.team4.vo.PoseVo;

public class AlterPose {

	public static void main(String[] args) {
		PoseServiceImpl service= new PoseServiceImpl();
		
		for(int i=0;i<71;i++) {
			PoseVo vo = new PoseVo();
			String audioPath= "resources/audio/pose/"+i+".mp3";
			vo.setpNum(i);
			vo.setAudioPath(audioPath);
			try {
				service.update(vo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
	}
}
