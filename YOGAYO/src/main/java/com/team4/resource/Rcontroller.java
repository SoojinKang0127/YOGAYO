package com.team4.resource;

import java.io.IOException;
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

public class Rcontroller extends HttpServlet implements R {
	private static final long serialVersionUID = 1L;
	MongoClientURI uri = new MongoClientURI(
			"mongodb+srv://user:12345@cluster0.9bcza.mongodb.net/test?retryWrites=true&w=majority");
	MongoClient mongoClient = new MongoClient(uri);
	MongoDatabase database = mongoClient.getDatabase("project");
	DB db= mongoClient.getDB("project");
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		getListFromCourse();
		getListFromPose();
		System.out.println("Keyword Hashset initialized success [size: "+this.keyword.size()+"]");
		System.out.println(this.keyword.toString());
	}

	public void getListFromPose() {
		 DBCollection collection = db.getCollection("POSE");
	      BasicDBObject allquery = new BasicDBObject();
	      BasicDBObject fields = new BasicDBObject();
	      DBCursor cursor = collection.find(allquery,fields);
	      while(cursor.hasNext()) {
	    	  DBObject obj = cursor.next();
	    	  List<String> list = (List<String>) obj.get("keyword");
	    	  for(String s:list) {
	    		  this.keyword.add(s);
	    	  }
	      }
	      
	}

	public void getListFromCourse() {
		 DBCollection collection = db.getCollection("COURSE");
	      BasicDBObject allquery = new BasicDBObject();
	      BasicDBObject fields = new BasicDBObject();
	      DBCursor cursor = collection.find(allquery,fields);
	      while(cursor.hasNext()) {
	    	  DBObject obj = cursor.next();
	    	  List<String> list = (List<String>) obj.get("keyword");
	    	  for(String s:list) {
	    		  this.keyword.add(s);
	    	  }
	      }
	}
	
	public void addKeyword(String keyword) {
		this.keyword.add(keyword);
	}
	
	public void removeKeyword(String keyword) {
		this.keyword.remove(keyword);
	}
	
	public HashSet<String> getKeywordList(){
		return this.keyword;
	}
	
	

}
