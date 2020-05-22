package com.sist.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;


// JDBC => ORM

@Repository
public class MovieDAO {
	
	@Autowired
	private MovieMapper mapper;
	
	public List<MovieVO> ListAllData(Map map){
		return mapper.ListAllData(map);
	}
	public int movieTotalPage(int type){
		
		return mapper.movieTotalPage(type);
	}
	public MovieVO movieDetailData(int mno){
		return mapper.movieDetailData(mno);
	}
}
