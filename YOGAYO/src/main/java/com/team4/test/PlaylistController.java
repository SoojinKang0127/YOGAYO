package com.team4.test;


import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bson.json.JsonWriter;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.ParsedSql;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mysql.cj.xdevapi.JsonArray;
import com.mysql.cj.xdevapi.JsonParser;
import com.team4.dao.pose.PoseDAO;
import com.team4.dao.pose.PoseDAOImpl;
import com.team4.dao.pose.PoseService;
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.resource.R;
import com.team4.util.UserAuthCheck;
import com.team4.vo.PoseVo;
import com.team4.vo.UserVo;




@Controller
public class PlaylistController implements R {
	
	private static final Logger logger = LoggerFactory.getLogger(PlaylistController.class);


	PoseServiceImpl service = new PoseServiceImpl();
	
	
	@RequestMapping(value = "/course_playlist", method = RequestMethod.GET)
	public String course_playlist(Model model,
			HttpServletResponse res,HttpServletRequest req
			) throws IOException {
		UserAuthCheck.loginCheck(req, res, model);
		model.addAttribute("user",(UserVo)req.getSession().getAttribute("user"));
		
		return "course_playlist";
	}
	
	@RequestMapping(value = "/course_playlist", method = RequestMethod.POST) 
	public void playListAJAX(@RequestParam("pose")String pose, HttpServletResponse res, Model model,
			HttpSession session, HttpServletRequest req) throws IOException {
		//pose로 db를 셀렉해오는 dao를 만들어서 그 값들을 json형태로 바꾼다음에 res통해 view로 전달
		
		session = req.getSession();
		
		PoseService dao = new PoseServiceImpl();
		JsonArray jsonarr = new JsonArray();
		JSONObject jsonobj = new JSONObject();
		
		List<PoseVo> list =null;
		
		try {
			list=dao.poseSelectAll();

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		JSONObject listObj= new JSONObject();
		int k=0;
		for(PoseVo vo:list) {
			JSONObject obj = new JSONObject();
			obj.put("pnum", vo.getpNum());
			obj.put("imgPath", vo.getImg_Path());
			obj.put("title", vo.getTitle());
			obj.put("audioPath", vo.getAudioPath());
			obj.put("time", vo.getTime());
			obj.put("difficulty", vo.getDifficulty());
			listObj.put(Integer.toString(k),obj);
			DBCollection poseDB = mongoDBf.getCollection("POSE");
			BasicDBObject myQuery = new BasicDBObject("_id", vo.getpNum());
			BasicDBObject field = new BasicDBObject("keyword", 1);
			DBCursor Cursor = poseDB.find(myQuery, field);
			DBObject myobj = Cursor.next();
			List<String> myList = (List<String>) myobj.get("keyword");
			String keyword =myList.get(0);
			if(myList.size()>1) {
				keyword+=", "+myList.get(1);
			}
			if(keyword.equals("")) {
				keyword="";
			}
			System.out.println(keyword);
			obj.put("keyword",keyword);
			k++;
		}	
		String msg= listObj.toString();
		
		
		res.getWriter().write(msg);
		
	}
	
}
				
	
	
	
	
	
	
	


