// ������  => dan�� �Է� �޾Ƽ�
// ���� Ǯ������ϴ� ���� do while => for������ �ٲٴ� ��  do while������ �ٲٴ� ��
// for���� while / do while�� �ٲٴ� ��
/*
 	���α׷�
 	======
 		����� ���� + java���̺귯��  + �ܺο��¼ҽ�(mvnrepository.com (�ظ��� ���� lib ����)
 	==========================================================================
 										�� ��
 	5 * 1 = 5
 	5 * 2 = 10
 	for / while ���� ����ϰ� �Ǹ� roof ������ �ʿ� ^^
 	
 	
 	mybatis ���� ���� ����
 		jsoup = > html ������
		JSoup Java HTML Parser   => java ������
		libeary  		
 */
import java.util.Scanner;

import javax.swing.JOptionPane;
public class �ݺ���8�Է�â���°� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� :  ");
		int dan = sc.nextInt();
		
		int i =1;
		while(i<=9) {
			System.out.printf("%-2d*%2d = %2d\n",dan,i,dan*i);
			//ĭ ���� �ٽ� ���� ����
			// ���ڴ� ������ ���� => %-2d * %2d = %2d\n) --> ĭ ����
			
			i++;
			
		}
		// ó���� �Ǵ� �κ�
		String a = JOptionPane.showInputDialog("���� �Է� : ");
		
		
		
	}
}
