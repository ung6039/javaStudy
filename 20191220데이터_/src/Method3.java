import java.util.Scanner;

public class Method3 {
	// 입력 받는 기능
	static int userInput() {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		return input;
	}
	// 이진법 처리  // 단락을 나누면서 블록을 지나면 사라기지 때문에 어떤 값을 받고 어떤 값을 받아야한는지 고믾한다.
	// 소스변경 (X) 주는 것과 받는 것을 잘 하면 됨
	static int[] tobinary(int input) {
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
		return bi;
	}
	// 출력
	static void print(int[] bi) {
		for(int i =0; i<16;i++) {
			if(i% 4 == 0 && i!=0) {
				System.out.print(" ");
			}
			
		}
		
		
	}
	// 조립
	static void process() {
		int input= userInput();
		int [] bi = tobinary(input);
		print(bi); // 데이터를 무엇을 넘겨주는지 잘 확인해야함
	}
	
	// 조립 -> 메인은 조립하는 메서드를 부르면서 끝
	// -> 주로 process
	public static void main(String[] args) {
		process();
		
		
	}
}