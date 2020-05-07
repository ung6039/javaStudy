package com.sist.dao;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Component;
/*
 	 클래스 메모리할당할때 사용하는 어노테이션
 	 @Component  : 일반 클래스  
 	 @Repository  : DAO 
 	 @Service	: BI => DAO+DAO (dao여러개를 하나로 묶을 경우 ex) 댓글이 올라갈 때)
 	 			==> service VS DAO의 차이점 :: 
 	 			service: dao+dao (join,subQuery를 사용할 경우 뭉쳐서 처리)
 	 			
 	 @Controller : Model (JSP 파일명)
 	 @RestController: json 전송할 때 사용하는 것, webService, 
 	 				  Restful==> 필요한 데이터만 보내주는 것(AJAX), XML.JSON
 	 @ControllerAdvice : AOP
 	 
 */
@Component("ds")
public class MyBasicDataSource extends BasicDataSource {
	
}
