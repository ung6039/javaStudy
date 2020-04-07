// 1+(1+2) + (1+.....10) 이것들의 합 을 구해라 -> 이것을 함수로 하면 더 편함
// sum : 더해주는 함수 하나의 기능을 가지고 다른 값을 생각할 수 있도록 만들어 주는 것

/*
 	입력
 	처리 -> 처리에서 길어질 경우 세분화해서 나누어서 진행함
 	출력
 	삭제
 	
 	대분류 : 입력,처리,출력
 	
 */
public class 메소드1 {
	static int sum(int a) {
		int hap =0;
		for(int i =1; i<=a; i++) {
			hap+=i;
		}
		return hap;
	}
	public static void main(String[] args) {
		
		
		
		
		
		
		
	}
}
