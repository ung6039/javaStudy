/*
 	# 반복문
 	
 	while  // 파일 읽기 등은 while문을 사용하여 진행한다.
 		형식 )
 			초기 값 			===> 1
 			while(조건문)     ===> 2
 			{
 				반복 실행문장	===> 3
 				증가식		==> 4    === > 2 > 3 > 4
 										   ==
 										   false면 종료
 			}
 			
 			예)
 				1~10
 				int i =1;
 				while(i<= 10){     => 선 조건 (실행을 안될 수도 있다 ex) 조건이 한번도 참이 아닐 경우 실행 되지 않음)
 					System.out.println(i);
 					i++;    ==> i가 11까지 증가한다.
 				}
 	do while
 		형식 )
 		 	초기 값    ==> 1 후 조건 
 		 	do
 		 	{
 		 		실행문장   ======= 2   : 실행문장은 최소한 1번은 실행한다.
 		 		증가식 ;  ======= 3
 		 	}while(조건문); ===> 4
 		 	
 		 예)
 		 	int i = 1;
 		 	do      // 증가를 시키고 진행을 한다는 것이 while문과 다르다 // 매개 변수가 증가된 상태에서 진행된다.
 		 	{
 		 		System.out.println(i);
 		 		i++;
 		 	} while(i <=10); 10일때 까지 출력하고 11일 때 빠져나감
 	for
 		형식)		  1     2    4
 			for (초기값;조건식 ;증가식)
 			{
 				실행문장 => 3
 			}
 			
 			for (int i = 1; i<=10; i++) {
 				
 				System.out.println(i);
 			}
 		===============================
 		출력 (항상 출력 할때는 가로로 출력된다 // 새로로 출력하기 위해서는 추가적인 입력이 필요)
 			========================
 */
public class 반복문1 {

	 public static void main(String[] args) {
		 /*
		  # 1~10 까지 출력 하는데 1줄에 3개씩 출력
		  */
		 
		 int su = 1;
		 
		 while(su<=10) {
			 System.out.print(su+"\t");
			 su++;
			 if(su%3 == 1) {
				 System.out.println();
				 // if(su % 3 == 0) --> 3의 배수일 때 1줄이 출력됨 // 이러면 3개씩이 아니라 2개만 출력됨 (su %4 )일 경우에는 4개씩 되는 경우도 있음
				 // 요것의 문제는 코딩순서 때문에 문제가 발생될 수 있음
			 }
			 
		 }
		 System.out.println();
		 su = 1;
		 while(su<=10) {
			 System.out.print(su+"\t");
			 if(su%3 == 0) {
				 System.out.println();
			 }
			 su++;
		 }
		 System.out.println();
		 int num =1;
		 do {
			 System.out.print(num+"\t");
			 if(num % 3 == 0) {
				 System.out.println();
			 }
			 num++;
			 
		 }while(num<=10);
		 
		 System.out.println("for");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
