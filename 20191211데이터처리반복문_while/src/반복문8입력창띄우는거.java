// 구구단  => dan을 입력 받아서
// 내일 풀어봐야하는 문제 do while => for문으로 바꾸는 것  do while문제로 바꾸는 것
// for문을 while / do while로 바꾸는 것
/*
 	프로그램
 	======
 		사용자 정의 + java라이브러리  + 외부오픈소스(mvnrepository.com (왠만한 오픈 lib 많음)
 	==========================================================================
 										조 립
 	5 * 1 = 5
 	5 * 2 = 10
 	for / while 문을 사용하게 되면 roof 변수가 필요 ^^
 	
 	
 	mybatis 등이 많이 사용됨
 		jsoup = > html 번역기
		JSoup Java HTML Parser   => java 번역기
		libeary  		
 */
import java.util.Scanner;

import javax.swing.JOptionPane;
public class 반복문8입력창띄우는거 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 :  ");
		int dan = sc.nextInt();
		
		int i =1;
		while(i<=9) {
			System.out.printf("%-2d*%2d = %2d\n",dan,i,dan*i);
			//칸 간격 다시 살펴 보기
			// 숫자는 오른쪽 정렬 => %-2d * %2d = %2d\n) --> 칸 간격
			
			i++;
			
		}
		// 처리가 되는 부분
		String a = JOptionPane.showInputDialog("정수 입력 : ");
		
		
		
	}
}
