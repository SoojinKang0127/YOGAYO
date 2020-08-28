package com.team4.util;

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

public class JMDBC {

   public JMDBC() {
   }

   public static void main(String[] args) {
      MongoClientURI uri = new MongoClientURI(
            "mongodb+srv://user:12345@cluster0.9bcza.mongodb.net/test?retryWrites=true&w=majority");
      MongoClient mongoClient = new MongoClient(uri);
      //MongoClient mongo = new MongoClient("localhost", 27017);
     // MongoDatabase test = mongo.getDatabase("test");
      // 3. 컬렉션 가져오기(Bson 형태)
      MongoDatabase database = mongoClient.getDatabase("project");
      MongoCollection<Document> collection = database.getCollection("POSE");
      insert(collection);
      String b = "안녕하세요!!";
      insert(collection);
      //DB db = mongoClient.getDB("test");
      //DBCollection cltn = db.getCollection("user");
      //find(cltn);

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

	   String[] p0= {"허리","척추"};
	   String[] p1= {"배","복부","엉덩이","허리","척추","스트레스","소화"};
	   String[] p2= {"엉덩이","사타구니","어깨","등"};
	   String[] p3= {"발목","허벅지","복부","배","가슴","목","등"};
	   String[] p4= {"가슴","목","허리","척추","여자","폐경","불면증","두통","요통","천식","피로","고혈압","골다공증","비염"};
	   String[] p5= {"발목","허벅지","사타구니","복부","배","가슴","등"};
	   String[] p6= {"허리","척추","목"};
	   String[] p7= {"발목","허벅지","종아리","가슴","어깨","횡경막","심장","평발"};
	   String[] p8= {"엉덩이","허벅지","발목","스트레스","목"};
	   String[] p9= {"허리","척추","가슴","어깨"};
	   String[] p10= {"발목","엉덩이","어깨","겨드랑이","팔"};
	   String[] p11= {"뇌","호흡","뇌"};
	   String[] p12= {"가슴","폐","어깨","팔","목","복부","배","사타구니","등","종아리","허벅지","발목"};
	   String[] p13= {"팔","팔목","어깨","등","복부","균형"};
	   String[] p14= {"어깨","가슴","허벅지","사타구니","복부","배","다리","발목","균형"};
	   String[] p15= {"스트레스","우울","어깨","햄스트링","종아리","손","발바닥","폐경",};
	   String[] p16= {"우울","스트레스","뇌","어깨","햄스트링","종아리","발바닥","손","다리","폐경","골다공증","소화","두통","불면증","요통","고혈압","평발","발목","발가락"};
	   String[] p17= {"엉덩이","무릎","발목","스트레스","고요","혈액순환","등"};
	   String[] p18= {"햄스트링","다리","균형"};
	   String[] p19= {"다리","무릎","발목","사타구니","허리","척추","가슴","폐","어깨","체력"};
	   String[] p20= {"허벅지","무릎","발목","엉덩이","사타구니","햄스트링","종아리","어깨","가슴","척추","허리","스트레스","소화","폐경","평발","목"};
	   String[] p21= {"목","배","가슴","허리","척추","어깨"};
	   String[] p22= {"팔","어깨","집중력","균형","등","복부","배"};
	   String[] p23= {"팔","팔목","허리","척추","복부","배"};
	   String[] p24= {"팔","팔목","복부","배"};
	   String[] p25= {"옆구리","복부","배","허리","척추","허벅지","햄스트링"};
	   String[] p26= {"발목","허벅지","사타구니","복부","배","가슴","목","엉덩이"};
	   String[] p27= {"어깨","허리","척추","발목","허벅지","복부","배"};
	   String[] p28= {"스트레스","우울","간","신장","햄스트링","종아리","엉덩이","무릎","허벅지","소화","폐경","불면증","두통"};
	   String[] p29= {"복부","배","발목","허벅지","허리","척추","엉덩이","사타구니","햄스트링","종아리","어깨","가슴","균형","스트레스","소화"};
	   String[] p30= {"다리"};
	   String[] p31= {"사타구니","허리","척추","뇌","스트레스"};
	   String[] p32= {"사타구니","햄스트링","어깨"};
	   String[] p33= {"뇌","팔","다리","척추","허리","배","복부"};
	   String[] p34= {"허벅지","무릎","발목","발바닥","소화","폐경","고혈압","천식"};
	   String[] p35= {"허벅지","무릎","발목"};
	   String[] p36= {"뇌","허리","척추","어깨","엉덩이","햄스트링","다리"};
	   String[] p37= {"척추","허리","엉덩이","팔","다리","어깨","가슴","배","복부","허벅지","장기","스트레스"};
	   String[] p38= {"엉덩이","사타구니","무릎","발목","허벅지","등","마음","안정","스트레스","혈액순환"};
	   String[] p39= {"가슴","폐","목","배","복부","어깨","팔","등","허벅지","종아리","발목"};
	   String[] p40= {"균형","허벅지","무릎","발목","엉덩이","배","복부","평발"};
	   String[] p41= {"허벅지", "사타구니", "배", "가슴", "어깨"};
	   String[] p42= {"팔", "손목", "척추", "배"};
	   String[] p43= {"뇌", "배", "척추", "폐경", "스트레스", "피로", "요통", "두통", "불임", "불면증", "허리"};
	   String[] p44= {"어깨", "햄스트링", "배"};
	   String[] p45= {"어깨", "척추", "배", "허리"};
	   String[] p46= {"엉덩이", "사타구니", "어깨", "가슴", "배", "폐", "심장"};
	   String[] p47= {"햄스트링","다리"};
	   String[] p48= {"복부","어깨","팔","허벅지","엉덩이","등","발목","무릎",",복부 기관","신장","폐","갈비뼈"};
	   String[] p49= {"다리","무릎","발목","사타구니","척추","허리","가슴","폐","어깨","복부 기관","체력","요통","임신중기","터널 증후군","평발","불임","골다공증","좌골신경동"};
	   String[] p50= {"척추","어깨","햄스트링"};
	   String[] p51= {"뇌","간","신장","햄스트링","종아리","허벅지","무릎","발목","사타구니"};
	   String[] p52= {"스트레스","우울증","척추","어깨","햄스트링","간","신장","난소","자궁","소화","폐경","월경","두통","불안","피로","고혈압","불임","불면증","부비동염","비만"};
	   String[] p53= {"뇌" ,"스트레스" ,"우울증","목", "전립선" , "어깨" , "다리" , "엉덩이" , "소화" , "폐경" , "피로" , "불면증" , "천식" , "불임" , "부비동염"};
	   String[] p54= {"뇌" , "스트레스" , "우울증" , "어깨" , "햄스트링" , "종아리" , "팔" , "다리" , "폐경" , "골다공증" , "소화" , "두통" , "불면증" , "허리" , "피로" , "고혈압" , "천식" , "좌골 신경통"};
	   String[] p55= {"가슴" , "폐" , "어깨" , "복부" , "척추" , "심장" , "폐"};
	   String[] p56= {"등" , "어깨" , "가슴"};
	   String[] p57= {"뇌" , "스트레스" , "우울증" , "간" , "신장" ,"햄스트링" , "종아리" , "엉덩이" , "허벅지" , "무릎" , "소화" , "폐경" , "피로" , "불안" , "두통" , "불면증"};
	   String[] p58= {"햄스트링" , "종아리" , "허벅지" , "무릎" , "발목" , "다리" , "사타구니" , "균형"};
	   String[] p59= {"다리", "발목", "발", "유연성", "엉덩이", "무릎"};
	   String[] p60= {"팔", "손목", "발", "엉덩이", "복근", "척추", "목", "우울증", "등", "뼈"};
	   String[] p61= {"척추", "팔", "팔목", "가슴", "어깨", "폐", "복부", "엉덩이"};
	   String[] p62= {"소화", "햄스트링", "복부", "척추", "엉덩이"};
	   String[] p63= {"팔", "손목", "다리", "어깨", "가슴", "발목"};
	   String[] p64= {"가슴", "폐", "목", "복부", "어깨", "팔", "등", "허벅지", "장딴지", "발목"};
	   String[] p65= {"터널 증후군", "평발", "불임", "골다공증", "좌골 신경통", "다리", "발목", "복부","배" };
	   String[] p66= {"발목", "다리", "어깨", "균형", "복부","배"};
	   String[] p67= {"척추", "다리", "발목", "복부","허리"};
	   String[] p68= {"척추", "다리", "발목", "복부" , "어깨","허리"};
	   String[] p69= {"척추", "다리", "발목", "복부","배","허리"};
	   String[] p70= {"다리", "척추", "뇌", "사타구니","허리"};
	   
	   ArrayList<String[]> list= new ArrayList<String[]>();
	   list.add(p0);
	   list.add(p1);
	   list.add(p2);
	   list.add(p3);
	   list.add(p4);
	   list.add(p5);
	   list.add(p6);
	   list.add(p7);
	   list.add(p8);
	   list.add(p9);
	   list.add(p10);
	   list.add(p11);
	   list.add(p12);
	   list.add(p13);
	   list.add(p14);
	   list.add(p15);
	   list.add(p16);
	   list.add(p17);
	   list.add(p18);
	   list.add(p19);
	   list.add(p20);
	   list.add(p21);
	   list.add(p22);
	   list.add(p23);
	   list.add(p24);
	   list.add(p25);
	   list.add(p26);
	   list.add(p27);
	   list.add(p28);
	   list.add(p29);
	   list.add(p30);
	   list.add(p31);
	   list.add(p32);
	   list.add(p33);
	   list.add(p34);
	   list.add(p35);
	   list.add(p36);
	   list.add(p37);
	   list.add(p38);
	   list.add(p39);
	   list.add(p40);
	   list.add(p41);
	   list.add(p42);
	   list.add(p43);
	   list.add(p44);
	   list.add(p45);
	   list.add(p46);
	   list.add(p47);
	   list.add(p48);
	   list.add(p49);
	   list.add(p50);
	   list.add(p51);
	   list.add(p52);
	   list.add(p53);
	   list.add(p54);
	   list.add(p55);
	   list.add(p56);
	   list.add(p57);
	   list.add(p58);
	   list.add(p59);
	   list.add(p60);
	   list.add(p61);
	   list.add(p62);
	   list.add(p63);
	   list.add(p64);
	   list.add(p65);
	   list.add(p66);
	   list.add(p67);
	   list.add(p68);
	   list.add(p69);
	   list.add(p70);
	 
	   
	
	   
	   
	   
	   for(int i=0; i<71;i++) {
		   String[] arr=list.get(i);
		   List<String> keyword= new ArrayList<String>();
		   for(int k=0;k<arr.length;k++) {
			   keyword.add(arr[k]);
		   }
		   Document doc= new Document("_id",i).append("keyword", keyword);
		   collection.insertOne(doc);
	   }
	   
	   
	   
	   
//      List<String> aa = new ArrayList<String>();
//     aa.add("안");
//      aa.add("녕");
//      aa.add("하");
//      aa.add("세");
//      aa.add("요");
//      Document doc = new Document("_id", 1771717).append("keyword", aa);
//      collection.insertOne(doc);
      System.out.println("성공");
   }

  

}