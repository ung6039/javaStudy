package com.sist.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass2 {
	private EmpDAO dao;
	// EmpDAO dao = "dao"
	
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}
	
	// EmpDAO dao = new EmpDAO()--> dao-ref="dao"
	
	public static void main(String[] args) {
		
		// DL : 등록된 클래스를 읽어 올 때
		// DI : 값을 대입할 때 사용
		
		// app.xml  parser
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		
		
		//DL :: 내가 등록한 클래스를 찾아오는 것 :getbean()을 사용하면  DL
		MainClass2 mc = (MainClass2)app.getBean("mc2");
		//EmpDAO dao = (EmpDAO)app.getBean("dao");
		List<EmpVO> list = mc.dao.empAllData();
		
		for(EmpVO vo : list){
			System.out.print(vo.getEmpno());
			System.out.print(" " +vo.getEname());
			System.out.print(" "+vo.getJob());
			System.out.print(" "+vo.getHiredate());
			System.out.print(" 급여:"+vo.getSal());
			System.out.println();
		}
		
	}



	
}
