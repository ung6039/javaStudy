// ���� ���� �� ==> 5 ===> 1�� 3�� 1��
import java.util.Scanner;
public class �ݺ���3�ٽ��ѹ��� {

	public static void main(String[] args) {
		int i = 1, win =0, lose =0, same =0;
		String name;
//		while(i<= 5) {
//			Scanner sc = new Scanner(System.in);
//			// ���� ���� ��
//			int com = (int)(Math.random()*3);
//			
//			System.out.print("����(0), ����(1) , ��(2)�Է�  (0~2): ");
//			int user = sc.nextInt();
//			
//			// ��ǻ�� ����������
//			if(com == 0) {
//				name = "����";}
//			else if (com == 1) {
//				name = "����";
//			}
//			else name = "��";			
//			
//			// �·� ���� ���� ��
//			int res =com-user;
//			
//			if( res == 0) {
//				System.out.println("���"+ "com = \n"+name+"VS"+user );
//				same++;
//			}
//			else if(res ==1 || res == -2) {
//				System.out.println("��"+"com = "+"\n"+name );
//				lose ++;
//			}
//			else {
//				System.out.println("�̱�"+ "com = \n"+name );
//				win++;
//			}
//			
//			i++;
//		}
//		System.out.printf("�¸� : %d ��� : %d �� : %d",win,same,lose);
		
		
		// switch case�� �ٲ㼭 ǥ��
		
		while(i<= 5) {
			Scanner sc = new Scanner(System.in);
			// ���� ���� ��
			int com = (int)(Math.random()*3);
			
			System.out.print("����(0), ����(1) , ��(2)�Է�  (0~2): ");
			int user = sc.nextInt();
			
			// ��ǻ�� ����������
			if(com == 0) {
				name = "����";}
			else if (com == 1) {
				name = "����";
			}
			else name = "��";			
			
			// �·� ���� ���� ��
			int res =com-user;
			
			switch(res){
				// switch case�� ���ö� 1���� ���� ������ �� ���ϴ�
			
			case -1:
			case 2:
				win++;
				System.out.println("�̱�");
				break;
			
			case 1:
			case -2:
				lose++;
				System.out.println("��");
				break;
			case 0:
				same++;
				System.out.println("���");
			}
			i++;
		}
		System.out.printf("�¸� : %d ��� : %d �� : %d",win,same,lose);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
