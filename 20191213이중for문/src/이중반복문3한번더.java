/*
 	# 정보처리,코딩테스트 => 2중 for문 -> 알고리즘,패턴 => 최적화
 	 break; : 반복 중단
 	 for(int i =1; i<=10; i++){
 	 	if(i ==5) break;
 	 	System.out.println(i);
 	 }
 	 continue : 특정부분을 제외 할 때
 	 
 */
public class 이중반복문3한번더 {

	public static void main(String[] args) {
		
		
		for(int i =1; i<=10; i++){
	 	 	if(i ==5 || i == 7) continue; 
	 	 	// 단어를 가져올 때 많이 사용됨
	 	 	// 포트폴리오 : 사이트처럼 모방하되 가지고 있지 않는 것을 추가하는 것
	 	 	// 결제까지 1방에
	 	 	System.out.println(i);
	 	 }
		
		for(int i =1; i<=10; i++) {
			
			if(i % 2 != 0) {
				System.out.println("종료");
				continue; //==> 여기서 종료
			}
			System.out.println(i);
		}
		
		
		
		
	}
}
