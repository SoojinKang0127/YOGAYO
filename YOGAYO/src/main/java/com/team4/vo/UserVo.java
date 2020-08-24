package com.team4.vo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.bson.BsonDocument;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

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
import com.mongodb.client.model.Filters;

public class UserVo {

	int uNum;
	String id;
	String pwd;
	String name;
	Date bDate;
	char gender;
	String img;
	Date regDate;

	public UserVo() {
	}

	public static void main(String[] args) {
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://user:12345@cluster0.9bcza.mongodb.net/test?retryWrites=true&w=majority");
		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("test");
		MongoClient mongo = new MongoClient("localhost", 27017);
		MongoDatabase test = mongo.getDatabase("test");
		// 3. 컬렉션 가져오기(Bson 형태)
		MongoCollection<Document> collection = database.getCollection("user");
		insert(collection);
		String b = "안녕하세요!!";
		// insert(collection);
		DB db = mongoClient.getDB("test");
		DBCollection cltn = db.getCollection("user");
		find(cltn);

	}

	public static void find(DBCollection collection) {
		System.out.println("1. Find all matched documents");
		DBCursor cursor = collection.find();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}

		System.out.println();

		System.out.println("2. get 'keyword' filed only");

		BasicDBObject allquery = new BasicDBObject();
		BasicDBObject fields = new BasicDBObject();
		allquery.put("_id", 1771717);
		fields.put("keyword", 1);
		DBCursor cursor2 = collection.find(allquery, fields);
		while (cursor2.hasNext()) {
			DBObject obj = cursor2.next();
			List<String> list = (List<String>) obj.get("keyword");
			System.out.println(list);
		}

	}

	public static void insert(MongoCollection<Document> collection) {

		List<String> a = new ArrayList<String>();
		a.add("안");
		a.add("녕");
		a.add("하");
		a.add("세");
		a.add("요");
		Document doc = new Document("_id", 1771717).append("keyword", a);
		collection.insertOne(doc);
		System.out.println("성공");
	}

	public UserVo(int uNum, String id, String pwd, String name, Date bDate, char gender, String img, Date regDate) {
		super();
		this.uNum = uNum;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.bDate = bDate;
		this.gender = gender;
		this.img = img;
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "UserVo [uNum=" + uNum + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", bDate=" + bDate
				+ ", gender=" + gender + ", img=" + img + ", regDate=" + regDate + "]";
	}

	public int getuNum() {
		return uNum;
	}

	public void setuNum(int uNum) {
		this.uNum = uNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getbDate() {
		return bDate;
	}

	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
