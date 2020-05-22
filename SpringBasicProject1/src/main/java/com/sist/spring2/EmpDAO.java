package com.sist.spring2;
import java.util.*;
import java.sql.*;

/*
 	 class A
 	 {
 	 	private String name;
 	 	
 	 	public void setName(String name){
 	 		this.name= name;
 	 	}
 	 }
 	 A a;
 	 a.setName("홍길동");
 	 
 	 드라이버 등록은 한 번만!
 	 그래서 생성자 등록!
 	 
 	 get,set은 여러번 사용
 	 
 */
public class EmpDAO {
//	public 이어도 setMethod의 값을 입력해야한다.
// 필요한 데이터가 있을 때에는 값을 채워줘야함
	
	private Connection conn;
	private PreparedStatement ps;
	private String driverName;
	private String url;
	private String username;
	private String password;

	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
/*
 	---------------------------------------------------------------
*/
	public void init(){
		
		try{
			Class.forName(driverName);
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public void getConnection(){
		try{
			conn = DriverManager.getConnection(url,username,password);
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}
	public void disConnection(){
		try{
			
			if(ps!=null){
				ps.close();
			}
			if(conn!=null){
				conn.close();
			}
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
