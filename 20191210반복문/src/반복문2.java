import java.util.Scanner;

// while => while (true) : ���� ����
// for 	=> 	for(;;) : ���� ���� ==>
/*
 	# �ݺ��� ����
 		======
 			continue => Ư�������� ����
 			break;   => �ݺ����� ����
 			
 			1~10  =>  7, 9
 			
 			for (int i =1; i<= 10; i++){
 				if(i == 7 || i ==9) continue // 7�� 9�� �����ϰ� �����ض�
 				
 			}
 */
public class �ݺ���2 {

	public static void main(String[] args) {
		
		//while ==> 1~(����� �Է°�) ������ ¦���� ��, Ȧ���� �� , �� ���� ���ؼ� ���
		 // even ==> ¦�� odd ==> Ȧ��
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int su =0, su1=0,total = 0;
		System.out.print("�Է�  : ");
		int user =sc.nextInt();
		while(i<user+1) {
			
			total += i;
			if(i % 2 == 0) {
				su +=i;
			}
			else su1 += i;
			i++;
		}
		
		System.out.printf("1~ %d ����"
				+ "¦���� �� : %d Ȧ���� �� : %d �� �� : %d",user,su,su1,total);
	}
}
