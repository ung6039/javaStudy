// 1~45 ���� �߻� -> �ߺ����� 6�� �߻� Lotto ���α׷�
/*
 	�迭 ==> 6��
 	
 	for(6����)
 	{
 		while(�ߺ�)
 		{
 			�����߻�
 			�迭�� ����� �����Ϳ� ������ ������
 			bCheck = true;
 		}
 		
 		�迭 ����
 	}
 */
public class Method4 {

	public static void main(String[] args) {
		//return ���� �Ű������� ��� ������� ���� ����ؾ��Ѵ�.
		//  �Է� ����� ������ /ó�� ��� / ��� ���
		// �Է� ����� ������ �Է� / ó��/ ���
		
		// ���� ���� ����
		
		int[] com = new int[6];
		// ���� 
		int su =0;
		// �� => �ߺ�
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
		
		// ���
		 for(int i : com) { // ����� �����͸� �Ѱ��� �о�´� (for-each)���� - ����� ���� ����Ѵ�.
			 System.out.print(i+" "); 
		 }
		 
		 
	}
}
