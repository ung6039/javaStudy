package ����;

import java.util.Scanner;

public class ���ǹ�_�ݺ��� {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
//	System.out.print("(2~9) �� �Է� : ");
//	int dan = sc.nextInt();
//	
//	int i = 1;
//	while(i <=9) {
//		//���� ��
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
			System.out.println("3�� ��� : " + i+", ");
		}
		if(i % 5 == 0) {
			num5 += 5;
			System.out.print("5�� ��� "+i+", ");
		}
		if(i % 7 == 0) {
			num7 += 7;
			System.out.println("7�� ��� "+i+", ");
			sum+=i;
			i++;
			}
		
		}
	// char���� ���������� �ٲ� �� �����ϱ� ���ǽĿ� ���� �� �ִ�.
	char dd ='A';
	while(dd <= 'Z') {
		System.out.println(dd +" ");
		dd++;
	}
	}
}
