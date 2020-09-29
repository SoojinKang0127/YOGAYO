package com.team4.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.team4.dao.course.CourseServiceImpl;
import com.team4.dao.feed.FeedServiceImpl;
import com.team4.dao.like.LikeServiceImpl;
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.resource.R;
import com.team4.user.dao.UserServiceImpl;
import com.team4.util.UserAuthCheck;
import com.team4.vo.CourseVo;
import com.team4.vo.FeedVo;
import com.team4.vo.LikeVo;
import com.team4.vo.PoseVo;
import com.team4.vo.UserVo;
@Controller
public class PlayerController implements R {
	MongoClient mongoClient = new MongoClient(uri);
	FeedVo vo = new FeedVo();
	
	CourseVo resultCvo = null;
	CourseVo cvo = null;
	PoseVo resultPvo1 = null;
	PoseVo resultPvo2 = null;
	PoseVo resultPvo3 = null;
	PoseVo resultPvo4 = null;
	PoseVo resultPvo5 = null;
	PoseVo resultPvo6 = null;
	PoseVo resultPvo7 = null;
	PoseVo resultPvo8 = null;
	UserVo uvo = null;

	@RequestMapping(value = "/player", method = RequestMethod.GET)
	public String player(HttpServletRequest req, @RequestParam("course") String course, Model model,HttpServletResponse res) {
		UserAuthCheck.loginCheck(req, res, model);
		FeedServiceImpl fservice = new FeedServiceImpl();
		CourseServiceImpl cservice = new CourseServiceImpl();
		PoseServiceImpl pservice = new PoseServiceImpl();
		LikeServiceImpl lservice = new LikeServiceImpl();
		UserServiceImpl uservice = new UserServiceImpl();
		cvo = new CourseVo();
		int no = Integer.parseInt(course);
		cvo.setCrsNum(no);
		uvo = (UserVo) req.getSession().getValue("user");
		LikeVo lvo = new LikeVo();
		lvo.setCrsNum(no);
		lvo.setuNum(uvo.getuNum());
		int likeFlag = 0;
		int likeCount = 0;
		String userName = "";
		int playTotal = 0;

		try {
			likeFlag = lservice.likeOrNot(lvo);
			likeCount = lservice.likeCount(lvo);
			playTotal = fservice.playTotal(cvo);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		if (likeFlag == 1) {
			model.addAttribute("like", "fas fa-heart");
		} else {
			model.addAttribute("like", "far fa-heart");
		}
		model.addAttribute("likeCount", likeCount);

		try {
			resultCvo = cservice.selectOne(cvo);
			userName = uservice.getUName(resultCvo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int poseNo1 = resultCvo.getSeq1();
		int poseNo2 = resultCvo.getSeq2();
		int poseNo3 = resultCvo.getSeq3();
		int poseNo4 = resultCvo.getSeq4();
		int poseNo5 = resultCvo.getSeq5();
		int poseNo6 = resultCvo.getSeq6();
		int poseNo7 = resultCvo.getSeq7();
		int poseNo8 = resultCvo.getSeq8();

		PoseVo pose1 = new PoseVo();
		PoseVo pose2 = new PoseVo();
		PoseVo pose3 = new PoseVo();
		PoseVo pose4 = new PoseVo();
		PoseVo pose5 = new PoseVo();
		PoseVo pose6 = new PoseVo();
		PoseVo pose7 = new PoseVo();
		PoseVo pose8 = new PoseVo();

		pose1.setpNum(poseNo1);
		pose2.setpNum(poseNo2);
		pose3.setpNum(poseNo3);
		pose4.setpNum(poseNo4);
		pose5.setpNum(poseNo5);
		pose6.setpNum(poseNo6);
		pose7.setpNum(poseNo7);
		pose8.setpNum(poseNo8);

		try {
			resultPvo1 = pservice.poseSelect(pose1);
			resultPvo2 = pservice.poseSelect(pose2);
			resultPvo3 = pservice.poseSelect(pose3);
			resultPvo4 = pservice.poseSelect(pose4);
			resultPvo5 = pservice.poseSelect(pose5);
			resultPvo6 = pservice.poseSelect(pose6);
			resultPvo7 = pservice.poseSelect(pose7);
			resultPvo8 = pservice.poseSelect(pose8);
		} catch (Exception e) {
			e.printStackTrace();
		}

		model.addAttribute("course", resultCvo);
		model.addAttribute("pose1", resultPvo1);
		model.addAttribute("pose2", resultPvo2);
		model.addAttribute("pose3", resultPvo3);
		model.addAttribute("pose4", resultPvo4);
		model.addAttribute("pose5", resultPvo5);
		model.addAttribute("pose6", resultPvo6);
		model.addAttribute("pose7", resultPvo7);
		model.addAttribute("pose8", resultPvo8);
		model.addAttribute("uvo", uvo);
		model.addAttribute("crsNum", course);
		model.addAttribute("userName", userName);
		model.addAttribute("playTotal", playTotal);
		model.addAttribute("regDate", resultCvo.getRegDate());

		return "player";
	}

	@RequestMapping(value = "/feedupload", method = RequestMethod.POST)
	public String feedupload(MultipartHttpServletRequest multi, HttpServletRequest req) {
		FeedServiceImpl fservice = new FeedServiceImpl();
		HttpSession session = req.getSession();
		UserVo user = (UserVo) session.getValue("user");
		int uNum = user.getuNum();

		int course = Integer.parseInt(multi.getParameter("course"));
		int slevel = Integer.parseInt(multi.getParameter("slevel"));
		int dlevel = Integer.parseInt(multi.getParameter("dlevel"));
		String context = multi.getParameter("context");
		int weight = Integer.parseInt(multi.getParameter("weight"));

		MultipartFile mf = multi.getFile("file");
		String originalFileName = mf.getOriginalFilename();
		String fileType = originalFileName.substring(originalFileName.lastIndexOf('.'), originalFileName.length());

		String realPath = multi.getRealPath("/");
		String curUserPath = realPath.substring(0, realPath.indexOf(".metadata"));
		curUserPath = curUserPath.replace('\\', '/');
		String path = null;
		if (curUserPath.indexOf("YOGAYO") == -1) {
			path = curUserPath + "YOGAYO/YOGAYO/src/main/webapp/resources/image/feedimages/";
		} else {

			path = curUserPath + "YOGAYO/src/main/webapp/resources/image/feedimages/";
		}
		String projectPath = "resources/image/feedimages/";

		int no = 0;
		try {
			no = fservice.getLastFnum() + 1;
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String safeFile = path + "feed" + Integer.toString(no) + fileType;
		String prjPathandName = projectPath + "feed" + Integer.toString(no) + fileType;

		try {
			mf.transferTo(new File(safeFile));
			System.out.println("파일 들어감");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("오류! 파일 안 들어감");
		}

		vo.setuNum(uNum);
		vo.setCrsNum(course);
		vo.setsLevel(slevel);
		vo.setdLevel(dlevel);
		vo.setContext(context);
		vo.setWeight(weight);
		vo.setuImg1(prjPathandName);

		try {
			fservice.upload(vo);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류! 피드 안 들어감");
		}

		return "mypage";
	}

	@RequestMapping(value = "/likeCourse", method = RequestMethod.POST)
	public void likeCourse(HttpServletResponse res,HttpServletRequest req, @RequestParam("uNum") int uNum,
			@RequestParam("crsNum") int crsNum) {
		LikeServiceImpl lservice = new LikeServiceImpl();
		LikeVo lvo = new LikeVo();
		lvo.setuNum(uNum);
		lvo.setCrsNum(crsNum);
		int count = 0;
		uvo = (UserVo) req.getSession().getValue("user");
		HashSet<String> userkeyword = new HashSet<String>();
		BasicDBObject field = new BasicDBObject("keyword", 1);
		BasicDBObject userQuery = new BasicDBObject();
		BasicDBObject courseQuery = new BasicDBObject();
		BasicDBObject poseQuery1 = new BasicDBObject();
		BasicDBObject poseQuery2 = new BasicDBObject();
		BasicDBObject poseQuery3 = new BasicDBObject();
		BasicDBObject poseQuery4 = new BasicDBObject();
		BasicDBObject poseQuery5 = new BasicDBObject();
		BasicDBObject poseQuery6 = new BasicDBObject();
		BasicDBObject poseQuery7 = new BasicDBObject();
		BasicDBObject poseQuery8 = new BasicDBObject();

		try {
			int flag = lservice.likeOrNot(lvo);
			System.out.println("like"+flag);
			if (flag == 0) {
				lservice.like(lvo);
				DBCollection courseDB = mongoDBf.getCollection("COURSE");
				DBCollection userDB = mongoDBf.getCollection("USER");
				DBCollection poseDB = mongoDBf.getCollection("POSE");

				userQuery.put("_id", uvo.getuNum());
				courseQuery.put("_id", resultCvo.getCrsNum());
				poseQuery1.put("_id", resultPvo1.getpNum());
				poseQuery2.put("_id", resultPvo2.getpNum());
				poseQuery3.put("_id", resultPvo3.getpNum());
				poseQuery4.put("_id", resultPvo4.getpNum());
				poseQuery5.put("_id", resultPvo5.getpNum());
				poseQuery6.put("_id", resultPvo6.getpNum());
				poseQuery7.put("_id", resultPvo7.getpNum());
				poseQuery8.put("_id", resultPvo8.getpNum());

				DBCursor userCursor = userDB.find(userQuery, field);
				DBCursor courseCursor = courseDB.find(courseQuery, field);
				DBCursor poseCursor1 = poseDB.find(poseQuery1, field);
				DBCursor poseCursor2 = poseDB.find(poseQuery2, field);
				DBCursor poseCursor3 = poseDB.find(poseQuery3, field);
				DBCursor poseCursor4 = poseDB.find(poseQuery4, field);
				DBCursor poseCursor5 = poseDB.find(poseQuery5, field);
				DBCursor poseCursor6 = poseDB.find(poseQuery6, field);
				DBCursor poseCursor7 = poseDB.find(poseQuery7, field);
				DBCursor poseCursor8 = poseDB.find(poseQuery8, field);

				DBObject userObj = userCursor.next();
				DBObject courseObj = courseCursor.next();
				DBObject poseObj1 = poseCursor1.next();
				DBObject poseObj2 = poseCursor2.next();
				DBObject poseObj3 = poseCursor3.next();
				DBObject poseObj4 = poseCursor4.next();
				DBObject poseObj5 = poseCursor5.next();
				DBObject poseObj6 = poseCursor6.next();
				DBObject poseObj7 = poseCursor7.next();
				DBObject poseObj8 = poseCursor8.next();

				List<String> userList = (List<String>) userObj.get("keyword");
				List<String> courseList = (List<String>) courseObj.get("keyword");
				List<String> poseList1 = (List<String>) poseObj1.get("keyword");
				List<String> poseList2 = (List<String>) poseObj2.get("keyword");
				List<String> poseList3 = (List<String>) poseObj3.get("keyword");
				List<String> poseList4 = (List<String>) poseObj4.get("keyword");
				List<String> poseList5 = (List<String>) poseObj5.get("keyword");
				List<String> poseList6 = (List<String>) poseObj6.get("keyword");
				List<String> poseList7 = (List<String>) poseObj7.get("keyword");
				List<String> poseList8 = (List<String>) poseObj8.get("keyword");
				userkeyword.addAll(userList);
				userkeyword.addAll(courseList);
				userkeyword.addAll(poseList1);
				userkeyword.addAll(poseList2);
				userkeyword.addAll(poseList3);
				userkeyword.addAll(poseList4);
				userkeyword.addAll(poseList5);
				userkeyword.addAll(poseList6);
				userkeyword.addAll(poseList7);
				userkeyword.addAll(poseList8);

				MongoCollection<Document> collection = mongoDBi.getCollection("USER");
				List<String> keyword= new ArrayList<String>();
				keyword.addAll(userkeyword);
				Document doc= new Document("_id",uvo.getuNum()).append("keyword", keyword);
				Bson filter = new Document("_id",uvo.getuNum());
				collection.findOneAndReplace(filter, doc);
			}
			count = lservice.likeCount(lvo);
			res.getWriter().write(Integer.toString(count));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping(value = "/dislikeCourse", method = RequestMethod.POST)
	public void dislikeCourse(HttpServletResponse res, @RequestParam("uNum") int uNum,
			@RequestParam("crsNum") int crsNum,HttpServletRequest req) {
		CourseServiceImpl cservice = new CourseServiceImpl();
		PoseServiceImpl pservice = new PoseServiceImpl();
		LikeServiceImpl lservice = new LikeServiceImpl();
		UserServiceImpl uservice = new UserServiceImpl();
		LikeVo lvo = new LikeVo();
		lvo.setuNum(uNum);
		lvo.setCrsNum(crsNum);
		int count = 0;
		HashSet<String> userkeyword = new HashSet<String>();
		BasicDBObject field = new BasicDBObject("keyword", 1);
		BasicDBObject userQuery = new BasicDBObject();
		BasicDBObject courseQuery = new BasicDBObject();
		BasicDBObject poseQuery1 = new BasicDBObject();
		BasicDBObject poseQuery2 = new BasicDBObject();
		BasicDBObject poseQuery3 = new BasicDBObject();
		BasicDBObject poseQuery4 = new BasicDBObject();
		BasicDBObject poseQuery5 = new BasicDBObject();
		BasicDBObject poseQuery6 = new BasicDBObject();
		BasicDBObject poseQuery7 = new BasicDBObject();
		BasicDBObject poseQuery8 = new BasicDBObject();
		cvo = new CourseVo();
		uvo = (UserVo) req.getSession().getValue("user");
		cvo.setCrsNum(crsNum);
		try {
			resultCvo = cservice.selectOne(cvo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		int poseNo1 = resultCvo.getSeq1();
		int poseNo2 = resultCvo.getSeq2();
		int poseNo3 = resultCvo.getSeq3();
		int poseNo4 = resultCvo.getSeq4();
		int poseNo5 = resultCvo.getSeq5();
		int poseNo6 = resultCvo.getSeq6();
		int poseNo7 = resultCvo.getSeq7();
		int poseNo8 = resultCvo.getSeq8();

		PoseVo pose1 = new PoseVo();
		PoseVo pose2 = new PoseVo();
		PoseVo pose3 = new PoseVo();
		PoseVo pose4 = new PoseVo();
		PoseVo pose5 = new PoseVo();
		PoseVo pose6 = new PoseVo();
		PoseVo pose7 = new PoseVo();
		PoseVo pose8 = new PoseVo();

		pose1.setpNum(poseNo1);
		pose2.setpNum(poseNo2);
		pose3.setpNum(poseNo3);
		pose4.setpNum(poseNo4);
		pose5.setpNum(poseNo5);
		pose6.setpNum(poseNo6);
		pose7.setpNum(poseNo7);
		pose8.setpNum(poseNo8);

		try {
			resultPvo1 = pservice.poseSelect(pose1);
			resultPvo2 = pservice.poseSelect(pose2);
			resultPvo3 = pservice.poseSelect(pose3);
			resultPvo4 = pservice.poseSelect(pose4);
			resultPvo5 = pservice.poseSelect(pose5);
			resultPvo6 = pservice.poseSelect(pose6);
			resultPvo7 = pservice.poseSelect(pose7);
			resultPvo8 = pservice.poseSelect(pose8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int flag = lservice.likeOrNot(lvo);
			System.out.println("dislike"+flag);
			
			if (flag == 1) {
				lservice.dislike(lvo);
				DBCollection courseDB = mongoDBf.getCollection("COURSE");
				DBCollection userDB = mongoDBf.getCollection("USER");
				DBCollection poseDB = mongoDBf.getCollection("POSE");

				userQuery.put("_id", uvo.getuNum());
				courseQuery.put("_id", resultCvo.getCrsNum());
				poseQuery1.put("_id", resultPvo1.getpNum());
				poseQuery2.put("_id", resultPvo2.getpNum());
				poseQuery3.put("_id", resultPvo3.getpNum());
				poseQuery4.put("_id", resultPvo4.getpNum());
				poseQuery5.put("_id", resultPvo5.getpNum());
				poseQuery6.put("_id", resultPvo6.getpNum());
				poseQuery7.put("_id", resultPvo7.getpNum());
				poseQuery8.put("_id", resultPvo8.getpNum());

				DBCursor userCursor = userDB.find(userQuery, field);
				DBCursor courseCursor = courseDB.find(courseQuery, field);
				DBCursor poseCursor1 = poseDB.find(poseQuery1, field);
				DBCursor poseCursor2 = poseDB.find(poseQuery2, field);
				DBCursor poseCursor3 = poseDB.find(poseQuery3, field);
				DBCursor poseCursor4 = poseDB.find(poseQuery4, field);
				DBCursor poseCursor5 = poseDB.find(poseQuery5, field);
				DBCursor poseCursor6 = poseDB.find(poseQuery6, field);
				DBCursor poseCursor7 = poseDB.find(poseQuery7, field);
				DBCursor poseCursor8 = poseDB.find(poseQuery8, field);

				DBObject userObj = userCursor.next();
				DBObject courseObj = courseCursor.next();
				DBObject poseObj1 = poseCursor1.next();
				DBObject poseObj2 = poseCursor2.next();
				DBObject poseObj3 = poseCursor3.next();
				DBObject poseObj4 = poseCursor4.next();
				DBObject poseObj5 = poseCursor5.next();
				DBObject poseObj6 = poseCursor6.next();
				DBObject poseObj7 = poseCursor7.next();
				DBObject poseObj8 = poseCursor8.next();

				List<String> userList = (List<String>) userObj.get("keyword");
				List<String> courseList = (List<String>) courseObj.get("keyword");
				List<String> poseList1 = (List<String>) poseObj1.get("keyword");
				List<String> poseList2 = (List<String>) poseObj2.get("keyword");
				List<String> poseList3 = (List<String>) poseObj3.get("keyword");
				List<String> poseList4 = (List<String>) poseObj4.get("keyword");
				List<String> poseList5 = (List<String>) poseObj5.get("keyword");
				List<String> poseList6 = (List<String>) poseObj6.get("keyword");
				List<String> poseList7 = (List<String>) poseObj7.get("keyword");
				List<String> poseList8 = (List<String>) poseObj8.get("keyword");
				userkeyword.addAll(userList);
				userkeyword.removeAll(courseList);
				userkeyword.removeAll(poseList1);
				userkeyword.removeAll(poseList2);
				userkeyword.removeAll(poseList3);
				userkeyword.removeAll(poseList4);
				userkeyword.removeAll(poseList5);
				userkeyword.removeAll(poseList6);
				userkeyword.removeAll(poseList7);
				userkeyword.removeAll(poseList8);

				MongoCollection<Document> collection = mongoDBi.getCollection("USER");
				List<String> keyword= new ArrayList<String>();
				keyword.addAll(userkeyword);
				Document doc= new Document("_id",uvo.getuNum()).append("keyword", keyword);
				Bson filter = new Document("_id",uvo.getuNum());
				collection.findOneAndReplace(filter, doc);
			}
			count = lservice.likeCount(lvo);
			res.getWriter().write(Integer.toString(count));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
