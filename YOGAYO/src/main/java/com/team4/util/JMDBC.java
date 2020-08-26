package com.team4.util;

public class JMDBC {
	
	public void getConnection() {
		MongoClient  mongo = new MongoClient("localhost",27017);
		MongoDatabase test = mongo.getDatabase("test");
	}

	   public static void main(String[] args) {
	      MongoClient  mongo = new MongoClient("localhost",27017);
	      MongoDatabase test = mongo.getDatabase("test");
	        //3. 컬렉션 가져오기(Bson 형태)
	        MongoCollection<Document> collection = test.getCollection("user");
	        String b="안녕하세요!!";
	        //insert(collection);
	        DB db = mongo.getDB("test");
	        DBCollection cltn=db.getCollection("user");
	        find(cltn);
	      
	      
	   
	   }
	   
	   public static void find(DBCollection collection) {
	      System.out.println("1. Find all matched documents");
	      DBCursor cursor = collection.find();
	      while(cursor.hasNext()) {
	         System.out.println(cursor.next());
	      }
	      
	      System.out.println();
	      
	      System.out.println("2. get 'keyword' filed only");
	      
	      BasicDBObject allquery= new  BasicDBObject();
	      BasicDBObject fields= new BasicDBObject();
	      allquery.put("_id",1771717);
	      fields.put("keyword",1);
	      DBCursor cursor2= collection.find(allquery, fields);
	      while(cursor2.hasNext()) {
	         DBObject obj=cursor2.next();
	         List<String> list= (List<String>)obj.get("keyword");
	         System.out.println(list);
	      }
	      
	   }
	   
	   public static void insert(MongoCollection<Document> collection) {
	      
	       List<String> a= new ArrayList<String>();
	          a.add("안");
	          a.add("녕");
	          a.add("하");
	          a.add("세");
	          a.add("요");
	           Document doc= new Document("_id",1771717).append("keyword", a  );
	           collection.insertOne(doc);
	           System.out.println("성공");
	   }


}
