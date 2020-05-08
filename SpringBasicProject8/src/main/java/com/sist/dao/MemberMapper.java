package com.sist.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

public interface MemberMapper {
/*
 	<insert>
 		<selectKey KeyProperty="no", resultType="int",order="BEFORE">
 		</selectKey>
 	</insert>
 	
 */
	@SelectKey(keyProperty="no",resultType=int.class,
			before=true,statement="SELECT NVL(MAX(no)+1,1) as no FROM spring_member")
	
	@Insert("INSERT INTO spring_member VALUES("
			+"#{no},#{name},#{sex},#{addr},#{tel})"
			)
	// resultType=> 리턴형
	// parameterType=> 매개변수로 바뀜, ID :: 메서드명으로 바뀜
	
	public void memberInsert(MemberVO vo);
	
	public void memberInsertTemp(MemberVO vo);
	
	/*
	 	<select id="memberAllData" resultType="MemberVO">
	 	</select>
	 */
	@Select("SELECT * FROM spring_member")
	public List<MemberVO> memberAllData();
	
	@Select("SELECT * FROM spring_member "
			+ "WHERE no=#{no}")
	public MemberVO memberDetailData(int no);
	
	
	
	
}
