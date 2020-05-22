package com.sist.dao;

import org.springframework.stereotype.Repository;

import java.util.*;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

@Repository
public class MovieDAO {
	
	private MongoClient mc; //connection
	private DB db; // Database (XE)
	private DBCollection dbc; // Table
	
	public MovieDAO(){
		try{
			mc= new MongoClient("localhost",27017);
			db =mc.getDB("mydb");
			dbc = db.getCollection("movie");
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	// {mno :100, title:'',....} => BasicDBObject
	public void movieInsert(MovieVO vo){
		/*
		 	private int mno;
			private String title;
			private String poster;
			private String genre;
			private String grade;
			private String director;
			private String actor;
			private int like;
			private String story;
		 */
		try{
			BasicDBObject obj = new BasicDBObject();
			obj.put("mno", vo.getMno());
			obj.put("title", vo.getTitle());
			obj.put("poster", vo.getPoster());
			obj.put("genre", vo.getGenre());
			obj.put("director", vo.getDirector());
			obj.put("actor", vo.getActor());
			obj.put("story", vo.getStory());
			dbc.insert(obj);
			
		}catch(Exception ex){
			System.out.println("DB 삽입 : "+ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public List<MovieVO> movieListData(int page){
		
		List<MovieVO> list = new ArrayList<MovieVO>();
		try{
			int rowSize = 10;
			int skip = (rowSize*page) - rowSize;
			
			DBCursor cursor = dbc.find().skip(skip).limit(rowSize);
			while(cursor.hasNext()){
				BasicDBObject obj = (BasicDBObject)cursor.next();
				MovieVO vo = new MovieVO();
				vo.setMno(obj.getInt("mno"));
				vo.setTitle(obj.getString("title"));
				vo.setPoster(obj.getString("poster"));
				
				list.add(vo);
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		return list; 
	}
	
}
