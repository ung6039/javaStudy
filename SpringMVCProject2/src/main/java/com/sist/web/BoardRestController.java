package com.sist.web;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sist.dao.*;

/*
 	script 처리 할 때 사용
 	html이 넘어가는 것이 아니라 문자열이 넘어감
 	
 	@ResponseBody => @RestController
*/
@RestController
public class BoardRestController {
	
	@Autowired
	private BoardDAO dao;
	
	@PostMapping("board/update_ok.do")
	public String board_update_ok(BoardVO vo){
		
		String result="";
		boolean bCheck = dao.boardUpdate(vo);//DAO 연동 (pw check)
		if(bCheck == true){
			result="<script>location.href=\"detail.do?no="+vo.getNo()+"\"</script>";
		}
		else{
			result="<script>"
					+ "alert(\"Password Fail!!\");"
					+ "history.back();"
					+ "</script>";
		}
		
		return result;
	}
	
	@PostMapping("board/delete_ok.do")
	public String board_delete_ok(int no,String pwd){
		
		String result="";
		boolean bCheck = dao.boardDelete(no, pwd);//DAO 연동 (pw check)
		if(bCheck == true){
			result="<script>location.href=\"list.do\"</script>";
		}
		else{
			result="<script>"
					+ "alert(\"Password Fail!!\");"
					+ "history.back();"
					+ "</script>";
		}
		
		return result;
	}
	
}
