package com.sist.temp;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MemberDAO dao=new MemberDAO();
        MemberVO vo=new MemberVO();
        vo.setNo(1);
        vo.setName("ȫ�浿");
        vo.setSex("��");
        
        MemberVO vo1=new MemberVO();
        vo1.setNo(2);
        vo1.setName("��û��");
        vo1.setSex("����");
        
        dao.memberInsert(vo, vo1);
	}

}
