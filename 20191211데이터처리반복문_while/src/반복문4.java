// = => 문자 ==> charAt(0)
public class 반복문4 {

	public static void main(String[] args) {

		/*
		 * # 100 ~ 999 7의 배수 몇개 ? 4의 배수가 아닌 것 ?
		 */

		int i = 100; // roof 변수 100 ~ 999
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
		System.out.println("4의 배수가 아닌 것의 수 : " + su1);
		System.out.println("7의 배수의 수 : " + su);

		/*
		 	#charAt(0)
		 */
	}
}
