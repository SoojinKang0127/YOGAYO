package com.team4.resource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.BSON;
import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.team4.dao.feed.FeedServiceImpl;

public class Rcontroller extends HttpServlet implements R {
	private static final long serialVersionUID = 1L;
	MongoDatabase database = mongoClient.getDatabase("project");
	FeedServiceImpl fservice = new FeedServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		updateKeyword();

	}

	public void updateKeyword() {
		getListFromCourse();
		getListFromPose();
		getLastFnum();
		this.keywordList.addAll(this.keywordAll);
		System.out.println("Keyword Hashset initialized success [size: " + this.keywordAll.size() + "]");
		System.out.println(this.keywordList.toString());
	}

	public void getListFromPose() {
		DBCollection collection = mongoDBf.getCollection("POSE");
		BasicDBObject allquery = new BasicDBObject();
		BasicDBObject fields = new BasicDBObject();
		DBCursor cursor = collection.find(allquery, fields);
		while (cursor.hasNext()) {
			DBObject obj = cursor.next();
			List<String> list = (List<String>) obj.get("keyword");
			for (String s : list) {
				this.keywordAll.add(s);
			}
		}

	}

	public void getListFromCourse() {
		DBCollection collection = mongoDBf.getCollection("COURSE");
		BasicDBObject allquery = new BasicDBObject();
		BasicDBObject fields = new BasicDBObject();
		DBCursor cursor = collection.find(allquery, fields);
		while (cursor.hasNext()) {
			DBObject obj = cursor.next();
			List<String> list = (List<String>) obj.get("keyword");
			for (String s : list) {
				this.keywordAll.add(s);
			}
		}
	}

	public void addKeyword(String keyword) {
		this.keywordAll.add(keyword);
	}

	public void removeKeyword(String keyword) {
		this.keywordAll.remove(keyword);
	}

	public HashSet<String> getKeywordList() {
		return this.keywordAll;
	}

	public void getLastFnum() {
	}

	public void plusLastFnum() {
	}

	public List<String> getKeywordsByUnum(int uNum) {
		DBCollection collection = mongoDBf.getCollection("USER");
		BasicDBObject query = new BasicDBObject();
		query.put("_id", uNum);

		DBCursor cursor = collection.find(query);
		List<String> list = null;
		while (cursor.hasNext()) {
			DBObject obj = cursor.next();
			list = (List<String>) obj.get("keyword");
//			for (String s : list) {
//				System.out.println(s);
//			}
		}
		return list;
	}
}