
public class Method5 {
	
	
	// �ߺ� ���� ������ �߻���Ű�� �޼���
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
	
	// ������ ������ ��� �ϴ� �޼���
	
	static void print(int[] com) {
		for(int i : com) {
			 System.out.print(i+" "); 
		 }
	}
	
	// ����
	static void process() {
		int[] com =nansu();
		print(com);
	}
	
	/*
	 	����� �ٸ��� ������ �ܶ��� ������ �ذ���.
	
	 */
	public static void main(String[] args) {
		process();
	}

}
