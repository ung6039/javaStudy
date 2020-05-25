package com.sist.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

/*
 *   insert() => 카드 결재
 *   
 *   insert()
 *   commit
 */
import java.util.*;
public interface ReplyMapper {
   @SelectKey(keyProperty="no",resultType=int.class,before=true,
		   statement="SELECT NVL(MAX(no)+1,1) as no FROM music_reply2")
   @Insert("INSERT INTO music_reply2(no,mno,id,msg,group_id) VALUES("
		 +"#{no},#{mno},#{id},#{msg},"
		 +"(SELECT NVL(MAX(group_id)+1,1) FROM music_reply2))")
   public void replyInsert(ReplyVO vo);
   
   @Select("SELECT no,mno,id,msg,TO_CHAR(regdate,'YYYY-MM-DD HH24:MI:SS') as dbday,group_tab FROM music_reply2 "
		  +"WHERE mno=#{mno} "
		  +"ORDER BY group_id DESC,group_step ASC")
   public List<ReplyVO> replyListData(int mno);
   
   @Select("SELECT group_id,group_step,group_tab "
		  +"FROM music_reply2 "
		  +"WHERE no=#{no}")
   public ReplyVO replyParentInfoData(int no);
   /*                  
    *                  group_id  group_step group_tab
    *      AAA             1         0         0
    *       =>EEE          1         1         1
    *       =>DDD          1         2         1
    *       =>BBB          1         3         1
    *        =>CCC         1         4         2
    *      
    *       
    */
   //@Update()
   @Update("UPDATE music_reply2 SET "
		  +"group_step=group_step+1 "
		  +"WHERE group_id=#{group_id} AND group_step>#{group_step}")
   public void replyGroupStepIncrement(ReplyVO vo);
   //@Insert()
   @SelectKey(keyProperty="no",resultType=int.class,before=true,
		   statement="SELECT NVL(MAX(no)+1,1) as no FROM music_reply2")
   @Insert("INSERT INTO music_reply2(no,mno,id,msg,group_id,group_step,group_tab,root) VALUES("
		 +"#{no},#{mno},#{id},#{msg},"
		 +"#{group_id},#{group_step},#{group_tab},#{root})")
   public void replyReplyInsert(ReplyVO vo);
   //@Update()
   @Update("UPDATE music_reply2 SET "
		  +"depth=depth+1 "
		  +"WHERE no=#{no}")
   public void replyDepthIncrement(int no);
   
   @Update("UPDATE music_reply2 SET "
		  +"msg=#{msg} "
		  +"WHERE no=#{no}")
   public void replyUpdate(ReplyVO vo);
   
   
   /*
    *   @ depth,root
    *   depth==0
    *   @ DELETE
    *   depth!=0
    *   @Update
    *   
    *   @depth감소
    */
   
}

















