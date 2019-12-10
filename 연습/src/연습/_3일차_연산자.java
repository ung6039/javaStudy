package 연습;

import java.util.Scanner;

public class _3일차_연산자 {

	public static void main(String[] args) {
		// 입력한 값을 받아서 저장
		//랜덤(난수) => 임의의 수를 저장
//		int a = (int)(Math.random()*100)+1;
//		//Math.random() = 0.0 ~0.99
//		System.out.println("a = "+a);
//		
//		Scanner sc = new Scanner(System.in);
//		// System.in (in)이라는 키워드는 키보드의 입력값을 받는다는 의미
//		
//		System.out.print("정수 입력 :");
//		int b = sc.nextInt();
//		System.out.println("b = " + b);
//		System.out.print("국어 : " );
//		int kor = sc.nextInt();
//		
//		//문제 1
//		int m = 65430;
//		int m1 = m/10000;
//		System.out.println(m1);
//		int m2 = (m/1000)%10;
//		System.out.println(m2);
//		int m3 = (m%1000)/100;
//		int m4 = (m%100)/10;
		
		// 문제 2. 급여 명세서
		int meta = 1500;
		int ddo = 550;
		double a = meta*0.1;
		System.out.println("실수령액 = 기본급 + 시간수당 -세금");
		System.out.println("실수령액 = "+(meta+ddo-a));
		
		//문제 3.
		String name = "홍길동";
		String department = "개발부";
		String position = "대리";
		int sal = 1500000;
		
		System.out.println("이름 : "+ name);
		System.out.println("부서 : "+ department);
		System.out.println("직책 : "+ position);
		System.out.println("급여 : "+ sal);
		
		//문제 5.
		int year;
		Scanner A = new Scanner(System.in);
		System.out.println("윤년 구하는 프로그램");
		System.out.print("년도 입력 : ");
		year = A.nextInt();
		if(year % 4 == 0) {
			if(year % 400 == 0 || year % 100 != 0) {
				System.out.println("윤년 = "+year);
			}
		}
		else System.out.println("평년 = "+year);

		//문제 7. 문자 ch 저장된 문자가 대문자인 경우에 소문자
		
		char ch = 'A';
		char lowerCase = (char)((ch=='A')? ch+32:ch);
		System.out.println("ch : "+ ch);
		System.out.println("ch to lowerCase" + lowerCase);
		
		
		
		
	}

}
