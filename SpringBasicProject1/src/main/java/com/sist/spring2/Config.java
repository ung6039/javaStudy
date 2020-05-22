package com.sist.spring2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	// <bean id="empDAO" class="com.sist.spring2.EmpDAO">
	@Bean
	public EmpDAO empDAO(){
		
		EmpDAO dao = new EmpDAO();
		dao.setDriverName("oracle.jdbc.driver.OracleDriver");
		dao.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dao.setUsername("hr");
		dao.setPassword("happy");
		dao.init();
		return dao;
	}
	
}
