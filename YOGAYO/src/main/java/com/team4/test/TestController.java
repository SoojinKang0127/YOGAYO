package com.team4.test;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class TestController {
	
	@RequestMapping(value="/test", method= RequestMethod.POST)
	public void aaa(MultipartHttpServletRequest multi, @RequestParam(value="title")String title2, HttpServletRequest req)  {
		String title = multi.getParameter("title");
		System.out.println("title: " + title);
		MultipartFile mf = multi.getFile("coursethumbnail");
		File file = new File(mf.getOriginalFilename());
		System.out.println(file);
	}

}
