package com.sist.dao;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sist.dao.*;


public class CroDAO {
	
	private static SqlSessionFactory ssf;
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader("Config.xml");
			ssf = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			System.out.println("오류?");
			e.printStackTrace();
		}
		
		
	}
	
	
	public List<SearchVO> ListAllData(){
		
		SqlSession session = null;
		List<SearchVO> list = new ArrayList<SearchVO>();
		try {
			session = ssf.openSession();
			list = session.selectList("ListAllData");
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		return list;
	}
	
 
	
}
