import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
class Methods{
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	String[] str;
	int[] wordnum;
	String word;
	String word2;
	int num;
	Methods(int n){	
		this.num = n;
		// this??
	}
	// �ܾ �����ϴ� ����
	void setWord() throws IOException{
		// FileReader
		BufferedReader in = new BufferedReader(new FileReader("C:C:\\Users\\sist\\Desktop\\�ʱ�(�޸���\\����ȭ��.txt"));
		// ���� ��ü�� ���ؼ� �Է¹��� ���ڸ� rdint�� �ְ� 25143���� �ܾ ����ִ� �޸��忡�� readline��
				// ���� �о���� �ܾ���� word��� ������ ����
		int rdint = rd.nextInt(25143);
		int i =0 ;
		while((word = in.readLine()) != null){
			// while�� �� � �����ϱ�??
			if (i == rdint) {
				word2 = word;
				break;
			}
			i++;
		}
	}
	// �ܾ 2~5�������� ��ĭ�� ����
	void setBlank() throws IOException{
		
		// ���� ��ĭ�� �Ǵ� ���� �����ϱ� ���ؼ� ??? � ������� �߸𸣰���
		while(num+2 >= word.length()) {
			setWord();
		}
		str = new String[num];// ó���� ���� ���� ??????
		wordnum = new int[num]; // ó���� ���� �ε��� ??
		for ( int i = 0; i<num; i++) {
			int  wordleng = rd.nextInt(word.length()); // ???
			// �����Լ� �� rd.nextInt() = 0.0 ~0.9������ ���� ��������
			// rd.nextInt(10) 0~9������ ���� ��ȯ����
			char ch = word.charAt(wordleng);
			if(ch!='-') {
				str[i] = word.charAt(wordleng) +"";
				wordnum[i] = wordleng;
				word = word.substring(0,wordleng) + "-" + word.substring(wordleng +1 ,word.length());
			}
			else {
				i--;
			}
		}
	}
	void play() throws IOException{
		
	}
}

public class HangMan {
	
	public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	
	while(true) {
	// ���̵� ����
	System.out.print("���̵� ���� (1,2,3,4,5) : ");
	int level = sc.nextInt();
	
	//�� �����ڴ� �����Լ����� ���̵��� �Է¹��� ��, ���̵��� ����+1�� �������� �������ֱ� ���� ���Դϴ�
//	[��ó] �ڹ� ���(Hangman) ���� �ҽ��� �������� �ڵ� ����|�ۼ��� ����
//   ?????? -> ���� ������ �𸣰���

	Methods mt =new Methods(level+1);
	// �ܾ� �����ϴ� �޼���
	mt.setWord();
	// ��ĭ ����
	mt.setBlank();
	// �÷���
	mt.play();
	
	// replay �����
	System.out.println("Replay(y/n) : ");
	String Yn = sc.next();
	if(Yn.equals("N")|| Yn.equals("n")) {
			break;
	 		}
		}
	
	
	System.out.println("#######");
	System.out.println("$$$$$$$$");
	System.out.println("########");
	
	
	}
}
