package com.sist.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext app
		= new ClassPathXmlApplicationContext("app.xml");
		DeptDAO dao = (DeptDAO)app.getBean("dao");
		List<DeptVO> list = dao.deptAllData();
		for(DeptVO vo : list){
			System.out.println(vo.getDeptNo()+" "+vo.getDname());
		}
		
		
	}
}
