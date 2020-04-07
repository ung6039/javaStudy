// 1~45 난수 발생 -> 중복없는 6개 발생 Lotto 프로그램
/*
 	배열 ==> 6개
 	
 	for(6바퀴)
 	{
 		while(중복)
 		{
 			난수발생
 			배열에 저장된 데이터와 난수가 같으면
 			bCheck = true;
 		}
 		
 		배열 저장
 	}
 */
public class Method4 {

	public static void main(String[] args) {
		//return 값과 매개변수를 잡는 방법들을 많이 고민해야한다.
		//  입력 기능이 없으면 /처리 기능 / 출력 기능
		// 입력 기능이 있으면 입력 / 처리/ 출력
		
		// 난수 저장 공간
		
		int[] com = new int[6];
		// 난수 
		int su =0;
		// 비교 => 중복
		for(int i =0; i<6; i++) {
		boolean	bCheck =true;
			// Math.random()
			// 0.0~0.99*45 
			// (int) 0~44 
			// -=> +1;
			while(bCheck) {
				bCheck =false;
				su =(int)(Math.random()*45)+1;
				for(int j =0; j<i; j++) {
					if(com[j] == su) {
						bCheck = true;
						break;
						}
				}
			}
			com[i] = su;
		}
		
		// 출력
		 for(int i : com) { // 저장된 데이터를 한개씩 읽어온다 (for-each)구문 - 출력할 때만 사용한다.
			 System.out.print(i+" "); 
		 }
		 
		 
	}
}
