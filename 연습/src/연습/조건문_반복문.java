package 연습;

import java.util.Scanner;

public class 조건문_반복문 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
//	System.out.print("(2~9) 단 입력 : ");
//	int dan = sc.nextInt();
//	
//	int i = 1;
//	while(i <=9) {
//		//구구 단
//		System.out.printf("%d X %d = %d\n", dan,i,dan,dan*i);
//		i++;
//		
//		}
	
	int i = 0;
	int sum = 0;
	int num = 0, num5 = 0, num7 = 0;
	char c = 'A';
	while(i <=100) {
		if(i% 3 == 0) {
			num += i;
			System.out.println("3의 배수 : " + i+", ");
		}
		if(i % 5 == 0) {
			num5 += 5;
			System.out.print("5의 배수 "+i+", ");
		}
		if(i % 7 == 0) {
			num7 += 7;
			System.out.println("7의 배수 "+i+", ");
			sum+=i;
			i++;
			}
		
		}
	// char형은 정수형으로 바뀔 수 있으니까 조건식에 넣을 수 있다.
	char dd ='A';
	while(dd <= 'Z') {
		System.out.println(dd +" ");
		dd++;
	}
	}
}
