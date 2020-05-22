package com.sist.spring;

import java.util.*;

import com.sist.spring.EmpVO;

import java.sql.*;

public class EmpDAO {

	private MyBasicDataSource ds;
	public EmpDAO(MyBasicDataSource ds){
		this.ds = ds;
		try{
			Class.forName(ds.getDriverClassName());
		}catch(Exception ex){}
	}
	/* 메모리 할당 요청
	 	=> Mybatis 가지고 있는 setter에 값을 채운다
	 	=> empDAO(MyBasticDataSource ds)
	 	===================================== Spring에 요청
	 	=> MainClass 에서 호출해서 사용
	*/
	
	private Connection conn;
	private PreparedStatement ps;
	
	public void getConnection(){
		
		try{
			conn = DriverManager.getConnection(ds.getUrl(),ds.getUserName(),ds.getPassword());
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			
		}
	}
	
	public void disConnection(){
		
		try{
			if(ps!=null)ps.close();
			if(conn!=null) conn.close();
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
public List<EmpVO> empAllData(){
		
		List<EmpVO> list =new ArrayList<EmpVO>();
		try{
			getConnection();
			String sql ="SELECT empno,ename,job,hiredate,sal "
					+ "FROM emp";
			ps= conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.setSal(rs.getInt(5));
				
				list.add(vo);
			}
			rs.close();
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}finally{
			disConnection();
		}
		return list;
	}
	
}
