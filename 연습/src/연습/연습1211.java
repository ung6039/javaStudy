package 연습;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 연습1211 {

	public static void main(String[] args) throws IOException {
//		int i = 0;
//		int win=0, lose=0, same=0;
//		while(i<=5) {
//			Scanner sc = new Scanner(System.in);
//			int com = (int)(Math.random()*3);
//			
//			System.out.print("가위(0), 바위(1). 보(2) 입력 : ");
//			int user = sc.nextInt();
//			
//			// 컴퓨터 가위 바위 보
//			// 승률 가위 바위 보
//			int res = com -user;
//			switch(res) {
//			// switch case문에서 조건식이 대입받는 값이 들어올 수 있다 case문을 전체 포괄하거나
//			// 순차적으로 진행되지 않아도 괜찮음
//			case -1:
//			case 2:
//				win++;
//				System.out.println("이김");
//				break;
//			case 1:
//			case -2:
//				lose++;
//				System.out.println("짐");
//				break;
//			case 0:
//				same++;
//				System.out.println("비김");
//				break;
//			}
//			i++;

//		}
		
		// 윈도우에 입력 창 띄우는 부분
//		String a = JOptionPane.showInputDialog("정수 입력 :");
//		
//		// 턴제
//		Scanner sc = new Scanner(System.in);
//		boolean bCheck = false;
//		// 턴 제로 순번이 돌아가면서 진행이 됨
//		// 6명이 돌아가게 되는 경우 6으로 나눈뒤 나머지 값을 가져오는 것으로
//		// 턴제를 하게 되면 순번에 따라 멈춰주는 것도 필요할 듯 하다
//		int i = 1;
//		while(true) {
//			if(i % 3 ==1) {
//				System.out.println("1번사람");
//			}
//			else if(i % 3 == 2) {
//				System.out.println("2번 사람");
//			}
//			else {
//				System.out.println("마지막 사람");
//				System.out.println("계속 하시겠습니까? (Y/N)");
//				String b = sc.next();
//				if(b.equals("N,n")) {
//					break;
//				}
//			}
//			i++;
//		}
		// 확인 할 것 : size() 메서드
		// cotains()
		// 태그
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String fd = sc.next();
		// 한글을 입력 받는 것
//		int k = 1;
//		while(k<= 4) {
//			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg="+ k).get();
//			Elements title = doc.select("td.info a.title");
//			// == tag title 태그를 읽어라
//			int i = 0;
//			while(i < title.size()) {
//				String data = title.get(i).text();
//				
//				if(data.contains(fd)) {
//					
//				System.out.print(i);
//				System.out.println(data);
//				System.out.println("# // # "+ title.get(i).text());
//				System.out.println("==============================");
//				}
//			}
//			i++;
//		}
//		k++;
//		
//	}
		String s = "dfsfasfasf";
		System.out.println("s : "+s);
		
		int i = 0;
	/*
	 	# while(i<=s.length()) ==> 부등호 표시가 들어갈 경우에는 오류가 발생
	 	s.length() -> 문자의 길이를 의미 인덱스는 0부터 시작해서 인덱스 값은 길이-1
	 	orcle은 1부
	 	터 시작
	 */
		
		i =0;
		int count =0;
		// 변수들이 초기화 되었는지 다시한번 확인하자.
		
	}
}
