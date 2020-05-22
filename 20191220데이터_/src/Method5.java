
public class Method5 {
	
	
	// 중복 없는 난수를 발생시키는 메서드
	static int[] nansu() {
		
		int su = (int)(Math.random()*45)+1;
		int[] com = new int[6]; 
		for(int i =0; i<6; i++) {
		boolean	bCheck =true;
			
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
		return com;
	}
	
	// 저장한 난수를 출력 하는 메서드
	
	static void print(int[] com) {
		for(int i : com) {
			 System.out.print(i+" "); 
		 }
	}
	
	// 조립
	static void process() {
		int[] com =nansu();
		print(com);
	}
	
	/*
	 	기능이 다르기 때문에 단락을 나누어 준것임.
	
	 */
	public static void main(String[] args) {
		process();
	}

}
