package 연습;

import java.util.Scanner;

public class P20191217 {
	
	public static void main(String[] args) {
		/*
		 * int[] com = new int[9]; int count =0; int su =0; for(int i =0; i<com.length;
		 * i++) { count =0; while(count == 0) { count = 1; su =
		 * (int)(Math.random()*9)+1; for(int j =0; j<i; j++) { if(com[j]== su) { count =
		 * 0; continue; // countinue는 안되나? 됨 } } } com[i] = su; }
		 * 
		 * for(int i : com) {
		 * 
		 * System.out.print(i+" "); }
		 */
		
		// 야구 게임
//		1. 중복 없는 난수
//		2. 사용자가 3개 단어를 입력
//		3. 전부 맞으면 0s-3B로 출력
//		4. 사용자는 0과 중복된 수를 입력 할 수 없다.
//		   =>0을 입력하게 되면 8인수가 출력되기 때문에 안됨
//		5. 전부 맞게 되면 종료 
		
		

	int s=0,b=0;
	int com[] = new int[3];
	int user[] = new int[3];
	int su=0;
	Scanner sc = new Scanner(System.in);
		boolean bCheck =false;
			// 중복없는 랜덤 값 출력
		for(int i =0; i<com.length; i++) {
				bCheck =true;
		while(bCheck) {
				su = (int)(Math.random()*9)+1;
				// 문제 1 0이 출력됨
				bCheck= false;
				for(int j =0; j<i;j++) {
					if(com[j] == su) {
						bCheck =true;
						break;
					}
				}
				com[i] =su;
			}
		}
	while(true) {
		
			// 사용자 입력후 값을 변환
			System.out.print("입력 : ");
			su= sc.nextInt();
			user[0] = su/100;
			user[1] = (su%100)/10;
			user[2] = su%10;
			
			// SB를 처리
			s=0;
			b=0;
			for(int i=0; i<3; i++) {
				for(int j =0; j<3;j++) {
					if(com[i] == user[j]) {
						if(i ==j) {
							s++;
						}
						else b++;
					}
				}
			}
			// 출력
			System.out.println("==========");
			System.out.println(""+com[0]+com[1]+com[2]);
			System.out.println(s+"S"+b+"B");
			System.out.println();
			
			// 종료
			if(s==3) {
				System.out.println("당신은 천재!!!");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
