package com.team4.resource;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public interface R {
   
   
   HashSet keywordAll= new HashSet();
   List<String> keywordList= new ArrayList<String>();
   
   Integer feedFileCount=0;
    MongoClientURI uri = new MongoClientURI("mongodb+srv://user:12345@cluster0.9bcza.mongodb.net/test?retryWrites=true&w=majority");
    MongoClient mongoClient = new MongoClient(uri);
    MongoDatabase mongoDBi = mongoClient.getDatabase("project");
    DB mongoDBf= mongoClient.getDB("project");
   
   

}