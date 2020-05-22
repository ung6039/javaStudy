package com.sist.aspect;

import org.apache.ibatis.plugin.Signature;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// 공통 모듈임
@Aspect
@Component
public class MyAspect{
/*
 	public void emp_select(){
 		getConnection() :: Before
 		문장
 		disConnection() :: After
 	}
 */
	
	/*
	 	* com.sist.dao.EmpDAO.emp_*(..)
	   == ========== 클래스명       ===== 시작하는 메서드 .. (매개변수는 관계없이)
	 	return형				  매개변수 (X), 매개변수(1), 매개변수(여러 개)
	 	
	 */
	//메소드 호출전
	@Before("execution(* com.sist.dao.EmpDAO.emp_*(..))")
	public void getConnection(){
		System.out.println("오라클 연결");
	}
	// finally
	@After("execution(* com.sist.dao.EmpDAO.emp_*(..))")
	public void disConnection(){
		System.out.println("오라클 연결 해제");
	}
	
	// 정상수행이 된 경우
	@AfterReturning(value="execution(* com.sist.dao.EmpDAO.emp_*(..))",returning="ret")
	// returning ="ret" => return 값을 받아옴
	public void returnValue(Object ret){
		// delete 
		if(ret!=null)
		System.out.println(ret);
	}
	// 메서드 수행하는 과정 => 오류가 발생했을 경우 처리
	// 포인트컷
	@AfterThrowing(value="execution(* com.sist.dao.EmpDAO.emp_*(..))",throwing="ex")
	// 오류를 읽어옴
	public void exceptionValue(Throwable ex){
		System.out.println(ex.getMessage());
	}
	
	// 호출한 시점이 나오는 것: joinPoint, 트랜잭션 처리
	@Around("execution(* com.sist.dao.EmpDAO.display())")
	public Object display(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(jp.getSignature().getName());
		long start = System.currentTimeMillis();
		//setAutoCommit(false);
		Object obj = jp.proceed();
		// conn.commit()
		long end =System.currentTimeMillis();
		System.out.println("수행 시간 : "+(end-start));
		
		return obj;
	}
}

