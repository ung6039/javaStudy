package com.sist.dao;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*
 	Model => Controller => BoardController(o)
 	VO
 	DAO(o)
 	Service(o)
 	Manager(o)
 	================================================ Model
 	--> VO 빼고 spring에서 관리
 	==> 생성부터 소멸까지 관리하기 때문에 spring에서 관리
 	
 	@Component
 	@Repository
 	@Service
 	@Controller
 	@RestController
 	
 	순서__ 스프링에서 객체를 관리할 때 사용하는 생명주기
 	===
 	1) 메모리 할당 => 등록된 모든 클래스 =======> Map에 저장
 	   c: or <constructor> (( 생성자의 값이 있는지 확인) 
 	2) p: or <property> 확인 ( DI 존재 여부 확인 )
 	3) 존재하면 => setXxx() 메서드에 주입
 	4) 메서드 DI가 존재하는지 여부 확인 (init-method)
 	5) 존재하면 => 메서드 호출
 	====================================================
 	6) 프로그래머가 필요한 메서드 호출 ( 사용자 사용 )
 		=> 프로그램 종료를 하거나 사이트를 이동할 때  => 컨테이너가 닫힘 (( spring.close() ))
 		=> 모든 객체가 종료
 	====================================================
 	7) 메서드 존재여부 확인( destory-method )
 	8) 객체 소멸
 	================================================
 	# 스프링의 기본은 싱글톤
 	
 */
@Repository
public class MemberDAO {
	
	@Autowired
	private MemberMapper mapper;
	
	public List<MemberVO> memberAllData(){
		return mapper.memberAllData();
	}
	public MemberVO memberDetailData(int no){
		return mapper.memberDetailData(no);
	}
	public void memberInsertData(MemberVO vo){
		mapper.memberInsert(vo);
	}
	
	public void Temp(MemberVO vo){
		mapper.memberInsertTemp(vo);
	}
}
