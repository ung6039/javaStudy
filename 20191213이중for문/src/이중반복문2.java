/*
 	1	2	3	4	5
 		6	7	8
 			9
 		10	11	12
 	13	14	15	16	17
 */
public class 이중반복문2 {
	/*	i	js	je    (처음 / 중간 / 끝 값을 서로 다르게 해야한다. 서로 각각 만들어 for문을 돌린다.
	 	0	0	4   (1~5)
	 	1	1	3	(6~8)
	 	2	2	2
	 	----------------- js =1 j+je =4 ==> je = 4-i
	 	3	1	3			i+js =4 => js =4-i; je=i
	 	4	0	4
	 */
	public static void main(String[] args) {
		
		int k =0;
		int[][] arr = new int[5][5];
		for(int i =0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				arr[i][j] =k++;
			}
		}
		for(int i =0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr[i][j]==0) {
					System.out.println(" ");
					System.out.println(arr[i][j]);
				}
			}
		}
		
		
		
	}
}
