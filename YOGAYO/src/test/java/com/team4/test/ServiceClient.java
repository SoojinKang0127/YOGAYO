package com.team4.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.TagException;

import com.team4.user.dao.UserDAO;
import com.team4.user.dao.UserDAOImpl;
import com.team4.user.dao.UserServiceImpl;
import com.team4.user.dao.UserDAO;
import com.team4.user.dao.UserDAOImpl;
import com.team4.dao.course.CourseDAO;
import com.team4.dao.course.CourseService;
import com.team4.dao.course.CourseServiceImpl;
import com.team4.vo.CourseVo;
import com.team4.dao.feed.FeedServiceImpl;
import com.team4.vo.FeedVo;
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.vo.PoseVo;

import com.team4.vo.UserVo;

//import com.team4.dao.Dao;
//import com.team4.vo.Vo;

public class ServiceClient {
		
	public static void main(String[] args) {
		PoseServiceImpl service= new PoseServiceImpl();
		for(int i=0;i<71;i++) {
		File file = new File("C:\\audio\\pose"+i+".mp3");
		String path="C:\\audio\\pose"+i+".mp3";
		PoseVo vo= new PoseVo();
		
		try {
			MP3File mp3 = (MP3File) AudioFileIO.read(file);
			mp3.getAudioHeader().getTrackLength();
			vo.setAudioPath(path);
			vo.setTime(mp3.getAudioHeader().getTrackLength());
			vo.setpNum(i);
			try {
				service.update(vo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(mp3.getAudioHeader().getTrackLength());
		} catch (CannotReadException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (TagException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ReadOnlyFileException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvalidAudioFrameException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}

//		FileInputStream fileInputStream = null;
//		long duration = 0;
//
//		try {
//		    fileInputStream = new FileInputStream(file);
//		} catch (FileNotFoundException e) {
//		    e.printStackTrace();
//		}
//
//		try {
//		    duration = Objects.requireNonNull(fileInputStream).getChannel().size() / 128;
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
//		long size= file.length();
	  
	}
	
	public static void test(String[] args) {
	//	Dao dao = new Dao();

	//	Vo vo = new Vo();
	//	vo.setNo(13); 
	//	vo.setName("ㄴㄴㄴ");
//
		//dao.insert(vo);
		
//		vo.setNo(200);
		
		// 쿼리문을 만든다 -> dao에 함수를 만든다 -> 
		
		
		UserDAO dao = new UserDAOImpl();
//		
//		UserVo vo = new UserVo();
//		vo.setId("11");
//		vo.setPwd("11");
//		vo.setName("11");
//		vo.setbDate(new Date(19910705));
//		vo.setGender('F');
//		
//		
//		try {
//			dao.signUp(vo);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		/*
		 * List<String> list = null;
		 * 
		 * try {
		 * 
		 * list = dao.selectAllId(); } catch (Exception e) { e.printStackTrace(); }
		 * 
		 * System.out.println(list.get(0));
		 */
		
		CourseVo vo = new CourseVo();
//		vo.setTitle("플라잉 요가");
//		vo.setuNum(101);
//		vo.setDscrt("다이어트요가");
//		vo.setMaterial("요가매트");
//		vo.setImgPath("C:\\IMAGES\\yoga.jpg");
//		vo.setSeq1(1);
//		vo.setSeq2(2);
//		vo.setSeq3(3);
//		vo.setSeq4(4);
//		vo.setSeq5(5);
//		vo.setSeq6(6);
//		vo.setSeq7(7);
//		vo.setSeq8(8);
//		
		CourseService cservice = new CourseServiceImpl();
//		
//		try {
//			service.makeCourse(vo);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		/*
		 * vo.setCrsNum(1);
		 * 
		 * try { CourseVo list = service.selectOne(vo);
		 * System.out.println(list.getTitle()); } catch (Exception e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
	
		try {
			UserDAO bdao = new UserDAOImpl();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("[SAervu=iceClient / main ]"+ e.toString());
		}
		
			//List<CourseVo> courses = cservice.selectAll();
//			System.out.println(courses.get(0).getTitle());
//			System.out.println(courses.get(1).getTitle());
//			System.out.println(courses.get(2).getTitle());
//			System.out.println(courses.get(3).getTitle());
//			System.out.println(courses.get(4).getTitle());
			

		
//		List<String> list = null;
//		
//		try {
//			
//			list = dao.selectAllId();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(list.get(0));
		
		PoseVo avo = new PoseVo();
		PoseServiceImpl aservice = new PoseServiceImpl();
		avo.setpNum(3);
		
		try {
			PoseVo list = aservice.poseSelect(avo);
			System.out.println(list.getTitle());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		List<String> list = null;
//		
//		try {
//			
//			list = dao.selectAllId();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(list.get(0));


//		FeedServiceImpl ser = new FeedServiceImpl();
//		FeedVo vo = new FeedVo();
//
//		vo.setuNum(1001);
//		vo.setCrsNum(20);
//		vo.setsLevel(5);
//		vo.setdLevel(4);
//		vo.setContext("오늘 이 요가 코스는 정말 짱이었다!");
//		vo.setuImg1("img주소");
//		vo.setWeight(20);
//		
//		try {
//			ser.upload(vo);
//			System.out.println("들어감");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
