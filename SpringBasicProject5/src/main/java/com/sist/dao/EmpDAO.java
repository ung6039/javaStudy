package com.sist.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



// <bean id ="eDao" class="com.sist.dao.EmpDAO"/>
// 아이디를 주지 않으면 자동 생성 (empDAO(클래스명, !!맨 앞자리는 소문자
// MainClass => mainClass(자동_ID)


@Repository("eDao")
public class EmpDAO extends SqlSessionDaoSupport{
	
	@Override
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		
		super.setSqlSessionFactory(sqlSessionFactory);
	}


	public List<EmpVO> empAllData(){
		
		return getSqlSession().selectList("empAllData");
		// -> open과 close를 자동 생성해줌
		
		/*
		 	 try{
		 	 	session= ssf.openSession();
		 	 	session.selectList("~~~");
		 	 }catch(Exception ex)
		 	 {
		 	 }finally{}
		 */
	}
	
	public EmpVO empFindData(int no){
		return getSqlSession().selectOne("empFindData",no);
	}
	
}
