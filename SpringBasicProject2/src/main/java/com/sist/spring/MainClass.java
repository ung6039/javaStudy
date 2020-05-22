package com.sist.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		
		SawonContainer sc = (SawonContainer)app.getBean("sc");
		//DL -> Id를 넣어주고 값을 찾아오는 것\
		sc.display();
		
	}
}
