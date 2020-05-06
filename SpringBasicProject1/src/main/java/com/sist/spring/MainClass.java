package com.sist.spring;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

public class MainClass {
	
	private EmpDAO dao;
	// EmpDAO dao = "dao"
	
	// EmpDAO dao = new EmpDAO()--> dao-ref="dao"
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}
	
	public static void main(String[] args) {
		
		// DL : 등록된 클래스를 읽어 올 때
		// DI : 값을 대입할 때 사용
		
		// app.xml  parser
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		
		
		//DL :: 내가 등록한 클래스를 찾아오는 것 :getbean()을 사용하면  DL
		MainClass mc = (MainClass)app.getBean("mc");
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
