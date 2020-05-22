
import java.util.Scanner;
public class 구구단 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("(2~9)단 입력  : ");
		int dan = sc.nextInt();
		
		int i  = 1;
		while(i <=9) {
			//구구단
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
			i++;
		}
		
		
		
	}
}
