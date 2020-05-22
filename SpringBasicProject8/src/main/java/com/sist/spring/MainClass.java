package com.sist.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sist.dao.*;

/*
 	DAO -> 공통으로 사용하는 것을 전역으로 두고 끌어다씀
 	# 스프링이 클래스메모리할당 
 	_> 이때 사용할 클래스도 스프링영역에 할당되어 있어야함
 	
 	insert() DAO
 	update() DAO
 	delete() DAO
 	select() DAO
 	detail() DAO
 	
 	DAO -> 지역변수(( getBean을 이용해 사용 )
 	insert() DAO
 	update() 
 	delete() 
 	select() 
 	detail()
 	
 	
 */
@Component
public class MainClass {
	@Autowired
	private MemberDAO dao;
	public static void main(String[] args) {
		
		ApplicationContext app 
		= new ClassPathXmlApplicationContext("app.xml");
		
		MainClass mc = (MainClass)app.getBean("mainClass");
		
		List<MemberVO> list = mc.dao.memberAllData();
		
		for(MemberVO vo : list){
			System.out.println(vo.getNo()+" "+vo.getName()+" "+vo.getSex());
		}
		
	}
}
