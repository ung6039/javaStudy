/*
 		구구단 출력 : 2단 부터~ 9단까지
 		for (while) 
 */
public class 이중반복문4메모리주소 {

	public static void main(String[] args) {
		
		/*
		 * for(int i =1; i<=9;i++) {
		 * 
		 * for(int j =2; j<=9;j++) { System.out.printf("%2d * %2d = %2d\n",j,i,j*i); }
		 * System.out.println(); }
		 */
		
		
		System.out.println("\nfor~while==============");
		
		for (int i =1; i<=9;i++) {
			int j =2; // 새로 선언하기 때문에 진행되는 새로운 메모리가 생성된다.
			while(j<=9) {
			System.out.printf("%2d * %2d = %2d\n",i,j,j*i);
			j++;
			}
			
			System.out.println();
		}
		
		// 메모리를 아끼고 싶을 때 전역 변수를 넣고
		// heap : 프로그래머과 관리하는 영역 ??
		// stack : 지역변수가 기록되는 공간 , 메모리가 자동으로 관리됨 ??
		// garbage collection에서 관리하고 치워줌
		// -기본 타입을 사용하게 되면 메모리에서 관리됨 
		// . ( 주소값을 내놔라)
		
		// new가 되면 메모리가 계속 생성되기 때문에 
		
		
		
	}
}
