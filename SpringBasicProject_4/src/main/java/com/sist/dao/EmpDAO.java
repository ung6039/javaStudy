package com.sist.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class EmpDAO extends SqlSessionDaoSupport{

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
