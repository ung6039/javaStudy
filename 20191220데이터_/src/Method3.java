import java.util.Scanner;

public class Method3 {
	// �Է� �޴� ���
	static int userInput() {
		Scanner sc= new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		return input;
	}
	// ������ ó��  // �ܶ��� �����鼭 ����� ������ ������ ������ � ���� �ް� � ���� �޾ƾ��Ѵ��� ����Ѵ�.
	// �ҽ����� (X) �ִ� �Ͱ� �޴� ���� �� �ϸ� ��
	static int[] tobinary(int input) {
		int[] bi = new int[16];
		
		//0000 0000 0000 1010 -> �������� ���� �ڿ��� ���� �ԷµǾ� �ֱ� ������
		// �迭�� ���� ���ʺ��� ä�� �� �ֵ��� ��ġ ���� ������ �־�� �Ѵ�.
		int index =(bi.length-1); //�迭 -> ���� ���� => ��ġ(��(length-1),��(0))
		// �迭�� ���� �ϸ� ��𼭺��� ä�� ���ϱ� ? 1. �տ������� ä��°�? 2. �ڿ��� ���� ���� ä���?
		// ������ �ڿ��� ���� ä�� ���� �ְ� ������ �տ��� ���� ä�� ���� ����
		// �ڿ��� ���� ������ ������ length-1�� �����ϰ� --��  �����ϵ��� ����
		// �Է� ���� ���� Ƚ���� �������� �ʾ���
		// ���� Ŀ���� Ŀ�� ���� �������� ������ ���� Ŀ���� ��
		/*
		 	10 %2 = 0
		 	5 % 2 =1
		 	2 % 2 =0
		 	1% 2 =1
		 */
		//ó���ϴ� �κ�
		while(true) {
			
			bi[index] = input %2;
			input =input/2;
			if(input ==0) {
				break;
			}
			
			index --;
		}
		return bi;
	}
	// ���
	static void print(int[] bi) {
		for(int i =0; i<16;i++) {
			if(i% 4 == 0 && i!=0) {
				System.out.print(" ");
			}
			
		}
		
		
	}
	// ����
	static void process() {
		int input= userInput();
		int [] bi = tobinary(input);
		print(bi); // �����͸� ������ �Ѱ��ִ��� �� Ȯ���ؾ���
	}
	
	// ���� -> ������ �����ϴ� �޼��带 �θ��鼭 ��
	// -> �ַ� process
	public static void main(String[] args) {
		process();
		
		
	}
}