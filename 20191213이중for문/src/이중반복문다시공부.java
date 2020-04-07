/*
 	# 형식 - 순서) 
 		// 			1 	2 ↑  ==> false
 		for(초기값 ; 조건식; 증가식) // 1차 for
 		{
 						↓ true
 					1		2  ==> false  => 1차 for 증가식
 								4
 			for(초기값 ; 조건식 ; 증가식) 2차 for
 			{			↓ true
 					 3
 				실행문장(2차  for)  ==> 2차 증가식
 			}
 			실행문장(1차 for)  
 		}
 		
 		******
 		******
 		******
 		******
 		
 		
 		1####
 		#2###
 		##3##
 		###4#
 		####5 
 	
 	*
 	**
 	***
 	****
 	*****
 
 2중 for문의 조건식을 고민해야한다.
 */
public class 이중반복문다시공부 {

	public static void main(String[] args) {
		
		for(int i =0; i<5; i++) {
			
			for(int j =0; j<=5; j++) {
				System.out.print("★"); //실제 출력
			}
			System.out.println();	// 다음 줄로 내리는 것이 역할
			}
		
		// 게임은 반이상 2차 for문임
		// 먼가를 날리고 싶은데 대각선으로 날라오게 되면 x,y를 조절해야함
		
		for(int i =0; i<5; i++) {
			for(int j =0; j<5; j++) {
				if(i==j) {
					System.out.print(i+1);
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		// 조건 (i == j)랑 같을 때
		
		System.out.println("====================");
		for(int i =0; i<5;i++) {
			for(int j =0; j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		/*
		 i		j
		 줄수		별표
		 1		1
		 2		2
		 3		3
		 4		4
		 5		5		i=j   => j=i;
		 */
		// 2중 for문에서 중요한 것 : 조건식  몇을 수행하게 만들 것인가?
		// 범위를 어떻게 잡는지가 관건
		
		/*
		 		*****
		 		****
		 		***
		 		**
		 		*
		 */	
		
		for(int i =5; i<0;i--) {
			for(int j =0; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		// 2차 for문의 개수만 조절하면된 // 1차 포문은 건드리지 않아도 됨
		
		for(int i =0; i<5; i++) {
			for(int j =0; j<=5-i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		// 역순으로 진행하는 것
		// ???
		// 문제 3.
		/*
		 	 *
		 	**
		   ***
		  ****
		 *****
		 
		 계속 하기 위해서는 왠만한 알고리즘을 풀 줄 알아야한다.
		 // 어떻게 통과할 것인가? 를 고민
		 
		 
		 줄수		공백		별표
		 1		4
		 2		3
		 3		2
		 4		1
		 5		0
		 	i+j =0
		 	j=5-i
		 수와 수끼리의 관계(수열)를 어떻게 정리 해야 하나?
		 정렬을 계산할 때 length-1이 사용하는 이유
		 
		 */
		
		for(int i =0; i<5; i++) {
			for(int j =0; j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int e = 0; e<=i;e++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		for(int i =1; i<=5; i++) {
			for(int j =1; j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=6-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 	페이지 나누기에서 2중 for문에서 계속 나옴
		 	블록 나누기에 서 많이 사용것 page 다음
		 	블록 나누기  1~10 / 11~20
		 	paging 기법 
		 	페이지는 어떻게 나누었나?
		 	전체목록출력은 누구나 가능
		 	그 다음 page는 어떻게 나눌 것인가?
		 	목록의 핵심은 page
		 */
		/*
		 * *****
		 * 	****
		 * 	 ***
		 * 	  **
		 *     *
		 *     
		 *     줄수	j	k
		 *     0	0   5
		 *     1    1   4
		 *     2    2   3
		 *     3    3   2
		 *     4    4   1
		 *         j=i; i+k=5;
		 *         		k=5-i;
		
		 *
		 
		 
		*******
		  ***
		   *
		  ***
		*******
	
	  

====================================================
2*1 = 2 3*1 =3 4*1 =4 ------- 9*1 = 9

2*9 --------------------------------9*9=81
		 
---------------------------------------------------

*/
		for(int i =1; i<=9; i++) {
			for(int j =2; j<=9;j++) {
				System.out.printf("%2d*%2d = %2d",j,i,i*j);
			}
				System.out.println();
			}
		
		/*
		 * sdfds sdf
		 */
		
		
		
		
		
		
		
		
		
		
		
	}
}
