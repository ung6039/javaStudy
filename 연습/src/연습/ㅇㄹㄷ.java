package 연습;

import java.util.Scanner;

public class ㅇㄹㄷ {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		byte a = 3;
//		byte c = 4;
//		int d = a+c;
//		System.out.println(a+c);
//		
//		int score = 78;
//		switch(score /10) {
//		
//		case 10 :
//		case 9:
//			System.out.println("ㅁ");
//			break;
//		
//		case 8:
//			System.out.println("ㅇ");
//			break;
//		case 7:
//			System.out.println("C");
//		case 6:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("F");
//			
//		System.out.println("연산자 입력" : );
//		String op = sc.next();
//		
//		op.equals("+");
//		// tmx
//		switch(op) {
//		
//		case "+":
//			System.out.println("%d + %d = %d\n",);
//		
//		}
//			
//			
//			
//		
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력");
		int year = sc.nextInt();
		System.out.println("월 입력 : ");
		int month = sc.nextInt();
		System.out.println("일 입력 : ");
		int day = sc.nextInt();
		String dkf = "고구마 맛있다, 닭강정 맛있다.";
		int ei = 1518484, e = 8888888, o = 999999,u =6555;
		String d = dkf.valueOf(ei);
		System.out.println(d);
		
		int total = (year-1)*365 +(year-1)/4 -(year-1)/100+(year-1)/400;
		
		//전 달 까지의 합
		int[] lastDay = {31,28,31,30,31,30,
							31,31,30,31,30,31};
		if((year % 4== 0 && year % 100 != 0) ||(year % 400 == 0))
			lastDay[1] = 29;
		else lastDay[1] = 28;  // 연도는 상관 없음 입력한 값의 해가 윤년인지 아닌지만 판별하면 됨
		}
		
		
		
		
		
	

}
