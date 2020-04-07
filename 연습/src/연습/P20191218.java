package 연습;

import java.util.Scanner;

public class P20191218 {

	public static void main(String[] args) {
//		char c ='A';
//		
//		System.out.println(c++);
//		System.out.println(++c);
//		System.out.println(c);
//		System.out.println(c+=10);
//		System.out.println(c);
//		long a =3000*3000*3000L;
//		System.out.println(a);
//		Math.ceil(a/10); // 올림 처리 하는 Math 클래스의 메소드
		
		/*
		 * int[] arr = new int[5]; int temp =0; // 중복 되지 않는 난수를 발생시키는 방법 boolean bCheck
		 * = true; int ran=0; for(int i =0; i<arr.length;i++) { bCheck = true;
		 * while(bCheck) { bCheck =false; ran =(int)(Math.random()*100)+1; for(int j =0;
		 * j<arr.length; j++) { if(arr[i] == ran) { bCheck = true; break; } } } arr[i]=
		 * ran; System.out.print(arr[i]+" "); }
		 * 
		 * System.out.println();
		 * 
		 * for(int i =0; i<arr.length; i++) {
		 * 
		 * for(int j = i+1; j<arr.length; j++) { if(arr[i] < arr[j]){ temp = arr[i];
		 * arr[i] = arr[j]; arr[j] =temp; } } System.out.print(arr[i]+", "); }
		 */
		
//		char[] strweek = {'일','월','화','수','목','금','토'};
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("년도 입력 : ");
//		int year = sc.nextInt();
//		
//		System.out.print("월 입력 : ");
//		int mon = sc.nextInt();
//		
//		System.out.println(year + "년도"+mon+"월");
//		System.out.println("\n");
//		// 요일 값을 배열에 넣는 반복문
//		for(int i =0; i<7;i++) {
//			System.out.print(strweek[i]+"\t");
//		}
//		// 전체 일수 구하기 (년도)
//		int total = (year-1)*365
//					+(year-1)/4
//					-(year-1)/100
//					+(year-1)/400;
//		//전달
//		int[] lastday = {31,28,31,30,31,30,
//							31,31,30,30,31};
//		if((year% 4 == 0 && year % 100 !=0)||(year % 400 ==0)) {
//			lastday[1] = 29;
//		}
//		else lastday[1] = 28;
//		// 전체 일수 구하기 (달
//		for(int i =0; i<mon-1; i++) {
//			total += lastday[i];
//		}
//		total++; // 1일차수를구하기위해서
//		// 요일 구하는 변수
//		
//		int week = total % 7;
//		System.out.println();
//		// 날짜를 출력하는 반복문
//		for(int i =1; i<=lastday[mon-1]; i++) {
//			// 공백은 week만큼 띄어라
//			// 그 다음은 1234 출력해라
//			if(i == 1) {
//				for(int j =0; j<week; j++) {
//					System.out.print("\t");
//				}
//			}
//			System.out.printf("%2d\t",i);
//			week++;
//			if(week>6) {
//				week =0;
//				System.out.println();
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		int[] com = new int[3];
		
		for(int i =0; i<com.length; i++) {
			boolean bCheck = true;
			// 항상 default를 잡아 두고 진행
			while(bCheck) {
				// 난수
				// 중복 여부 확인
				
				int su = (int)(Math.random()*9)+1;
				bCheck = false;
				for(int j =0; j<i; j++) {
					// 맨 처음 것은 검색할 필요가 없기 때문에 j<i로 진행
					// for문은 진행한 다음부터 진행되는 것이 아니라 0부터 시작되는 것을 쥐의
					if(com[j] == su) {
						bCheck = true;
						break;
					}
				}
				com[i] = su;
			}
		}
		int[] user = new int[3];
		int rank = 0;
		
		while(true) {
			System.out.print("3자리 정수 입력 : ");
			int input = sc.nextInt();
			if(input < 99 || input > 999) {
				System.out.println("잘못된 입력, 다시 입력 하세요");
				continue;
			}
			// int 일반 변수로 값을 받고 사용자 배열에 넣어 준다.
			// 배열의 값을 변경
			user[0] = input /100 ;
			user[1] = (input % 100)/10;
			user[2] = (input%10);
			
			if(user[0]== user[1]||user[1] == user[2]|| user[0] == user[2]) {
				System.out.println("중복된 수는 사용할 수 없습니다.");
				continue;
			}
			// 0을 사용할 수 없다. -> 0이 앞에 붙으면 8진법이 되기 때문에 안됨
			if(user[0]== 0 || user[1]== 0 || user[2] == 0) {
				System.out.println("0을 입력할 수 없습니다.");
			}
			//힌트
			int s =0,b =0;
			for(int i =0; i<3; i++) {
				for(int j =0; j<3;j++) {
					if(com[i] == user[j]) {
						if( i==j) {
							s++;
						}
						else b++;
					}
				}
			}
			
			// 힌트 출력
			System.out.printf("Input Number : %d, Result : %ds-%dB"
									,input,s,b);
			System.out.println("\n=======================================");
			System.out.print("S : ");
			for(int i =0; i<s;i++) {
				System.out.println("●");
			System.out.print("B : ");
			for(int i1 =0; i1<b;i1++) {
				System.out.print("○");
			}
			System.out.println("\n==============================");
			}
		
			if(s==3) {
				System.out.println("\n정답 !!!");
				break;
			}
		}
		
		
		
		
		
		
		
		
	}
}
