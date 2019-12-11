// 가위 바위 보 ==> 5 ===> 1승 3패 1무
import java.util.Scanner;
public class 반복문3다시한번더 {

	public static void main(String[] args) {
		int i = 1, win =0, lose =0, same =0;
		String name;
//		while(i<= 5) {
//			Scanner sc = new Scanner(System.in);
//			// 가위 바위 보
//			int com = (int)(Math.random()*3);
//			
//			System.out.print("가위(0), 바위(1) , 보(2)입력  (0~2): ");
//			int user = sc.nextInt();
//			
//			// 컴퓨터 가위바위보
//			if(com == 0) {
//				name = "가위";}
//			else if (com == 1) {
//				name = "바위";
//			}
//			else name = "보";			
//			
//			// 승률 가위 바위 보
//			int res =com-user;
//			
//			if( res == 0) {
//				System.out.println("비김"+ "com = \n"+name+"VS"+user );
//				same++;
//			}
//			else if(res ==1 || res == -2) {
//				System.out.println("짐"+"com = "+"\n"+name );
//				lose ++;
//			}
//			else {
//				System.out.println("이김"+ "com = \n"+name );
//				win++;
//			}
//			
//			i++;
//		}
//		System.out.printf("승리 : %d 비김 : %d 짐 : %d",win,same,lose);
		
		
		// switch case로 바꿔서 표현
		
		while(i<= 5) {
			Scanner sc = new Scanner(System.in);
			// 가위 바위 보
			int com = (int)(Math.random()*3);
			
			System.out.print("가위(0), 바위(1) , 보(2)입력  (0~2): ");
			int user = sc.nextInt();
			
			// 컴퓨터 가위바위보
			if(com == 0) {
				name = "가위";}
			else if (com == 1) {
				name = "바위";
			}
			else name = "보";			
			
			// 승률 가위 바위 보
			int res =com-user;
			
			switch(res){
				// switch case에 들어올때 1개의 값이 들어오면 더 편하다
			
			case -1:
			case 2:
				win++;
				System.out.println("이김");
				break;
			
			case 1:
			case -2:
				lose++;
				System.out.println("짐");
				break;
			case 0:
				same++;
				System.out.println("비김");
			}
			i++;
		}
		System.out.printf("승리 : %d 비김 : %d 짐 : %d",win,same,lose);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
