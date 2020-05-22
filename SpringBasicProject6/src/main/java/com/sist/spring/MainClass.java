package com.sist.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;
import java.util.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.sist.dao.*;

/*
클래스 메모리 할당
@Component, @Repository, @Service, @Controller, @RestController, @ControllerAdvice, 

주입(DI)
@Required, @Autowired, @PostConstruct, @PreDestroy, @Resource
*/
@Component
public class MainClass {
	
	@Autowired
	private EmpDAO dao;
	// init - method (( 드라이버등록시 자동 시작))
	@PostConstruct  // methodDI
	public void init(){
		System.out.println("========= 사원 정보  =======");
	}
	
	// destory-method 
	@PreDestroy    // methodDI
	public void destory(){
		System.out.println("======== 프로그램 종료 =======");
	}
	public static void main(String[] args) {
		
		GenericXmlApplicationContext app =
				new GenericXmlApplicationContext("app.xml");
		
//		ApplicationContext app = 
//				new ClassPathXmlApplicationContext("app.xml");
		
		MainClass mc = (MainClass)app.getBean("mainClass");
		List<EmpVO> list = mc.dao.empAllData();
		
		/*for(EmpVO vo : list){
			System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getMgr());
		}*/
		
		EmpVO vo = mc.dao.empFindData(7788);
		System.out.println("사번 : "+vo.getEmpno());
		System.out.println("이름 : "+vo.getEname());
		System.out.println("직위 : "+vo.getJob());
		System.out.println("입사일 : "+vo.getHiredate());
		System.out.println("급여 : "+vo.getSal());
		
		app.close();
	}

}
