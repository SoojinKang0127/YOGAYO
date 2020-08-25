package com.team4.pose.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.team4.dao.pose.PoseServiceImpl;
import com.team4.vo.PoseVo;

public class JavaJson{

	public static void main(String[] args) {
		
	JSONParser parser = new JSONParser();
	PoseServiceImpl service= new PoseServiceImpl();
	try {
		JSONObject obj =(JSONObject) parser.parse(new FileReader("c:\\pose_eng.json"));
		
	
		
		
		
		for(int i=0;i<71;i++) {
			JSONObject obj2=(JSONObject) obj.get(Integer.toString(i));
			String title=(String) obj2.get("title");
			String imgPath=(String)	obj2.get("image");
			
			PoseVo vo=new PoseVo();
			vo.setpNum(i);
			vo.setTitle(title);
			vo.setImgPath(imgPath);
			System.out.println(vo.toString());
			try {
				service.poseDefaultSet(vo);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
				
		

		
		
		
		
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	//json 불러왔어 파일을
	
	// json 을 파싱한다 -> 파일을 불러왔다해서 이게 json 형태로 바로 알아먹는게 X , 너가 json 형태로 다시 데이터를 만들어줘야되는거야
	
	//json 형태로 만든후에는 key-> value접근해서 title,번호 키를 통해서 db에 title값, 번호값을 넣는거지
	
	
	
}
}