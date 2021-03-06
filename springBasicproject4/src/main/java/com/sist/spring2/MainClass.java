package com.sist.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		ApplicationContext app
		= new ClassPathXmlApplicationContext("app2.xml");
		
		EmpDAO dao = (EmpDAO)app.getBean("dao");
		List<EmpVO> list = dao.empAllData();
		for(EmpVO vo : list){
			System.out.println(vo.getEname()+" "+vo.getJob()+" "+vo.getHiredate().toString());
		}
		
	}
}
