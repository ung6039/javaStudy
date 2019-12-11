// A~Z; 1줄에 5개씩 
//
public class 반복문2 {

	public static void main(String[] args) {
		
		char F1 ='A';
		//변수를 2개를 잡고 시작 :
		while(F1 <='Z') {
			System.out.print(F1+"\t");
			F1++;
			if(65<F1 && F1 % 5 == 0) {
				System.out.println();
			}
			
		}
		
		int i = 1;
		char c = 'A';
		while(i<=26) {
			System.out.print(c++ + "\t");
			if(i% 5 == 0) {
				System.out.println();
			}
			i++;
		}
		System.out.println("\n");
		// 두번째 문제
		// 처음 줄은 대문자 소문자
		i = 1;
		c = 'A';
		while(i<=26) {
			System.out.print(c++ + "\t");
			if(i% 5 == 0 && i % 10 !=0) {
				System.out.println();
				c += 32;
			}
			else if(i % 10 == 0) {
				System.out.println();
				c -= 32;
			}
			i++;
		}
		System.out.println();
		
		i = 1;
		int j = 0;
		c = 'A';
		while(i<=26) {
			if(j ==1) {
				System.out.println(c+ "\t");
			}
			else
				System.out.print((char)(c-=32)+ "\t");
			System.out.print(c++ + "\t");
			if(i% 5 == 0) {
				System.out.println();
				c += 32;
				j = 0;
			}
			i++;
			c++;
		}
		System.out.println("\n\n");
		i =1;
		c ='A';
		boolean bCheck= true;
		while(i<=26) {
			if(bCheck == true)
				System.out.print(c+"\t");
			else
				System.out.print((char)(c+32)+"\t");
			if(i% 5== 0) {
				System.out.println();
				bCheck = !bCheck;
				// !boolean >> true // false 값이 계속 바뀜
				
			}
			i++;
			c++;
		}
	}
}
