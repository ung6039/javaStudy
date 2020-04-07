/*
 #		 for(int i =1;i<=10; i++)
 			{
 				System.out.println(i);
 			}
 			
 		int i =1;
 		do
 		{
 			System.out.println(i);
 			i++;
 		}while(i<=10);
 		
 		
 	int a = 10;
 	if( a== 10)
	{
		int b =20;
		if(b== 20)
		{
			int c =30;
		}  c(X)
	}b(X)
	
 */
public class 제어문정리 {
	int a = 100; // heap 영역에 저장됨
	// 클래스에서 저장된 변수는 다른 클래스에서도 사용가능하다.
	// 서로 값을 주고 받으려면 다른 클래스에서도 사용이 가능해야함
	public static void main(String[] args) {
		 int a =10; // 지역 변수, 전역 변수
		 
		 aa();
		 // 값 :10
		 // aa()에 있는 지역 변수는 공유해서 사용 x
		 // 메모리가 유지하고 있으면 사용 유지x  
		 aa();

		 // : 10
		 aa();
		 // : 10
		 // 메서드를 만들어도 반복적으로 하는 내용을 제어 할 수 있다.
		 // 반복문만 적용되는 것이 아니라 메서드를 이용해서 반복을 줄 일 수 있다.
		 
		
		
		
		
		
	}
	public static void aa() {
		int a = 10;
		System.out.println("a= "+a);
		++a;
	}
}
