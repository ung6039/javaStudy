
import java.util.Scanner;
public class ������ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("(2~9)�� �Է�  : ");
		int dan = sc.nextInt();
		
		int i  = 1;
		while(i <=9) {
			//������
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
			i++;
		}
		
		
		
	}
}
