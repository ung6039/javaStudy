package ����;

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
//		Math.ceil(a/10); // �ø� ó�� �ϴ� Math Ŭ������ �޼ҵ�
		
		/*
		 * int[] arr = new int[5]; int temp =0; // �ߺ� ���� �ʴ� ������ �߻���Ű�� ��� boolean bCheck
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
		
//		char[] strweek = {'��','��','ȭ','��','��','��','��'};
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�⵵ �Է� : ");
//		int year = sc.nextInt();
//		
//		System.out.print("�� �Է� : ");
//		int mon = sc.nextInt();
//		
//		System.out.println(year + "�⵵"+mon+"��");
//		System.out.println("\n");
//		// ���� ���� �迭�� �ִ� �ݺ���
//		for(int i =0; i<7;i++) {
//			System.out.print(strweek[i]+"\t");
//		}
//		// ��ü �ϼ� ���ϱ� (�⵵)
//		int total = (year-1)*365
//					+(year-1)/4
//					-(year-1)/100
//					+(year-1)/400;
//		//����
//		int[] lastday = {31,28,31,30,31,30,
//							31,31,30,30,31};
//		if((year% 4 == 0 && year % 100 !=0)||(year % 400 ==0)) {
//			lastday[1] = 29;
//		}
//		else lastday[1] = 28;
//		// ��ü �ϼ� ���ϱ� (��
//		for(int i =0; i<mon-1; i++) {
//			total += lastday[i];
//		}
//		total++; // 1�����������ϱ����ؼ�
//		// ���� ���ϴ� ����
//		
//		int week = total % 7;
//		System.out.println();
//		// ��¥�� ����ϴ� �ݺ���
//		for(int i =1; i<=lastday[mon-1]; i++) {
//			// ������ week��ŭ ����
//			// �� ������ 1234 ����ض�
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
			// �׻� default�� ��� �ΰ� ����
			while(bCheck) {
				// ����
				// �ߺ� ���� Ȯ��
				
				int su = (int)(Math.random()*9)+1;
				bCheck = false;
				for(int j =0; j<i; j++) {
					// �� ó�� ���� �˻��� �ʿ䰡 ���� ������ j<i�� ����
					// for���� ������ �������� ����Ǵ� ���� �ƴ϶� 0���� ���۵Ǵ� ���� ����
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
			System.out.print("3�ڸ� ���� �Է� : ");
			int input = sc.nextInt();
			if(input < 99 || input > 999) {
				System.out.println("�߸��� �Է�, �ٽ� �Է� �ϼ���");
				continue;
			}
			// int �Ϲ� ������ ���� �ް� ����� �迭�� �־� �ش�.
			// �迭�� ���� ����
			user[0] = input /100 ;
			user[1] = (input % 100)/10;
			user[2] = (input%10);
			
			if(user[0]== user[1]||user[1] == user[2]|| user[0] == user[2]) {
				System.out.println("�ߺ��� ���� ����� �� �����ϴ�.");
				continue;
			}
			// 0�� ����� �� ����. -> 0�� �տ� ������ 8������ �Ǳ� ������ �ȵ�
			if(user[0]== 0 || user[1]== 0 || user[2] == 0) {
				System.out.println("0�� �Է��� �� �����ϴ�.");
			}
			//��Ʈ
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
			
			// ��Ʈ ���
			System.out.printf("Input Number : %d, Result : %ds-%dB"
									,input,s,b);
			System.out.println("\n=======================================");
			System.out.print("S : ");
			for(int i =0; i<s;i++) {
				System.out.println("��");
			System.out.print("B : ");
			for(int i1 =0; i1<b;i1++) {
				System.out.print("��");
			}
			System.out.println("\n==============================");
			}
		
			if(s==3) {
				System.out.println("\n���� !!!");
				break;
			}
		}
		
		
		
		
		
		
		
		
	}
}
