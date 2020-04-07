// 문자 ==> charAt(0)
// String s ="askdlsjdfljsdlf ";
public class 반복문5한번더 {

	public static void main(String[] args) {
		// 문자 찾는 방법
		// while문은 데이터를 긁어올 때 사용
		String s = "aklfasjlfjwiwowefkaaaaapfkelfkflffpepeflfls;s;epeo";
		System.out.println("s : "+s);
		
		int i =0;
		//while(i<=s.length()) --> 오류 발생
		// s.length() -> 최대길이의 숫자값은 null 값이 들어가 있음
		// 자바는 배열 부터 시작해서 0임
		// orcle은 1부터 시작함
		
		int count =0;
		while(i<s.length()) {
			System.out.println((i+1)+"번째  문자 : "+s.charAt(i));
			char c = s.charAt(i);
			if(c =='a' || c == 'A') {
				count++;
			}
			i++;
		}
		//
		System.out.println("A(a) : "+count);
		
		
		System.out.println(s.charAt(0));
		i=0;
		count =0;
		while(i<s.length()) {
			System.out.println((i+1)+"번째  문자 : "+s.charAt(i));
			s.charAt(i);
			if(s.charAt(i) == 'a' || s.charAt(i) == 'A') {
				count++;
			}
			i++;
		}
		//
		System.out.println("A(a) : "+count);
	}
}
