// ���� ==> charAt(0)
// String s ="askdlsjdfljsdlf ";
public class �ݺ���5�ѹ��� {

	public static void main(String[] args) {
		// ���� ã�� ���
		// while���� �����͸� �ܾ�� �� ���
		String s = "aklfasjlfjwiwowefkaaaaapfkelfkflffpepeflfls;s;epeo";
		System.out.println("s : "+s);
		
		int i =0;
		//while(i<=s.length()) --> ���� �߻�
		// s.length() -> �ִ������ ���ڰ��� null ���� �� ����
		// �ڹٴ� �迭 ���� �����ؼ� 0��
		// orcle�� 1���� ������
		
		int count =0;
		while(i<s.length()) {
			System.out.println((i+1)+"��°  ���� : "+s.charAt(i));
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
			System.out.println((i+1)+"��°  ���� : "+s.charAt(i));
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
