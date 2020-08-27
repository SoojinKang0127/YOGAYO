package com.team4.test;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

import org.bson.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.team4.user.dao.UserDAO;
import com.team4.user.dao.UserDAOImpl;
import com.team4.user.dao.UserServiceImpl;
import com.team4.vo.UserVo;

@Controller
public class SignUpController {

	UserServiceImpl service = new UserServiceImpl();
	UserDAO dao = new UserDAOImpl();

	@RequestMapping(value = "/sign-up", method = RequestMethod.GET)
	public String signUp(Locale locale, Model model) {

		return "sign-up";
	}

	@RequestMapping(value = "/sign-up", method = RequestMethod.POST)
	public String signUp1(Model model, @RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("bDate") Date date, @RequestParam("pwd") String pwd, @RequestParam("gender") char gender,@RequestParam("keyword")String keyword) {
		
		
		String[] keywordArr=keyword.split(",");
		UserVo vo = new UserVo();
		vo.setId(id);
		vo.setName(name);
		vo.setPwd(pwd);
		vo.setbDate(date);
		vo.setGender(gender);
		try {
			service.signUp(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int i=service.getUNum(vo);
		List<String> mongoList= new ArrayList<String>();
		for(String s:keywordArr) {
			mongoList.add(s);
		}
		MongoClientURI uri = new MongoClientURI(
	            "mongodb+srv://user:12345@cluster0.9bcza.mongodb.net/test?retryWrites=true&w=majority");
	    MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase project = mongoClient.getDatabase("project");
		MongoCollection<Document> collection = project.getCollection("USER");
		Document doc= new Document("_id",i).append("keyword", mongoList  );
        collection.insertOne(doc);
		
		String errMessage = "가입을 축하합니다. 로그인을 해주세요!";
		model.addAttribute("errMessage", errMessage);
		return "login";
	}

	@RequestMapping(value = "/checkDuplication", method = RequestMethod.POST)
	public void checkDuplication(Locale locale, Model model, HttpServletResponse res,
			@RequestParam("email") String email) {

		// pose로 db를 셀렉해오는 dao를 만들어서 그 값들을 json형태로 바꾼다음에 res통해 view로 전달
		UserVo vo = new UserVo();
		vo.setId(email);
		UserVo result = null;
		try {
			result = service.checkDuplication(vo);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		if (result == null) {
			try {
				res.getWriter().write("0");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				res.getWriter().write("1");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
