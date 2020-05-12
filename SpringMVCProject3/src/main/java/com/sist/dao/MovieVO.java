package com.sist.dao;

import java.util.Date;

import javax.xml.crypto.Data;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MovieVO {
/*
 	MNO       NOT NULL NUMBER         
	TITLE     NOT NULL VARCHAR2(1000) 
	POSTER    NOT NULL VARCHAR2(2000) 
	SCORE              NUMBER(4,2)    
	GENRE     NOT NULL VARCHAR2(100)  
	REGDATE            VARCHAR2(100)  
	TIME               VARCHAR2(10)   
	GRADE     NOT NULL VARCHAR2(100)  
	DIRECTOR           VARCHAR2(200)  
	ACTOR              VARCHAR2(200)  
	STORY              CLOB           
	TYPE               NUMBER         
	THEATERNO          VARCHAR2(200)
 */
	private int mno;
	private String title;
	private String poster;
	private double score;
	private String genre;
	private Date regdate;
	private String time;
	private String grade;
	private String director;
	private String actor;
	private String story;
	private int type;
	
}
