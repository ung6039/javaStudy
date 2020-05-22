package 연습;

import java.util.Scanner;

public class P20191216배열 {

	public static void main(String[] args) {

		/*
		 * Scanner sc= new Scanner(System.in);
		 * 
		 * char[] user = new char[10]; for(int i =0; i<user.length; i++) {
		 * System.out.print("입력 :"); String a = sc.next(); user[i] = a.charAt(0); }
		 * System.out.println("사용자 입력 값 : "); for(char d : user) {
		 * System.out.print(d+" "); } System.out.println();
		 * 
		 * char[] dap = new char[10]; for(int i =0; i<dap.length;i++) { int k =
		 * (int)(Math.random()*2); // 0 or 1로 진행이 됨 if( k ==0 ) dap[i] = 'O'; else
		 * dap[i] = 'X'; }
		 * 
		 * System.out.println("정답 :"); for(char c : dap) { System.out.print(c+" "); }
		 * 
		 * int count=0; for(int i=0; i<dap.length; i++) { if(user[i] == dap[i]) {
		 * count++; } } System.out.println(); System.out.println("점수 값 : "+count*10);
		 * 
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int[] su = new int[5]; int max, min;
		 */
		// max와 min 값은 초기 값을 입력하면 오류가 발생할 수 있다/
		// 음수가 입력 될 경우 0이 항상 크기 때문에 최소 값을 찾을 수 없다.
		// 따라서 특정 값을 입력 받고 진행을 해야한다.
		/*
		 * for(int i =0; i<su.length; i++) { su[i] = (int)(Math.random()*100)+1;
		 * System.out.println(su[i]+", "); } max = su[0]; min = su[0]; for(int i : su) {
		 * if(max<i) { max=i; } if(min>i) { min =i; } }
		 * System.out.println("\n최대 값 : "+max); System.out.println("최소 값 : "+min);
		 * System.out.println("------------------------------");
		 * 
		 * max =0; min =0; for(int i =0; i<su.length; i++) { System.out.print("입력 : ");
		 * su[i] = sc.nextInt(); min = su[i]; max = su[i]; // for문이 돌아가면서 계속 적으로 i값을 입력
		 * 받기 때문에 가장 최근에 입력된 값이 최댓값과 최솟값으로 //출력됨 if(su[i]>max) { max = su[i]; }
		 * if(su[i]<min) { min = su[i]; }
		 * System.out.println("\n-----------------------"); }
		 * System.out.println("최대 값 : "+max); System.out.println("최소 값  : "+min);
		 */
		/*
		 * Scanner sc = new Scanner(System.in); String[] doc = new String[5];
		 * 
		 * for(int i =0; i<doc.length;i++) { System.out.print("이름 입력 : "); doc[i] =
		 * sc.next(); } for(int i =0; i<doc.length; i++) {
		 * System.out.print(doc[i]+", "); } System.out.println(); // for-each방식 -> 배열,
		 * 집합체(collection)
		 * 
		 * int[] data = {1,2,3,4,5} for(int i =0; i<data.length;i++){
		 * System.out.println(data[i]) }
		 * 
		 * 
		 */
		
		/*
		 * Scanner sc = new Scanner(System.in); // 배열은 첨자가 같아야 같은 정보를 가지고 있다고 생각 할 수 있음
		 * 
		 * int[] kors = new int[3]; int[] engs = new int[3]; int[] maths = new int[3];
		 * int[] total = new int[3]; double[] avg = new double[3]; char[] score = new
		 * char[3]; int[] rank = {1,1,1};
		 * 
		 * 
		 * for(int i =0; i<kors.length; i++) { System.out.print("국어 입력 : "); kors[i] =
		 * sc.nextInt(); System.out.print("영어 입력 : "); engs[i] = sc.nextInt();
		 * System.out.print("수학 입력 : "); maths[i] = sc.nextInt(); total[i] =
		 * kors[i]+engs[i]+maths[i]; avg[i] = total[i]/kors.length;
		 * 
		 * 
		 * switch((int)(avg[i]/10)) { case 10: case 9: score[i] = 'A'; break; case 8:
		 * score[i] = 'B'; break; case 7: score[i] ='C'; break; }
		 * 
		 * } for(int i =0; i<kors.length;i++) { for(int j =0; j<kors.length;j++) {
		 * if(avg[i]<avg[j]) { rank[i]++; } } }
		 * 
		 * for(int i1 =0; i1<kors.length; i1++) { System.out.print(kors[i1]+" "+
		 * engs[i1]+" "+maths[i1]+" "+ total[i1]+" "+avg[i1] +" "+score[i1] +" "+
		 * rank[i1]+"\n"); }
		 */
		int[] ran = new int[5];
		int tmp= 0;
		for(int i =0; i<ran.length; i++) {
			ran[i] = (int)(Math.random()*100)+1;
			for(int j =0; j<ran.length;j++) {
				if(ran[i]>ran[j]) {
					tmp =ran[i];
					ran[i] = ran[j];
					ran[j] = tmp;
				}
			}
		}
		for(int i : ran) {
			System.out.println(i);
			System.out.println("-------");
		}
		
		//오름 차순
		for(int i=0; i<5; i++) {
			for(int j = i+1; j<(ran.length-1);j++) {
				if(ran[i]<ran[j]) {
					tmp = ran[i];
					ran[i] = ran[j];
					ran[j] = tmp;
				}
			}
		}
		System.out.println("-=============");
		
		for(int i =0; i<5; i++) {
			for(int j = i+1; j<(ran.length);j++) {
				// 내림 차순은 
				if(ran[i]>ran[j]) {
					tmp = ran[i];
					ran[i] = ran[j];
					ran[j] = tmp;				}
			}
		}
	}
}
