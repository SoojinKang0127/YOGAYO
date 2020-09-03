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
import com.team4.dao.admin.AdminServiceImpl;
import com.team4.dao.course.CourseDAO;
import com.team4.dao.course.CourseService;
import com.team4.dao.course.CourseServiceImpl;
import com.team4.vo.AdminVo;
import com.team4.vo.CourseVo;
import com.team4.dao.feed.FeedServiceImpl;
import com.team4.vo.FeedVo;
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.vo.PoseVo;

import com.team4.vo.UserVo;

//import com.team4.dao.Dao;
//import com.team4.vo.Vo;

public class ServiceClient {
	
	public static void main(String[] args) throws Exception {
		
		AdminServiceImpl service = new AdminServiceImpl();
		
		List<AdminVo> list = service.getAllComment();
		
	
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
			

		
		
		
		
		service.commentCount(cv);
		
		System.out.println(service.commentCount(cv));
	}
	
}

