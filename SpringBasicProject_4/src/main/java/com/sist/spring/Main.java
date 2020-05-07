package com.sist.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.*;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		//1. xml 파일 읽기
		ApplicationContext app =
				new ClassPathXmlApplicationContext("app.xml");
		EmpDAO dao = (EmpDAO)app.getBean("dao");
		
		List<EmpVO> list = dao.empAllData();
		
		for(EmpVO vo : list){
			System.out.println(vo.getEmpno()+" "+vo.getEname()+" ~~"+vo.getSal());
		}
		
		
	}
}
