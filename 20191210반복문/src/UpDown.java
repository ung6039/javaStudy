import java.util.Scanner;

/*
 	# 컴퓨터 => 1~100사이의 임의의 수를 추출
 		
 		힌트  => UP / Down
 		78 
 		
 		70 ==> up 
 		80 ==> down
 		발전 되면 숫자 야구 게임
 */
public class UpDown {

	public static void main(String[] args) {
		
		// 어떤 변수를 만들어야하는가?
		// 데이터 저장 처리 출력 
		int i =1;
		int sucess = (int)(Math.random()*100)+1; //1~100
//		int sucess = (int)(Math.random()*101); //0~100
		Scanner sc = new Scanner(System.in);
//		while(i<=5) {
//			System.out.println("추측한 숫자를 입력 하세요 ");
//			System.out.print("입력 : ");
//			int input = sc.nextInt();
//			
//			if(sucess == input) {
//				System.out.println(sucess +"  정답 !!!");
//				i=100;
//			}
//			else if(sucess <input) {
//				System.out.println("DoWn");
//			}
//			else
//				System.out.println("UP");
//			i++;
//			if(i ==4) {
//				System.out.println("1번 남았습니다.");
//			}
//		}
//		System.out.println(sucess);
		
		while(true) {
			System.out.println("1~100까지의 정수 입력 : ");
			int user =sc.nextInt();
			// 오류
			if(user <1 || user >100) {
				System.out.println("잘못된 입력입니다.");
				continue; // 종료하지 않고 반복문을 다시 실행시키는 것 반복 선택문
				// while문의 조건식으로 이동
			}
			// 처리
			if(sucess == user) {
				System.out.println("정답 ! : " + sucess);
				// 종료
//				System.exit(0);
				break; // while문 종료
			}
			else if(sucess > user) {
				System.out.println("UP");
			}
			else
				System.out.println("DoWn");
			
		}
	}
}
