/*
 		������ ��� : 2�� ����~ 9�ܱ���
 		for (while) 
 */
public class ���߹ݺ���4�޸��ּ� {

	public static void main(String[] args) {
		
		/*
		 * for(int i =1; i<=9;i++) {
		 * 
		 * for(int j =2; j<=9;j++) { System.out.printf("%2d * %2d = %2d\n",j,i,j*i); }
		 * System.out.println(); }
		 */
		
		
		System.out.println("\nfor~while==============");
		
		for (int i =1; i<=9;i++) {
			int j =2; // ���� �����ϱ� ������ ����Ǵ� ���ο� �޸𸮰� �����ȴ�.
			while(j<=9) {
			System.out.printf("%2d * %2d = %2d\n",i,j,j*i);
			j++;
			}
			
			System.out.println();
		}
		
		// �޸𸮸� �Ƴ��� ���� �� ���� ������ �ְ�
		// heap : ���α׷��Ӱ� �����ϴ� ���� ??
		// stack : ���������� ��ϵǴ� ���� , �޸𸮰� �ڵ����� ������ ??
		// garbage collection���� �����ϰ� ġ����
		// -�⺻ Ÿ���� ����ϰ� �Ǹ� �޸𸮿��� ������ 
		// . ( �ּҰ��� ������)
		
		// new�� �Ǹ� �޸𸮰� ��� �����Ǳ� ������ 
		
		
		
	}
}
