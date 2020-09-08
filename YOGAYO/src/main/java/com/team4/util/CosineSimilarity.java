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
		ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();

		BasicDBObject myQuery = new BasicDBObject("_id", vo.getuNum());
		DBCursor myCursor = userDB.find(myQuery, field);
		DBObject myobj = myCursor.next();
		List<String> myList = (List<String>) myobj.get("keyword");
		ArrayList<Integer> myintlist = new ArrayList<Integer>(Collections.nCopies(keywordList.size() + 2, 0));
		myintlist.set(0, vo.getuNum());
		myintlist.set(1, myList.size());
		for (int j = 0; j < myList.size(); j++) {
			String key = myList.get(j);
			int index = keywordList.indexOf(key);
			myintlist.set(index + 2, 1);
		}
		for (int i = 0; i < listExceptMe.size(); i++) {
			BasicDBObject userQuery = new BasicDBObject("_id", listExceptMe.get(i));
			DBCursor userCursor = userDB.find(userQuery, field);
			DBObject obj = userCursor.next();
			List<String> userList = (List<String>) obj.get("keyword");
			ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(keywordList.size() + 2, 0));
			intlist.set(0, listExceptMe.get(i));
			intlist.set(1, userList.size());
			for (int j = 0; j < userList.size(); j++) {
				String key = userList.get(j);
				int index = keywordList.indexOf(key);
				intlist.set(index + 2, 1);
			}
			listAll.add(intlist);
		}

		for (int i = 0; i < listAll.size(); i++) {
			ArrayList<Integer> csList = listAll.get(i);
			int total = 0;
			for (int j = 2; j < csList.size(); j++) {
				total += csList.get(j) * myintlist.get(j);
			}
			System.out.println("겹치는 개수:" + total);
			System.out.print(csList.get(0) + "의 코사인 유사도는");
			System.out.print(total / (Math.sqrt(csList.get(1)) * Math.sqrt(myintlist.get(1))));
			System.out.println();
		}

		List<Integer> courseListExceptme = null;
		List<Integer> myCourse = null;
		LikeVo mylvo = new LikeVo();
		List<Integer> courseList = null;
		ArrayList<Integer> myCourseList = null;
		mylvo.setuNum(vo.getuNum());
		ArrayList<ArrayList<Integer>> courseListAll = new ArrayList<ArrayList<Integer>>();
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
			ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(courseList.size() + 2, 0));
			try {
				courseListExceptme = lservice.countCourse(lvo);

			} catch (Exception e) {
				e.printStackTrace();
			}

			for (int j = 0; j < courseListExceptme.size(); j++) {
				int key = courseListExceptme.get(j);
				int index = courseList.indexOf(key);
				intlist.set(index + 2, 1);
			}
			intlist.set(0, listExceptMe.get(i));
			intlist.set(1, courseListExceptme.size());
			courseListAll.add(intlist);
		}

		for (int i = 0; i < courseListAll.size(); i++) {
			ArrayList<Integer> csList = courseListAll.get(i);
			int total = 0;
			for (int j = 2; j < csList.size(); j++) {
				total += csList.get(j) * myCourseList.get(j);
			}
			System.out.println("겹치는 개수:" + total);
			System.out.print(csList.get(0) + "의 코사인 유사도는");
			System.out.print(total / (Math.sqrt(csList.get(1)) * Math.sqrt(myintlist.get(1))));
			System.out.println();
		}

	}

}
