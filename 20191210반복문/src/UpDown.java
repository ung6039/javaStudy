import java.util.Scanner;

/*
 	# ��ǻ�� => 1~100������ ������ ���� ����
 		
 		��Ʈ  => UP / Down
 		78 
 		
 		70 ==> up 
 		80 ==> down
 		���� �Ǹ� ���� �߱� ����
 */
public class UpDown {

	public static void main(String[] args) {
		
		// � ������ �������ϴ°�?
		// ������ ���� ó�� ��� 
		int i =1;
		int sucess = (int)(Math.random()*100)+1; //1~100
//		int sucess = (int)(Math.random()*101); //0~100
		Scanner sc = new Scanner(System.in);
//		while(i<=5) {
//			System.out.println("������ ���ڸ� �Է� �ϼ��� ");
//			System.out.print("�Է� : ");
//			int input = sc.nextInt();
//			
//			if(sucess == input) {
//				System.out.println(sucess +"  ���� !!!");
//				i=100;
//			}
//			else if(sucess <input) {
//				System.out.println("DoWn");
//			}
//			else
//				System.out.println("UP");
//			i++;
//			if(i ==4) {
//				System.out.println("1�� ���ҽ��ϴ�.");
//			}
//		}
//		System.out.println(sucess);
		
		while(true) {
			System.out.println("1~100������ ���� �Է� : ");
			int user =sc.nextInt();
			// ����
			if(user <1 || user >100) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue; // �������� �ʰ� �ݺ����� �ٽ� �����Ű�� �� �ݺ� ���ù�
				// while���� ���ǽ����� �̵�
			}
			// ó��
			if(sucess == user) {
				System.out.println("���� ! : " + sucess);
				// ����
//				System.exit(0);
				break; // while�� ����
			}
			else if(sucess > user) {
				System.out.println("UP");
			}
			else
				System.out.println("DoWn");
			
		}
	}
}
