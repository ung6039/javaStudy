package com.sist.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.dao.MusicDAO;
import com.sist.dao.MusicVO;
import com.sist.dao.ReplyDAO;
import com.sist.dao.ReplyVO;

@Controller
public class MainController {
	
	@Autowired
	private MusicDAO dao;
	
	@Autowired
	private ReplyDAO rdao;
	
    @RequestMapping("main/list.do")
    public String main_list()
    {
    	return "main/list";
    }
    @RequestMapping("main/detail.do")
    public String main_detail(Model model, int mno){

    	MusicVO vo = dao.musicDetailData(mno);
    	 JSONObject obj = new JSONObject();
  	   	 obj.put("mno", vo.getMno());
  	   	 obj.put("title", vo.getTitle());
  	   	 obj.put("singer", vo.getSinger());
  	   	 obj.put("album", vo.getAlbum());
  	   	 obj.put("state", vo.getState());
  	   	 obj.put("idcrement", vo.getIdcrement());
  	   	 obj.put("poster", vo.getPoster());
  	   	 obj.put("key",vo.getKey());
  	   	 
  	   	model.addAttribute("json",obj.toJSONString());
    	model.addAttribute("mno",mno);
    	List<ReplyVO> rList = null;
    	try{
    		rList = rdao.replyListData(mno);
    		model.addAttribute("rList",rList);
    	}catch(Exception ex){
    		ex.printStackTrace();
    		rList = null;
    	}
    	if(rList ==null){
    		System.out.println("댓글 : null");
    	}
    	else{
    		System.out.println("댓글 : "+rList.size());
    	}
    	
    	
    	return "main/detail";
    }
    
    @GetMapping("main/login.do")
    public String main_login(){
    	
    	return "main/login";
    }
    /*
     	request,response,session,pageContext,page, exception, config, out => DispatcherServlet
     	list.do
     	
     	Cookie cook = new Cookie()
     	 => response.addCookie(cook)
     	다운로드 => response
     	
     */
    @PostMapping("main/login_ok.do")
    public String main_login_ok(String id,String pwd,Model model,HttpSession session){
    	
    	String result=" ";
    	int count= dao.idCount(id);
    	if(count == 0){ // ID가 없는 경우
    		result="NOID";
    	}
    	else{ // ID가 존재하는 경우
    		String db_pwd =dao.memberGetPassword(id);
    		if(db_pwd.equals(pwd)){
    			
    			result="OK";
    			session.setAttribute("id", id);
    		}
    		else{
    			result="NOPWD";
    		}
    	}
    	model.addAttribute("result",result);
    	return "main/login_ok";
    }
    @RequestMapping("main/logout.do")
    public String main_logout(HttpSession session){
    	
    	session.invalidate();// session 해제
    	
    	
    	return "redirect:list.do";
    }
    @RequestMapping("main/reply_insert.do")
    public String reply_insert(ReplyVO vo, HttpSession session){
    	System.out.println("확인 : "+vo.getMno()+"zhzh");
    	String id = (String)session.getAttribute("id");
    	
    	vo.setId(id);
    	System.out.println("no 확인 : "+vo.getNo());
    	try{
    		rdao.replyInsert(vo);
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    	
    	return "redirect:detail.do?mno="+vo.getMno();
    	
    }
    
    @RequestMapping("main/reply_reply_insert.do")
    public String reply_reply_insert(int pno, int mno,String msg,HttpSession session){
    	
    	// 추가
    	ReplyVO vo = new ReplyVO();
    	String id =(String)session.getAttribute("id");
    	vo.setMno(mno);
    	vo.setMsg(msg);
    	vo.setId(id);
    	
    	rdao.replyreplyInsert(pno, vo);
    	
    	return "redirect:detail.do?mno="+mno;
    }
    
    @RequestMapping("main/reply_update.do")
    public String reply_update(ReplyVO vo){
    	// 수정 => DAO
    	rdao.replyUpdate(vo);
    	return "redirect:detail.do?mno="+vo.getMno();
    }
    
    @RequestMapping("main/reply_delete.do")
    public String reply_delete(int no, int mno){
    	
    	//DAO
    	rdao.replyDelete(no);
    	return "redirect:detail.do?mno="+mno;
    }
   
}