package com.sist.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
@Repository
public class ReplyDAO {
   @Autowired
   private ReplyMapper mapper;
   
   public void replyInsert(ReplyVO vo)
   {
	   mapper.replyInsert(vo);
   }
   
   public List<ReplyVO> replyListData(int mno)
   {
	   return mapper.replyListData(mno);
   }
   /*
    *     try
    *     {
    *          getConnection();
    *          conn.setAutoCommit(false);
    *          ===========================
	    *          ReplyVO pvo=mapper.replyParentInfoData(pno);
				   mapper.replyGroupStepIncrement(pvo);// Commit
				   vo.setGroup_id(pvo.getGroup_id());
				   vo.setGroup_step(pvo.getGroup_step()+1);
				   vo.setGroup_tab(pvo.getGroup_tab()+1);
				   vo.setRoot(pno);
				   mapper.replyReplyInsert(vo);// 
				   mapper.replyDepthIncrement(pno);
			   conn.commit()
			   =============   Around
    *     }catch(Exception ex)
    *     {
    *          conn.rollback() AfterThrowing
    *          System.out.println(ex.getMessage())
    *     }
    *     finally
    *     {
    *         conn.setAutoCommit(true)  After
    *     }
    */
   @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
   public void replyReplyInsert(int pno,ReplyVO vo)
   {
	   ReplyVO pvo=mapper.replyParentInfoData(pno);
	   mapper.replyGroupStepIncrement(pvo);// Commit
	   vo.setGroup_id(pvo.getGroup_id());
	   vo.setGroup_step(pvo.getGroup_step()+1);
	   vo.setGroup_tab(pvo.getGroup_tab()+1);
	   vo.setRoot(pno);
	   mapper.replyReplyInsert(vo);// 
	   mapper.replyDepthIncrement(pno);
	   
   }
   
   public void replyUpdate(ReplyVO vo)
   {
	   mapper.replyUpdate(vo);
   }
}















