package com.sist.dao;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {
	
	// member
	private int no;
	private String id;
	private String pwd;
	private String email;
	private String sex;
	private String tel;
	private String admin;
	
	
	
	private String link;
	// board
	private String title;
	private String author;
	private Date regdate;
	private String content;
	private String img;
	private int hit;
}
