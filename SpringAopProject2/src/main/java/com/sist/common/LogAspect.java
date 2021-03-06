package com.sist.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	// empController에 등록된 모든 메서드
	@Around("execution(* com.sist.web.EmpController.*(..))")
	public Object around(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("사용자 요청 기능(함수 명) : "+jp.getSignature().getName());
		long start = System.currentTimeMillis();
		Object obj = jp.proceed();
		long end = System.currentTimeMillis();
		System.out.println("수행 시간 : "+(end-start));
		System.out.println(jp.getSignature().getName()+"종료");
		
		return obj;
	}
}
