package com.sist.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;

public interface BoardMapper {

	@Insert("INSERT INTO member(id,sex)"
			+ "VALUES(#{id},#{sex})"
			)
	public void memberInsert(BoardVO vo);
	
	@SelectKey(statement="SELECT NVL(MAX(no)+1,1) as no FROM board",
			keyProperty="no",resultType=int.class,before=true)
	@Insert("INSERT INTO board(no,title,author,content,"
			+ "regdate,hit,img)"
			+ "VALUES"
			+ "(#{no},#{title},#{author},#{content},#{regdate},#{hit},#{img})")
	public void BoardInsert(BoardVO vo);
}
