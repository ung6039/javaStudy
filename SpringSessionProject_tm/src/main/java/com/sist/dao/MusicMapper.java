package com.sist.dao;
import java.util.*;

import org.apache.ibatis.annotations.Select;

/*
 	트랜 잭션  :: 모두 정상 처리되었을 때만 commit;
 	insert와 update가 여러개 나올 때
 	>> 일괄처리
 	@Transactional :: @(annotation)이 처리되면 트랜잭션이 됨
 	 public void insert(){}
 	 public void replyInsert(){}
 	 public void replyInsert(){
 	 	try{
 	 		ssf.openSession(); => Around
 	 		insert(); 정상
 	 		update(); 오류 ==> catch
 	 		insert(); 정상
 	 		commit => Around
 	 	}catch(Exception ex){
 	 		rollback() => After-Throwing
 	 	}finally{
 	 		conn.setAutoCommit() => After
 	 	}
 	 }
 */
public interface MusicMapper {

	@Select("SELECT * FROM music_genie ORDER BY mno ASC")
	public List<MusicVO> musicAllData();
	
	@Select("SELECT * FROM music_genie "
			+ "WHERE mno=#{mno}")
	public MusicVO musicDetailData(int mno);
	
	@Select("SELECT COUNT(*) FROM member "
			+ "WHERE id =#{id}")
	public int idCount(String id);

	@Select("SELECT pwd FROM member "
			+ "WHERE id=#{id}")
	public String memberGetPassword(String id);
	
	
}
