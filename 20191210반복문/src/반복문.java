/*
 	# �ݺ���
 		================== �� ���� (������ �˻��� �ϰ�  true�� ����) 1���� ���� ���� ���� �� �ִ�.
 		= for  : �ݺ�Ƚ�� ����
 		= while : ������ ���� ���
 			�ʱⰪ 
 			while(���ǹ�)
 			{
 				���� ����
 				������
 			}
 		  ================ �� ���� 
 		= do~ while	 : (�� ���� ������ ����)
 	 		�ʱⰪ
 	 		do
 	 		{
 	 			���๮��
 	 			������
 	 		}while(���ǹ�)
 		==================
 		(������ false�� �� ������ ���ư�)
 */
public class �ݺ��� {

	public static void main(String[] args) {
//		String[] s= {"A","b","v","d","f","g","h","I","E","G"};
//		System.out.println(s.length);
//		int[] ss = {3,4,5,6,7,3,2,3,4,5,64,3,4,5};
//		int i  = 1;
//		
//		while(i<= 10) {
//			System.out.print("i = "+i+"\n");
//			System.out.println(s[i]+" - "+ss[i]);
//			i++;
//		}
		int i = 0; // 1
		int sum = 0;
		int num = 0,num5=0,num7=0;
		char c = 'A';
		while(i<= 100) {  //2
			
//			if(i % 3 == 0) {
//				num += i;
//				System.out.print("3�� ��� : "+i+",");
//			}
//			if(i % 5 == 0) {
//				num5 += 5;
//				System.out.print("5�� ��� "+i+",");
//			}
//			if(i % 7 == 0) {
//				num7 += 7;
//				System.out.print("7�� ��� "+i+",");
//			}
//			sum +=i;
//			i++;
			
			System.out.print((char)(c+i)+" ");
			i++;
			if((c+i) > 'Z') break;
		}
		System.out.println("\n1~100 ������ ��  : "+sum );
		System.out.println("3�� ����� �� : "+num);
		System.out.println("5�� ����� �� : "+num5);
		System.out.println("7�� ����� �� : "+num7);
		/*
		 		# 1 ===> 2 ==> 3 ==> 4
		 		
		 */
		int d ='A';
		System.out.println(c);
		
		// 3�� ����� ��  5�� ����� �� 7�� ����� ��
		System.out.println();
		
		
		
		char de = 'A';
		while(de <= 'Z') {
			System.out.print(de +" ");
			de++;
		}
	}

}
