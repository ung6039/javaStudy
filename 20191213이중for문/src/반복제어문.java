/*
 #		break
 		continue
 		========	������ �ݺ����� ����
 					break ==> 4����? for,do~while,while,switch~case
 					continue => 3���� , for, do~while, while
 					 return => � ����̵� ����� �����ϴ�. (���ǹ�, ���� ���ǹ��� ��� ����� ����
 					��� �Ҽӿ� �ִ� ���� 1���� ������ / �ΰ� ���ÿ� �������� ���� 
 */
public class �ݺ���� {

	public static void main(String[] args) {
		
		for (int i =1; i<=3; i++) {
			if(i==2) continue;
			// continue �Ʒ� ������ ������� �ʰ� �����
			// ���� ��ġ�� ���� ���� ������ �޶���
			// ���� �� ���忡���� ���� ������ ������ ����
			
			for(int j =1; j<=3; j++) {
				 // ���� for���� ���ʿ���  break;�Ǿ��� ������ j=2 ������ ���������� ��
				 // 2�� for���� �ҼӵǾ��־� j�� ������
				
				System.out.println("i= "+i+" j= "+j);
			}
			System.out.println("----------------------");
			
		}
		
		
	}
}
