package ����;

import java.util.Scanner;

public class P20191217 {
	
	public static void main(String[] args) {
		/*
		 * int[] com = new int[9]; int count =0; int su =0; for(int i =0; i<com.length;
		 * i++) { count =0; while(count == 0) { count = 1; su =
		 * (int)(Math.random()*9)+1; for(int j =0; j<i; j++) { if(com[j]== su) { count =
		 * 0; continue; // countinue�� �ȵǳ�? �� } } } com[i] = su; }
		 * 
		 * for(int i : com) {
		 * 
		 * System.out.print(i+" "); }
		 */
		
		// �߱� ����
//		1. �ߺ� ���� ����
//		2. ����ڰ� 3�� �ܾ �Է�
//		3. ���� ������ 0s-3B�� ���
//		4. ����ڴ� 0�� �ߺ��� ���� �Է� �� �� ����.
//		   =>0�� �Է��ϰ� �Ǹ� 8�μ��� ��µǱ� ������ �ȵ�
//		5. ���� �°� �Ǹ� ���� 
		
		

	int s=0,b=0;
	int com[] = new int[3];
	int user[] = new int[3];
	int su=0;
	Scanner sc = new Scanner(System.in);
		boolean bCheck =false;
			// �ߺ����� ���� �� ���
		for(int i =0; i<com.length; i++) {
				bCheck =true;
		while(bCheck) {
				su = (int)(Math.random()*9)+1;
				// ���� 1 0�� ��µ�
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
		
			// ����� �Է��� ���� ��ȯ
			System.out.print("�Է� : ");
			su= sc.nextInt();
			user[0] = su/100;
			user[1] = (su%100)/10;
			user[2] = su%10;
			
			// SB�� ó��
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
			// ���
			System.out.println("==========");
			System.out.println(""+com[0]+com[1]+com[2]);
			System.out.println(s+"S"+b+"B");
			System.out.println();
			
			// ����
			if(s==3) {
				System.out.println("����� õ��!!!");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
