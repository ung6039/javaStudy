package com.sist.spring;

import java.util.*;
// 스프링이 관리하는 클래스가 아님 ==> 일반 데이터형(int ... )

/*
 	sqlSessionFactory
	-> 등록
	  1) XML
	  2) Annotation만 이용
	  3) XML + Annotation (( *자주 사용  ))
	  ====================
	  	=> Annotation : 사용자 정의 클래스
	  	=> XML : 라이브러리 등록  :: @ 라이브러리에는 어노테이션으로 
	  							등록할 수 없어서 xml로 등록
	  	   => MyBatis, JDBC ...
 */
public class EmpVO {

	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int comm;
	private int sal;
	private int deptno;
	
	
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}
