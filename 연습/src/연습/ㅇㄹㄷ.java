package ����;

import java.util.Scanner;

public class ������ {

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
//			System.out.println("��");
//			break;
//		
//		case 8:
//			System.out.println("��");
//			break;
//		case 7:
//			System.out.println("C");
//		case 6:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("F");
//			
//		System.out.println("������ �Է�" : );
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
		System.out.println("�⵵ �Է�");
		int year = sc.nextInt();
		System.out.println("�� �Է� : ");
		int month = sc.nextInt();
		System.out.println("�� �Է� : ");
		int day = sc.nextInt();
		String dkf = "���� ���ִ�, �߰��� ���ִ�.";
		int ei = 1518484, e = 8888888, o = 999999,u =6555;
		String d = dkf.valueOf(ei);
		System.out.println(d);
		
		int total = (year-1)*365 +(year-1)/4 -(year-1)/100+(year-1)/400;
		
		//�� �� ������ ��
		int[] lastDay = {31,28,31,30,31,30,
							31,31,30,31,30,31};
		if((year % 4== 0 && year % 100 != 0) ||(year % 400 == 0))
			lastDay[1] = 29;
		else lastDay[1] = 28;  // ������ ��� ���� �Է��� ���� �ذ� �������� �ƴ����� �Ǻ��ϸ� ��
		}
		
		
		
		
		
	

}
