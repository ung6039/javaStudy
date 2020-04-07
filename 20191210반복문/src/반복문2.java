import java.util.Scanner;

// while => while (true) : 무한 루프
// for 	=> 	for(;;) : 무한 루프 ==>
/*
 	# 반복문 제어
 		======
 			continue => 특정내용을 제외
 			break;   => 반복문을 종료
 			
 			1~10  =>  7, 9
 			
 			for (int i =1; i<= 10; i++){
 				if(i == 7 || i ==9) continue // 7과 9를 제외하고 실행해라
 				
 			}
 */
public class 반복문2 {

	public static void main(String[] args) {
		
		//while ==> 1~(사용자 입력값) 까지의 짝수의 합, 홀수의 합 , 총 합을 구해서 출력
		 // even ==> 짝수 odd ==> 홀수
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int su =0, su1=0,total = 0;
		System.out.print("입력  : ");
		int user =sc.nextInt();
		while(i<user+1) {
			
			total += i;
			if(i % 2 == 0) {
				su +=i;
			}
			else su1 += i;
			i++;
		}
		
		System.out.printf("1~ %d 까지"
				+ "짝수의 합 : %d 홀수의 합 : %d 총 합 : %d",user,su,su1,total);
	}
}
