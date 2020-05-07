package com.sist.temp;

import javax.annotation.Resource;
import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/*
 	app
 	=======================================
 	key			class 주소
 	=======================================
 	boardDAO    100
 	=======================================
 	noticeDAO	200
 	=======================================
 	mainClass   300 => MyDAO   ===> mainClass를 가져와야 myDao의 주소 값을 가져옴
 	=======================================
 */


@Component
public class MainClass {
	
	/*@Autowired
	@org.springframework.beans.factory.annotation.Qualifier("noticeDAO")*/
	
	@Resource(name="noticeDAO")
	private MyDAO dao;
	
	@Resource(name="boardDAO")
	private MyDAO tmpdao;
	// 관련된 클래스를 찾아서 메모리를 할당해줌
	// 등록되어 있는 객체를 넣어줌 -> 할당된 객체의 주소가 dao에 저장됨 (autowired)
	// Autowired:: private 변수를 설정해도 제어가 가능함
	// setter를 생성하지 않고 제어가 가능
	// !! 자동 주입 !!
	//!error
	//autowired 같은 객체를 가지고 있는 클래스가 복수일 경우 값을 넣어줄 객체를 찾을 수가 없음
	// 특정 객체를 지정할 때 @querifier
	
	public static void main(String[] args) {
		
		ApplicationContext app=
				 new ClassPathXmlApplicationContext("app.xml");
		// app는 할당된 모든 메모리의 주소값을 가지고 있음
		MainClass mc = (MainClass)app.getBean("mainClass");
		MainClass tc = (MainClass)app.getBean("mainClass");
		// 스프링에 등록된 정보를 가져왔음
		//MainClass mc1 = new MainClass();
		// 그냥 불러왔음
		
		
		mc.dao.select();
		mc.dao.insert();
		System.out.println("--------------------");
		tc.tmpdao.select();
		tc.tmpdao.insert();

	}

}
