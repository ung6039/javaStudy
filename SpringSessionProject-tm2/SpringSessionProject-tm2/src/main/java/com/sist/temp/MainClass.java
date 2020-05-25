package com.sist.temp;

import java.sql.SQLException;
import java.util.List;

import com.sist.temp.*;
public class MainClass {

	
	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		MemberVO vo = new MemberVO();
		vo.setNo(1);
		vo.setName("홍반장");
		vo.setSex("남");
		
		
		MemberVO vo1 = new MemberVO();
		vo1.setNo(1);
		vo1.setName("홍반점");
		vo1.setSex("여");
		
		try {
			dao.memberInsert(vo1, vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
