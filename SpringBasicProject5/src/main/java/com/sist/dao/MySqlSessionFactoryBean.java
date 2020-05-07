package com.sist.dao;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

/*
 * @autoWired : 생성된 객체를 자동으로 값을 넣어줌 :: 의존 자동 주입 (Autowired)
 * @Qualifier("ds") -> ds객체의 정보를 저장해라
 * @Resource("ds") ds란 아이디를 가진 객체를 저장해라
  
  Autowired -> 자동주입(클래스의 메모리 주소만 주입) => 스프링에 등록된 클래스 사용이 가능
  @Target(value={ANNOTATION_TYPE, CONSTRUCTOR, FIELD, METHOD, PARAMETER})
 
 X
 public class A{
 	@
 	MyDAO dao; => Field(
 	
 	@
 	public A(MyDAO dao){} => 생성자
 	
 	@
 	public void setMyDAO(MyDAO dao){} => parameter
 	
 	@
 	public void display(MyDAO dao){} => 
 }
 
 
 	@(X)-> 클래스 객체가 생성되지 않으면 autowired를 사용할 수 없음
 	public A(String name){} => 생성자
 */


/*
 	=> 클래스 메모리 할당(클래스 관리자)
 	=> 멤버 변수에 값을 주입
 	=> 클래스의 메모리를 해제(***)
 	=> 반복적인 코딩을 제거  => 소스의 간결화, 가독성, 공통성
 	=>  
 */
import java.sql.*;
import java.util.*;
@Component("ssf")
public class MySqlSessionFactoryBean extends SqlSessionFactoryBean{
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}// ds의 정보가 저장됨
	
	// ssf _ 생성자
	public MySqlSessionFactoryBean(){
		try{
			// 충돌되는 클래스는 패키지명을 같이 붙여주어야함
			org.springframework.core.io.Resource res 
				= new ClassPathResource("Config.xml");
			setConfigLocation(res);
			
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
}
