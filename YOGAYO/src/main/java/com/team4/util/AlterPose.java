package com.team4.util;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;

import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.TagException;

import com.team4.dao.pose.PoseServiceImpl;
import com.team4.vo.PoseVo;

public class AlterPose {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, CannotReadException,
			TagException, ReadOnlyFileException, InvalidAudioFrameException {


		PoseServiceImpl service = new PoseServiceImpl();
		for (int i = 0; i < 71; i++) {
			String path = "C:\\Users\\Kosmo_24\\Documents\\GitHub\\YOGAYO\\YOGAYO\\src\\main\\webapp\\resources\\audio\\pose"+i+".mp3";
			File file = new File(path);
			MP3File mp3 = (MP3File) AudioFileIO.read(file);
			PoseVo vo = new PoseVo();
			String audioPath = "resources/audio/pose" + i + ".mp3";
			vo.setpNum(i);
			vo.setTime(mp3.getMP3AudioHeader().getTrackLength());
			vo.setAudioPath(audioPath);
			try {
				service.update(vo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
