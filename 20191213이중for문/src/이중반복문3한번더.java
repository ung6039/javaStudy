/*
 	# ����ó��,�ڵ��׽�Ʈ => 2�� for�� -> �˰���,���� => ����ȭ
 	 break; : �ݺ� �ߴ�
 	 for(int i =1; i<=10; i++){
 	 	if(i ==5) break;
 	 	System.out.println(i);
 	 }
 	 continue : Ư���κ��� ���� �� ��
 	 
 */
public class ���߹ݺ���3�ѹ��� {

	public static void main(String[] args) {
		
		
		for(int i =1; i<=10; i++){
	 	 	if(i ==5 || i == 7) continue; 
	 	 	// �ܾ ������ �� ���� ����
	 	 	// ��Ʈ������ : ����Ʈó�� ����ϵ� ������ ���� �ʴ� ���� �߰��ϴ� ��
	 	 	// �������� 1�濡
	 	 	System.out.println(i);
	 	 }
		
		for(int i =1; i<=10; i++) {
			
			if(i % 2 != 0) {
				System.out.println("����");
				continue; //==> ���⼭ ����
			}
			System.out.println(i);
		}
		
		
		
		
	}
}
