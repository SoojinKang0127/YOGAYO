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
<<<<<<< HEAD
import com.team4.user.dao.UserDAOImpl;
import com.team4.dao.course.CourseDAO;
import com.team4.dao.course.CourseService;
import com.team4.dao.course.CourseServiceImpl;
=======
import com.team4.dao.admin.AdminServiceImpl;
import com.team4.dao.course.CourseDAO;
import com.team4.dao.course.CourseService;
import com.team4.dao.course.CourseServiceImpl;
import com.team4.vo.AdminVo;
>>>>>>> master
import com.team4.vo.CourseVo;
import com.team4.dao.feed.FeedServiceImpl;
import com.team4.vo.FeedVo;
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.vo.PoseVo;

import com.team4.vo.UserVo;

//import com.team4.dao.Dao;
//import com.team4.vo.Vo;

public class ServiceClient {
<<<<<<< HEAD
		
	public static void main(String[] args) {
		
		UserVo vo = new UserVo();
		vo.setuNum(1008);

		
		UserServiceImpl service = new UserServiceImpl();
		try {
//			System.out.println(	service.tWeight(vo));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
=======
	
	public static void test2(String[] args) throws Exception {
		
		AdminServiceImpl service = new AdminServiceImpl();
		
		List<AdminVo> list = service.getAllComment();
	}
		
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
	
	
}

>>>>>>> master
