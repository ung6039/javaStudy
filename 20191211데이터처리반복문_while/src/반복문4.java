// = => ���� ==> charAt(0)
public class �ݺ���4 {

	public static void main(String[] args) {

		/*
		 * # 100 ~ 999 7�� ��� � ? 4�� ����� �ƴ� �� ?
		 */

		int i = 100; // roof ���� 100 ~ 999
		int su = 0, su1 = 0;
		while (i <= 999) {

			if (i % 7 == 0) {
				su++;
			}
			if (i % 4 != 0) {
				su1++;
			}
			i++;
		}
		System.out.println("4�� ����� �ƴ� ���� �� : " + su1);
		System.out.println("7�� ����� �� : " + su);

		/*
		 	#charAt(0)
		 */
	}
}
