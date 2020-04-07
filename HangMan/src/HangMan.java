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
	// 단어를 선택하는 과정
	void setWord() throws IOException{
		// FileReader
		BufferedReader in = new BufferedReader(new FileReader("C:C:\\Users\\sist\\Desktop\\필기(메모장\\바탕화면.txt"));
		// 랜덤 객체를 통해서 입력받은 숫자를 rdint에 넣고 25143개의 단어가 들어있는 메모장에서 readline을
				// 통해 읽어들인 단어들을 word라는 변수에 저장
		int rdint = rd.nextInt(25143);
		int i =0 ;
		while((word = in.readLine()) != null){
			// while문 은 어떤 내용일까??
			if (i == rdint) {
				word2 = word;
				break;
			}
			i++;
		}
	}
	// 단어에 2~5개까지의 빈칸을 지정
	void setBlank() throws IOException{
		
		// 전부 빈칸이 되는 것을 방지하기 위해서 ??? 어떤 방식인지 잘모르겠음
		while(num+2 >= word.length()) {
			setWord();
		}
		str = new String[num];// 처리된 값의 글자 ??????
		wordnum = new int[num]; // 처리된 값의 인덱스 ??
		for ( int i = 0; i<num; i++) {
			int  wordleng = rd.nextInt(word.length()); // ???
			// 랜덤함수 값 rd.nextInt() = 0.0 ~0.9까지의 수를 보내지만
			// rd.nextInt(10) 0~9까지의 수를 반환해줌
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
	// 난이도 설정
	System.out.print("난이도 설정 (1,2,3,4,5) : ");
	int level = sc.nextInt();
	
	//서 생성자는 메인함수에서 난이도를 입력받을 때, 난이도의 숫자+1을 공백으로 지정해주기 위한 것입니다
//	[출처] 자바 행맨(Hangman) 게임 소스와 직접만든 코드 설명|작성자 에드
//   ?????? -> 무슨 말인지 모르겠음

	Methods mt =new Methods(level+1);
	// 단어 결정하는 메서드
	mt.setWord();
	// 빈칸 설정
	mt.setBlank();
	// 플레이
	mt.play();
	
	// replay 물어보기
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
