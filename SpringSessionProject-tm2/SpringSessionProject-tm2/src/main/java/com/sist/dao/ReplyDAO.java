package com.sist.dao;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ReplyDAO {
	
	@Autowired
	private ReplyMapper mapper;
	
	public void replyInsert(ReplyVO vo){
		mapper.replyInsert(vo);
	}
	
	public List<ReplyVO> replyListData(int mno){
		return mapper.replyListData(mno);
	}
	
	
	/*
	 	try{
	 		getConnection();
	 		conn.setAutoCommit(false);
		 		ReplyVO pvo = mapper.replyParentInfoData(pno);
				mapper.replyGroupStepIncrement(pvo);
				// commit
				vo.setGroup_id(pvo.getGroup_id());
				vo.setGroup_step(pvo.getGroup_step());
				vo.setGroup_tab(pvo.getGroup_tab());
			vo.setRoot(pno);
	 		conn.commit();
	 		==============    Around
	 	}catch{
	 		conn.rollback() AfterThrowing
	 		System.out.println(ex.getmessage())
	 	}fainlly{
	 		conn.setAutoCommit(true);   After
	 	}
	 */
	
	// insert와 update가 연관되어 있어 트랜잭션으로 처리해야함
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public void replyreplyInsert(int pno,ReplyVO vo){
	    
		//댓글을 등록할 상위 댓글(?)	
		ReplyVO pvo = mapper.replyParentInfoData(pno);
		mapper.replyGroupStepIncrement(pvo);
		// commit
		vo.setGroup_id(pvo.getGroup_id());
		vo.setGroup_step(pvo.getGroup_step());
		vo.setGroup_tab(pvo.getGroup_tab());
		vo.setRoot(pno);
		
		// 댓글에 댓글의 내용 저장
		mapper.replyReplyInsert(vo);
		mapper.replyGroupStepIncrement(vo);
		mapper.replyDepthIncrement(pno);
	}
	public void replyUpdate(ReplyVO vo){
		mapper.replyUpdate(vo);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public void replyDelete(int no){
		
		ReplyVO vo = mapper.replyInfoData(no);// depth,root
		if(vo.getDepth()==0){
			
			mapper.replyDelete(no);
		}
		else{
			ReplyVO rvo = new  ReplyVO();
			rvo.setNo(no);
			rvo.setMsg("관리자가 삭제한 댓글입니다.");
			mapper.replyMsgUpdate(rvo);
		}
		mapper.replyDepthDecrement(vo.getRoot());
		
	}
}
