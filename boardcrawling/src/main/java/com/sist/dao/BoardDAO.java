package com.sist.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {

	@Autowired
	private BoardMapper mapper;
	
	public void memberInsert(BoardVO vo){
		mapper.memberInsert(vo);
	}
	public void BoardInsert(BoardVO vo){
		mapper.BoardInsert(vo);
	}
	
	
}
