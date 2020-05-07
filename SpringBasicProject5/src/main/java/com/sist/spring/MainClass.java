package com.sist.spring;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sist.dao.*;

@Component
public class MainClass {
	@Autowired
	private EmpDAO dao;
	
	public static void main(String[] args) {
		
		ApplicationContext app=
				 new ClassPathXmlApplicationContext("app.xml");
	/*	EmpDAO dao = (EmpDAO)app.getBean("eDao");
		List<EmpVO> list = dao.empAllData();
		for(EmpVO vo: list){
			System.out.println(vo.getEmpno()+" "+vo.getEname()+" ~~"+vo.getSal());
		}
	*/
		MainClass mcc = new MainClass();
		MainClass mc= (MainClass) app.getBean("mainClass");
		System.out.println(mc.dao);
		
		List<EmpVO> list = mc.dao.empAllData();
		for(EmpVO vo : list){
			System.out.println(vo.getDeptno()+" "+vo.getEname()+" "+vo.getSal());
		}
	}
		
}
