/*
 	# 반복문
 		================== 선 조건 (조건을 검색을 하고  true면 실행) 1번도 실행 하지 못할 수 있다.
 		= for  : 반복횟수 지정
 		= while : 지정이 없는 경우
 			초기값 
 			while(조건문)
 			{
 				실행 문장
 				증가식
 			}
 		  ================ 후 조건 
 		= do~ while	 : (한 번은 무조건 실행)
 	 		초기값
 	 		do
 	 		{
 	 			실행문장
 	 			증가식
 	 		}while(조건문)
 		==================
 		(조건이 false가 될 때까지 돌아감)
 */
public class 반복문 {

	public static void main(String[] args) {
//		String[] s= {"A","b","v","d","f","g","h","I","E","G"};
//		System.out.println(s.length);
//		int[] ss = {3,4,5,6,7,3,2,3,4,5,64,3,4,5};
//		int i  = 1;
//		
//		while(i<= 10) {
//			System.out.print("i = "+i+"\n");
//			System.out.println(s[i]+" - "+ss[i]);
//			i++;
//		}
		int i = 0; // 1
		int sum = 0;
		int num = 0,num5=0,num7=0;
		char c = 'A';
		while(i<= 100) {  //2
			
//			if(i % 3 == 0) {
//				num += i;
//				System.out.print("3의 배수 : "+i+",");
//			}
//			if(i % 5 == 0) {
//				num5 += 5;
//				System.out.print("5의 배수 "+i+",");
//			}
//			if(i % 7 == 0) {
//				num7 += 7;
//				System.out.print("7의 배수 "+i+",");
//			}
//			sum +=i;
//			i++;
			
			System.out.print((char)(c+i)+" ");
			i++;
			if((c+i) > 'Z') break;
		}
		System.out.println("\n1~100 까지의 합  : "+sum );
		System.out.println("3의 배수의 합 : "+num);
		System.out.println("5의 배수의 합 : "+num5);
		System.out.println("7의 배수의 합 : "+num7);
		/*
		 		# 1 ===> 2 ==> 3 ==> 4
		 		
		 */
		int d ='A';
		System.out.println(c);
		
		// 3의 배수의 합  5의 배수의 합 7의 배수의 합
		System.out.println();
		
		
		
		char de = 'A';
		while(de <= 'Z') {
			System.out.print(de +" ");
			de++;
		}
	}

}
