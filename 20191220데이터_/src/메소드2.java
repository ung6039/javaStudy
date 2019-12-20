/*
 	정수 1개를 입력을 받아서 2진법으로 출력
 	10 => int [] = new int[16] ; 
 	// 0000 0000 0000 1010;
 	일반적으로 풀어보고 메서드화해서 풀어보기
 */
import java.util.Scanner;
public class 메소드2 {

	public static void main(String[] args) {
		
		// 어디까지 메서드의 단락인지 확인할 줄 알아야함
		Scanner sc = new Scanner(System.in);
		//변수 -- 입력
		System.out.print("정수 입력 : ");
		int input = sc.nextInt(); // 사용자가 입력한 값을 받는 변수
		
//		System.out.println(Integer.toBinaryString(input));
		// 이진수 값을 저장하는 변수
		int[] bi = new int[16];
		
		//0000 0000 0000 1010 -> 이진수의 값이 뒤에서 부터 입력되어 있기 때문에
		// 배열의 값도 뒤쪽부터 채울 수 있도록 위치 값을 변경해 주어야 한다.
		int index =(bi.length-1); //배열 -> 값을 변경 => 위치(뒤(length-1),앞(0))
		// 배열이 등장 하면 어디서부터 채울 것일까 ? 1. 앞에서부터 채우는가? 2. 뒤에서 부터 값을 채울까?
		// 언제는 뒤에서 부터 채울 때도 있고 언제는 앞에서 부터 채울 때도 있음
		// 뒤에서 부터 저장할 때에는 length-1을 지정하고 --로  감소하도록 지정
		// 입력 값에 따라 횟수가 지정되지 않았음
		// 값이 커지면 커질 수록 나머지와 나누는 값이 커지게 됨
		/*
		 	10 %2 = 0
		 	5 % 2 =1
		 	2 % 2 =0
		 	1% 2 =1
		 */
		//처리하는 부분
		while(true) {
			
			bi[index] = input %2;
			input =input/2;
			if(input ==0) {
				break;
			}
			
			index --;
		}
		
		// 출력
		for(int i =0; i<16;i++) {
			if(i% 4 == 0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(bi[i]);
		}
		
		
	}
}
