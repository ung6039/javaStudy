/*
 	# �ݺ���
 	
 	while  // ���� �б� ���� while���� ����Ͽ� �����Ѵ�.
 		���� )
 			�ʱ� �� 			===> 1
 			while(���ǹ�)     ===> 2
 			{
 				�ݺ� ���๮��	===> 3
 				������		==> 4    === > 2 > 3 > 4
 										   ==
 										   false�� ����
 			}
 			
 			��)
 				1~10
 				int i =1;
 				while(i<= 10){     => �� ���� (������ �ȵ� ���� �ִ� ex) ������ �ѹ��� ���� �ƴ� ��� ���� ���� ����)
 					System.out.println(i);
 					i++;    ==> i�� 11���� �����Ѵ�.
 				}
 	do while
 		���� )
 		 	�ʱ� ��    ==> 1 �� ���� 
 		 	do
 		 	{
 		 		���๮��   ======= 2   : ���๮���� �ּ��� 1���� �����Ѵ�.
 		 		������ ;  ======= 3
 		 	}while(���ǹ�); ===> 4
 		 	
 		 ��)
 		 	int i = 1;
 		 	do      // ������ ��Ű�� ������ �Ѵٴ� ���� while���� �ٸ��� // �Ű� ������ ������ ���¿��� ����ȴ�.
 		 	{
 		 		System.out.println(i);
 		 		i++;
 		 	} while(i <=10); 10�϶� ���� ����ϰ� 11�� �� ��������
 	for
 		����)		  1     2    4
 			for (�ʱⰪ;���ǽ� ;������)
 			{
 				���๮�� => 3
 			}
 			
 			for (int i = 1; i<=10; i++) {
 				
 				System.out.println(i);
 			}
 		===============================
 		��� (�׻� ��� �Ҷ��� ���η� ��µȴ� // ���η� ����ϱ� ���ؼ��� �߰����� �Է��� �ʿ�)
 			========================
 */
public class �ݺ���1 {

	 public static void main(String[] args) {
		 /*
		  # 1~10 ���� ��� �ϴµ� 1�ٿ� 3���� ���
		  */
		 
		 int su = 1;
		 
		 while(su<=10) {
			 System.out.print(su+"\t");
			 su++;
			 if(su%3 == 1) {
				 System.out.println();
				 // if(su % 3 == 0) --> 3�� ����� �� 1���� ��µ� // �̷��� 3������ �ƴ϶� 2���� ��µ� (su %4 )�� ��쿡�� 4���� �Ǵ� ��쵵 ����
				 // ����� ������ �ڵ����� ������ ������ �߻��� �� ����
			 }
			 
		 }
		 System.out.println();
		 su = 1;
		 while(su<=10) {
			 System.out.print(su+"\t");
			 if(su%3 == 0) {
				 System.out.println();
			 }
			 su++;
		 }
		 System.out.println();
		 int num =1;
		 do {
			 System.out.print(num+"\t");
			 if(num % 3 == 0) {
				 System.out.println();
			 }
			 num++;
			 
		 }while(num<=10);
		 
		 System.out.println("for");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
