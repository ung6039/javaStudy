package ����;

import java.util.Scanner;

public class _3����_������ {

	public static void main(String[] args) {
		// �Է��� ���� �޾Ƽ� ����
		//����(����) => ������ ���� ����
//		int a = (int)(Math.random()*100)+1;
//		//Math.random() = 0.0 ~0.99
//		System.out.println("a = "+a);
//		
//		Scanner sc = new Scanner(System.in);
//		// System.in (in)�̶�� Ű����� Ű������ �Է°��� �޴´ٴ� �ǹ�
//		
//		System.out.print("���� �Է� :");
//		int b = sc.nextInt();
//		System.out.println("b = " + b);
//		System.out.print("���� : " );
//		int kor = sc.nextInt();
//		
//		//���� 1
//		int m = 65430;
//		int m1 = m/10000;
//		System.out.println(m1);
//		int m2 = (m/1000)%10;
//		System.out.println(m2);
//		int m3 = (m%1000)/100;
//		int m4 = (m%100)/10;
		
		// ���� 2. �޿� ����
		int meta = 1500;
		int ddo = 550;
		double a = meta*0.1;
		System.out.println("�Ǽ��ɾ� = �⺻�� + �ð����� -����");
		System.out.println("�Ǽ��ɾ� = "+(meta+ddo-a));
		
		//���� 3.
		String name = "ȫ�浿";
		String department = "���ߺ�";
		String position = "�븮";
		int sal = 1500000;
		
		System.out.println("�̸� : "+ name);
		System.out.println("�μ� : "+ department);
		System.out.println("��å : "+ position);
		System.out.println("�޿� : "+ sal);
		
		//���� 5.
		int year;
		Scanner A = new Scanner(System.in);
		System.out.println("���� ���ϴ� ���α׷�");
		System.out.print("�⵵ �Է� : ");
		year = A.nextInt();
		if(year % 4 == 0) {
			if(year % 400 == 0 || year % 100 != 0) {
				System.out.println("���� = "+year);
			}
		}
		else System.out.println("��� = "+year);

		//���� 7. ���� ch ����� ���ڰ� �빮���� ��쿡 �ҹ���
		
		char ch = 'A';
		char lowerCase = (char)((ch=='A')? ch+32:ch);
		System.out.println("ch : "+ ch);
		System.out.println("ch to lowerCase" + lowerCase);
		
		
		
		
	}

}
