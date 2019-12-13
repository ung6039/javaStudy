/*
 #		break
 		continue
 		========	본인의 반복문만 제어
 					break ==> 4군데? for,do~while,while,switch~case
 					continue => 3군데 , for, do~while, while
 					 return => 어떤 제어문이든 사용이 가능하다. (조건문, 이중 조건문등 모두 사용이 가능
 					블록 소속에 있는 것은 1개만 제어함 / 두개 동시에 제어하지 않음 
 */
public class 반복제어문 {

	public static void main(String[] args) {
		
		for (int i =1; i<=3; i++) {
			if(i==2) continue;
			// continue 아래 문장을 출력하지 않고 제어됨
			// 쓰는 위치에 따라 진행 내용이 달라짐
			// 가장 밑 문장에서는 제어 가능한 내용이 없음
			
			for(int j =1; j<=3; j++) {
				 // 이중 for문의 안쪽에서  break;되었기 때문에 j=2 이전에 빠져나가게 됨
				 // 2차 for문에 소속되어있어 j를 제어함
				
				System.out.println("i= "+i+" j= "+j);
			}
			System.out.println("----------------------");
			
		}
		
		
	}
}
