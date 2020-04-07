
public class 반복문6 {

	public static void main(String[] args) {
		
		boolean bCheck = false;
		// 턴 제로 돌아가는 것
		// 6번명이 돌아가는 경우 6으로 나눈 나머지 값을 가져오는 것
		// 
		while(true) 
		{
			bCheck = !bCheck;
			if(bCheck == true) 
			{
				System.out.println("본인 차례");
			}
			else
			{
				System.out.println("컴퓨터 차례");
			}
		}
	}
}
