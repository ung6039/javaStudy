package 연습;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 연습20191212 {

	public static void main(String[] args) throws IOException {


		/*
		 * // 반복문 살펴볼 때 주의점 어디까지 반복문인지 살펴봐야한다. // ex) 명령문 위주 / 출력의 명령은 반복될 수 있지만 내용은 조건에
		 * 따라 달라질 수 있다.
		 * 
		 * 
		 * 
		 * # private 메서드, 변수는 private가 선언된 클래스만 사용이 가능 이를 사용하기 위해서는 getter(), setter()를
		 * 이용하면 됨// 우클릭을 이용하면 잘 적용되도록 처리되어 있음
		 * 
		 * 
		 * //String을 사용한 점수 받기
		 * 
		 * // int kor =0,eng =0,math=0,total=0,avg=0; // char score ='A'; // // int kor1
		 * =0, eng1 =0,math1=0, total1=0, avg1=0; // char score1 ='A'; // // int kor2
		 * =0,eng2=0, math2=0,total2=0,avg2=0; // char score2 ='A'; // // int i =1; //
		 * Scanner sc =new Scanner(System.in);
		 * 
		 * // do { // if(i ==1) // 첫 번째 학생 // // 반복문안에서 조건을 넣으면 서로 다른 내용들을 저장할 수 있다. //
		 * // { // System.out.print("국어 점수 : "); // kor =sc.nextInt(); // //
		 * System.out.println("영어 점수 : "); // eng =sc.nextInt(); // //
		 * System.out.println("수학 점수 : "); // math= sc.nextInt(); // // total
		 * =kor+eng+math; // avg= total/3; // // char c ='A'; // // switch(avg/10) { //
		 * // case 10: // case 9: // c='A'; // break; // case 8: // c='B'; // break; //
		 * case 7: // c ='C'; // break; // case 6: // c ='D'; // break; // default: //
		 * c='F'; // } // score=c; // } // if(i ==2) { // System.out.print("국어 점수 : ");
		 * // kor1 =sc.nextInt(); // // System.out.println("영어 점수 : "); // eng1
		 * =sc.nextInt(); // // System.out.println("수학 점수 : "); // math1= sc.nextInt();
		 * // // total1 =kor1+eng1+math1; // avg1= total1/3; // // char c ='A'; // //
		 * switch(avg1/10) { // // case 10: // case 9: // c='A'; // break; // case 8: //
		 * c='B'; // break; // case 7: // c ='C'; // break; // case 6: // c ='D'; //
		 * break; // default: // c='F'; // } // score1=c; // } // else { //
		 * System.out.print("국어 점수 : "); // kor2 =sc.nextInt(); // //
		 * System.out.println("영어 점수 : "); // eng2 =sc.nextInt(); // //
		 * System.out.println("수학 점수 : "); // math2= sc.nextInt(); // // total2
		 * =kor2+eng2+math2; // avg2= total2/3; // // char c ='A'; // // switch(avg2/10)
		 * { // // case 10: // case 9: // c='A'; // break; // case 8: // c='B'; //
		 * break; // case 7: // c ='C'; // break; // case 6: // c ='D'; // break; //
		 * default: // c='F'; // } // score2=c; // } // // i++; // }while(i<3); // //
		 * System.out.println("국어  영어  수학   총점  평균  학점"); //
		 * System.out.println(kor+"  "+eng+"  "+math+"  " //
		 * +total+"  "+avg+"  "+score); //
		 * System.out.println(kor1+"  "+eng1+"  "+math1+"  " //
		 * +total1+"  "+avg1+"  "+score1); //
		 * System.out.println(kor2+"  "+eng2+"  "+math2+"  " //
		 * +total2+"  "+avg2+"  "+score2);
		 * 
		 * 
		 * 
		 * // int kor,eng,math,total,avg; // // avg 평균을 double로 놓지 않았던 이유 : swtich
		 * case문에서는 정수 값만 들어가기 때문에 // // 실수형 을 잡지 않음 // // String result =""; // int i
		 * =1; // char score; // Scanner sc = new Scanner(System.in); // do // { //
		 * System.out.print("국어 점수 : "); // kor = sc.nextInt(); // //
		 * System.out.print("영어 점수 :"); // eng = sc.nextInt(); // //
		 * System.out.print("수학 점수 :"); // math = sc.nextInt(); // total = kor+eng+math;
		 * // avg = total/3; // char c ='A'; // switch(avg/10) { // // case 10: // case
		 * 9: // c ='A'; // break; // case 8: // c= 'B'; // break; // case 7: // c ='C';
		 * // break; // case 6: // c= 'D'; // break; // default : // c ='F'; // } //
		 * result += " "+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"  "+c+"\n"; // i++;
		 * // }while(i<=3); // // // // System.out.println(result);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.println("검색어 입력 : "); String
		 * fd = sc.next(); // 한글 데이터를 저자하는 공간 int k =1; while(k <=4) { Document doc =
		 * Jsoup.connect(
		 * "https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg="+k)
		 * .get();
		 * 
		 * System.out.println(doc);
		 * 
		 * Elements title = doc.select("td.info a.title"); // select // == tag title 타이틀
		 * 태그를 읽어라 int i = 0; while(i <title.size()) { String dat = title.get(i).text();
		 * // 노래명 을 저장 System.out.print(i); System.out.print(dat);
		 * System.out.println("#//# "+ title.get(i).text());
		 * System.out.println("========="); i++; } k++;
		 * 
		 }
		 */

		
	// window 창에 입력화면 띄우는 방법
		String a = JOptionPane.showInputDialog("정수 입력 : ");
		
		
	}
}


