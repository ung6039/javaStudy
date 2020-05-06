package com.sist.spring;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		// 컨테이너에 XML파일 전송 => 파싱 => 등록된 클래스의 메모리 할당
		ApplicationContext app =
				new ClassPathXmlApplicationContext("app.xml");
		/*
		 	클래스 메모리 할당
		 	SetXXX()에 값을 채운다
		 	init-method가 존재하면 호출
		 	======================
		 	프로그래머가 필요한 메서드를 호출해서 사용
		 	===============================
		 	destory-method를 호출
		 	메모리를 해제
		 */
		EmpDAO dao = (EmpDAO)app.getBean("dao");
		List<EmpVO> list =dao.empAllData();
		for(EmpVO vo : list){
			System.out.print(vo.getEname());
			System.out.print(" "+vo.getSal());
			System.out.print(" "+vo.getJob());
			System.out.println();
		}
		
	}
}
