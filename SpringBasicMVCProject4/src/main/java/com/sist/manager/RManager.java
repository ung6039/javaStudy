package com.sist.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.*;

import org.rosuda.REngine.Rserve.RConnection;
import org.springframework.stereotype.Component;

/*
 	 Spring => 수집(Hadoop) ==> mapreduce,spark ==> R ===> React
 	 						==================			======== Android
 	 							mongodb							======= Android
 	 															코틀린,React-Native
 */

@Component
public class RManager {

	public static void main(String[] args) {
		try{
			/*Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			Connection conn = DriverManager.getConnection(url,"hr","happy");
			String sql ="SELECT empno,ename,job,sal FROM emp";
			PreparedStatement ps =conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			String temp ="empno,ename,job,sal\n";
			while(rs.next()){
				temp+=rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","
						+rs.getInt(4)+"\n";
			}
			rs.close();
			ps.close();
			conn.close();
			
			temp=temp.substring(0,temp.lastIndexOf("\n"));
			
			FileWriter fw = new FileWriter("c:\\upload\\emp.csv");
			fw.write(temp);
			fw.close();*/
			
			RConnection rc= new RConnection();
			// send :: 명령어 입력 ::: rc.voidEval
			rc.voidEval("emp<-read.csv(\"c:/upload/emp.csv\",header=T,sep=\",\")");
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		
	}
	
}
