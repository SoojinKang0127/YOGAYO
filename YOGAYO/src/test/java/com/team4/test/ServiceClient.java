package com.team4.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
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
import com.team4.dao.admin.AdminServiceImpl;
import com.team4.dao.course.CourseDAO;
import com.team4.dao.course.CourseService;
import com.team4.dao.course.CourseServiceImpl;
import com.team4.vo.AdminVo;
import com.team4.vo.CourseVo;
import com.team4.dao.feed.FeedServiceImpl;
import com.team4.vo.FeedVo;
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.resource.Rcontroller;
import com.team4.vo.PoseVo;

import com.team4.vo.UserVo;

//import com.team4.dao.Dao;
//import com.team4.vo.Vo;

public class ServiceClient extends Rcontroller {

	public static void main(String[] args) throws Exception {
		CourseServiceImpl cservice= new CourseServiceImpl();
		HashMap<String, Object> map= new HashMap<String, Object>();
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		map.put("list",a);
		map.put("number",3);
		List<CourseVo> c=cservice.selectMoreCourse(map);
		System.out.println(c.toString());

	}

}