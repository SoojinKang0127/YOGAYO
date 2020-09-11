package com.team4.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.team4.dao.course.CourseDAOImpl;
import com.team4.dao.like.LikeDAOImpl;
import com.team4.resource.R;
import com.team4.resource.Rcontroller;
import com.team4.user.dao.UserDAOImpl;
import com.team4.vo.CourseVo;
import com.team4.vo.LikeVo;
import com.team4.vo.UserVo;

public class CosineSimilarity implements R {

	public static void main(String[] args) {
		LikeDAOImpl lservice = new LikeDAOImpl();
		List<Integer> listExceptMe = null;
		CourseDAOImpl cservice = new CourseDAOImpl();
		UserVo vo = new UserVo();
		vo.setuNum(1048);
		UserDAOImpl uservice = new UserDAOImpl();
		BasicDBObject field = new BasicDBObject("keyword", 1);
		try {
			listExceptMe = uservice.selectExceptMe(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		DBCollection userDB = mongoDBf.getCollection("USER");
		Rcontroller controller = new Rcontroller();
		controller.updateKeyword();
		ArrayList<CSArray> listAll = new ArrayList<CSArray>();

		BasicDBObject myQuery = new BasicDBObject("_id", vo.getuNum());
		DBCursor myCursor = userDB.find(myQuery, field);
		DBObject myobj = myCursor.next();
		List<String> myList = (List<String>) myobj.get("keyword");
		CSArray mycsarray = new CSArray(keywordList.size());
		mycsarray.getList().set(0, vo.getuNum());
		mycsarray.getList().set(1, myList.size());
		for (int j = 0; j < myList.size(); j++) {
			String key = myList.get(j);
			int index = keywordList.indexOf(key);
			mycsarray.getList().set(index + 2, 1);
		}
		for (int i = 0; i < listExceptMe.size(); i++) {
			BasicDBObject userQuery = new BasicDBObject("_id", listExceptMe.get(i));
			DBCursor userCursor = userDB.find(userQuery, field);
			DBObject obj = userCursor.next();
			List<String> userList = (List<String>) obj.get("keyword");
			CSArray csarray = new CSArray(keywordList.size());
			csarray.getList().set(0, listExceptMe.get(i));
			csarray.getList().set(1, userList.size());
			for (int j = 0; j < userList.size(); j++) {
				String key = userList.get(j);
				int index = keywordList.indexOf(key);
				csarray.getList().set(index + 2, 1);
			}
			int total = 0;
			for (int j = 2; j < csarray.getList().size(); j++) {
				total += csarray.getList().get(j) * mycsarray.getList().get(j);
			}
			csarray.setKeywordcs(total / (Math.sqrt(csarray.getList().get(1)) * Math.sqrt(mycsarray.getList().get(1))));
			listAll.add(csarray);
		}
// like cs 시작
		
		
		List<Integer> courseListExceptme = null;
		List<Integer> myCourse = null;
		LikeVo mylvo = new LikeVo();
		List<Integer> courseList = null;
		ArrayList<Integer> myCourseList = null;
		mylvo.setuNum(vo.getuNum());
		ArrayList<CSArray> courseListAll = new ArrayList<CSArray>();
		try {
			myCourse = lservice.countCourse(mylvo);
			courseList = cservice.courseAll();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		myCourseList = new ArrayList<Integer>(Collections.nCopies(courseList.size() + 2, 0));
		myCourseList.set(0, vo.getuNum());
		myCourseList.set(1, myCourse.size());
		for (int j = 0; j < myCourse.size(); j++) {
			int key = myCourse.get(j);
			int index = courseList.indexOf(key);
			myCourseList.set(index + 2, 1);
		}

		System.out.println("코스 리스트 얼: " + courseList.toString());
		System.out.println("마이코스 : " + myCourse.toString());

		for (int i = 0; i < listExceptMe.size(); i++) {
			LikeVo lvo = new LikeVo();
			lvo.setuNum(listExceptMe.get(i));
			CSArray intlist = new CSArray(courseList.size());
			try {
				courseListExceptme = lservice.countCourse(lvo);

			} catch (Exception e) {
				e.printStackTrace();
			}

			for (int j = 0; j < courseListExceptme.size(); j++) {
				int key = courseListExceptme.get(j);
				int index = courseList.indexOf(key);
				intlist.getList().set(index + 2, 1);
			}
			intlist.getList().set(0, listExceptMe.get(i));
			intlist.getList().set(1, courseListExceptme.size());
			
			int total = 0;
			for (int j = 2; j < intlist.getList().size(); j++) {
				total += intlist.getList().get(j) * myCourseList.get(j);
			}
			intlist.setLikecs(total / (Math.sqrt(intlist.getList().get(1)) * Math.sqrt(myCourseList.get(1))));
			courseListAll.add(intlist);
		}


		for(int i=0;i<listAll.size();i++) {
			for(int j=0;j<courseListAll.size();j++) {
				if(courseListAll.get(j).getList().get(0)==listAll.get(i).getList().get(0))
					courseListAll.get(j).setKeywordcs(listAll.get(i).getKeywordcs());
			}
		}
		Collections.sort(courseListAll);
		System.out.println(courseListAll.toString());
		
		ArrayList<Integer> myRecommend=myCourseList;
		ArrayList<Integer> recommendCourse= new ArrayList<Integer>();
		
		for(int i=2;i<myRecommend.size();i++) {
			myRecommend.set(i,myRecommend.get(i)-courseListAll.get(0).getList().get(i));
			if(myRecommend.get(i)==-1)
				recommendCourse.add(i-1);
		}
		System.out.println(myRecommend.toString());
		System.out.println(recommendCourse.toString());
	}

}
