// String : 문자열을 제어
/*
 	java.lang => import를 생략할 수 있다.
 	문자열을 저장하는 방법
 		1) String 변수명 : "Hello java";
 		2) String 변수명 : new String("Hello Java");// 같은 문자열 => 별도로 저장
 					    ====
 					        새로운 메모리에 저장
 		String에서 제공하는 기능
 		1) equals : 저장된 문자열 같은지 여부를 확인 (true/false) // 로그인 할 때 사용
 		// char 배열을 가지고 제어하는 것
 				ID, PWD   ==> 로그인 (대소문자 구분)
 				문자열은(==)을 사용하면 안된다. -> 문자열 비교는 equals를 이용해서 비교를 진행해야한다.
 				
 				String s = "Hello";
 				String s1 = "Hello";
 				String s2 = new String("Hello");
 				if(s==s1)  true ; //문자열 자체 주소
 				if(s == s2) false;
 				if(s.equals(s1)) 
 				" == " = 데이터 값을 비교하는 것이 아니라 저장된 주소 값을 비교하는 것임
 				s.equals("hello") => 데이터 값이 서로 같은지 물어보는 것
 				=> 원형
 					boolean equals(String data)
 					
 		2) substring : 문자열을 자를 때
 				String s = "0123456789";
 				substring(3) => 3번부터 맨 마지막까지 가져오는 것
 				String s = "112분,15세이상관람가"
 				substring(0,3) => "112"
 						    ==
 						    end-1 ==> 012 "분"까지 자르게 되면 정수형으로 변환이 어려움
 						    	주로 확장자를 자를 때 substring을 가져옴
 						    
 				substring(int start);
 				substring(int start,int end);
 			
 			(엄청 많이 나오는 함수) 잘 기억해야함
 			부트 스트립이나 문자열이 디자인의 크기에 미치지 못할 때 남은 문자열을 잘라서 ... 으로 표시하거나
 			밑으로 내려 줄 때 substring 메서드를 사용해서 진행함
 			데이터를 긁어올 때에도 substring으로 잘라서 사용 ex) 128분, 12세이상관람가
 											    변수 : 시간(int)  등급 (String)
 			
 			나와 맞지 않는 데이터들은 자르고 들어올 수 있어야 한다.
 		3) length : 문자열 개수  => 1글자당 2byte씩으로 계산됨
 			String s = "Hello 홍길동 ";
 			web과 모바일에서 사용되는 내용
 		4) trim : 좌우의 공백문자 제거
 			String s = "Hello Java";
 			 		=> s.trim().length;  // s = Hello Java로 생각해야함
 			 		   trim() : 좌우에 있는 공백만 제거함 (중간에 있는 공백은 제거 되지 않음)
 			 		   		 - 사이트에 로그인 할 때 문자열을 받아서 저장하고 공백은 제거하고 진행됨
 		5) startsWtih, endsWith  => 원하는 단어를 찾게 도와주는 메서드
 			서제스트를 만들 때 사용
 			startsWith -> 앞의 문자열이 같을 때 글자로 시작되는 글자를 찾아라
 			startsWith("자바")
 			endsWith = 자바가 포함된 글자를 찾아라 ( 검색기를 찾을 때 사용 )
 		6) indexOf, lastIndexOf
 			문자의 위치(indexOf:앞에서, lastIndexOf: 뒤에서)
 									=> 앞에서 부터 찾지만 그 뒤에 있는 것
 			String s = "Hello Java";
 						0123456789
 			s.indexOf('a'); ==> 7번 도메인 주소
 			s.lastindexOf('a'); ==> 9번 / 경로 명을 잘라서 사용 할 때 https://  ==> /뒤에서 잘라서 사용할 때
 									==> 확장자 명을 잘라서 가져올 때 a.aa.txt 
 		7) split (정렬)
 			String s = "이병헌, 하정우, 마동석, 전혜진, 수지";
 			=> 구분을 해서 자르고 싶을 때
 			String[] names = s.split(",")
 			정규식
 			=====
 				211.238.142.181
 				211.238.142.180
 				211.238.142.1
 				211.238.142.23
 				211.238.142.0
 				이와 같은 형식을 가진 것을 찾아라
 				[0-9]{1,3} : 0에서 9자리 일 때 1자리~ 3자리까지
 				[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 				-> ip 주소를 긁어올 때 사용
 				-> 빅데이터와 데이터 수집에 필수적
 				var regex = /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
 				
 		8) toUppercase, toLowerCase
 			대문자 변환			소문자 변환
 			String s = " Hello ";
 			s.toUpperCase() ==> Hello를 대문자로 바꿔라 ==> HELLO
 			s.tolowerCase() ==> hello
 		
 		9) replace, relaceAll  => 정규식
 					형식에 맞는 것을 가지고 오는 것은 어려움
 		 				--> 문자 형식틀을 만들어 주는 것 : 정규식
 		 
 					 String s = "113분";
 					 // [^] : 제외한다라는 의미(부정)
 					 // ^[] : 시작된다.
 					 // $ 끝이 났다.
 					 s.replaceAll("[^0-9]$","")  ==> 113
 					  					=> 숫자를 제외한 나머지를 추출해라
 					 s.replaceAll("^[0-9]","")  ==> 113
 					 s.replaceAll("[^가-힣]","") - 한글 전체
 					 s.repalceAll("[^A-Za-z]","") - 영문을 제외하고 전부 지워라
 					 --> 트위터나 페이스북에서 데이터를 긁어 왔을 때 내용들을 추려내기 위해서 사용
 					 
 					짜 + --> 짜로 시작하는 모든 데이터를 가져오는 것
 		  =========
 		    변경 ==> String s ="Hello Java";
 		    		s.replace('a','b');  ==> Hellojbvb
 		    					--> 문자'a'를 전부 'b'로 바꿔라
 		  데이터를 긁어올 때 html로 되어 있지 않는 경우가 있음 ex) 유튜브
 		  오라클에 나옴 -> 패턴을 가지고 나옴
 		
 		10) contanis() : 포함된 문자를 찾는 경우
 		 			-> equals의 경우 문자열 전체를 읽기 때문에 문자열 중간에 있는 단어를 찾을 수는 없음
 		 			ex) 네이버 추천 검색어 : "특정 검색어"가 블로그에 얼마나 검색 되는지를 확인
 		
 		
 		 					
 */
import java.util.Scanner;
public class 문자열클래스다시공부 {

	static String[] autoComplete(String data) {
		
		String[] ss = {
				"자바와 JSP", "자바 프로그래밍", "스프링 5", "AJAX와 JSP", "리덕스와 리액트",
				"자바 오라클", "MVC 구조", "코틀린과 안드로이드","마이구미", "코틀린 프로그램",
				"스프링 데이터", "혼자 배우는 자바", "지능형 웹 프로그램","웹 프로그램", "자바 웹",
				"오라클 자바"
				};
		String[] findDate = new String[10];
		int j =0;
		for(int i =0; i<ss.length; i++) {
//			if(ss[i].startsWith(data)) 
			if(ss[i].contains(data))
			{
			// true / false을 돌려주는 기능을 가지고 있음
				findDate[j] =ss[i];// 나중에는 배열에 저장하지 않고 arraylist를 사용해서 찾은 개수만큼 가져오게 된다.
				j++;
			}
		}
		return findDate;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String data = sc.next();
		
		String[] fd = autoComplete(data);
		for(int i =0; i<fd.length; i++) {
			if(fd[i] != null) {
				System.out.println(fd[i]);
			}
		}
	
	}
}
