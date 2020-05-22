package com.sist.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // XML 파싱 
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		/*
		 *    class A
		 *    
		 *    A a=new A();
		 *      => A b=a;
		 *    A b=new A();
		 */
		// 등록된 클래스를 사용 
		Sawon sa=(Sawon)app.getBean("sa5");//DL+DI=DI(IoC)
		System.out.println("sa="+sa);
		System.out.println("사번:"+sa.getSabun());
		System.out.println("이름:"+sa.getName());
		System.out.println("부서:"+sa.getDept());
		//sa.display();
		//sa.setSabun(1);
		//sa.setName("홍길동");
		//sa.setDept("개발부");
		//Sawon sa1=(Sawon)app.getBean("sa");
		//System.out.println("sa1="+sa1);
		//sa1.display();
		//sa1.setSabun(2);
		//sa1.setName("심청이");
		//sa1.setDept("영업부");
		
		//System.out.println(sa.getName());
		//System.out.println(sa1.getName());
	}

}










