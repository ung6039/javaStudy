package ����;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ����20191212 {

	public static void main(String[] args) throws IOException {


		/*
		 * // �ݺ��� ���캼 �� ������ ������ �ݺ������� ��������Ѵ�. // ex) ��ɹ� ���� / ����� ����� �ݺ��� �� ������ ������ ���ǿ�
		 * ���� �޶��� �� �ִ�.
		 * 
		 * 
		 * 
		 * # private �޼���, ������ private�� ����� Ŭ������ ����� ���� �̸� ����ϱ� ���ؼ��� getter(), setter()��
		 * �̿��ϸ� ��// ��Ŭ���� �̿��ϸ� �� ����ǵ��� ó���Ǿ� ����
		 * 
		 * 
		 * //String�� ����� ���� �ޱ�
		 * 
		 * // int kor =0,eng =0,math=0,total=0,avg=0; // char score ='A'; // // int kor1
		 * =0, eng1 =0,math1=0, total1=0, avg1=0; // char score1 ='A'; // // int kor2
		 * =0,eng2=0, math2=0,total2=0,avg2=0; // char score2 ='A'; // // int i =1; //
		 * Scanner sc =new Scanner(System.in);
		 * 
		 * // do { // if(i ==1) // ù ��° �л� // // �ݺ����ȿ��� ������ ������ ���� �ٸ� ������� ������ �� �ִ�. //
		 * // { // System.out.print("���� ���� : "); // kor =sc.nextInt(); // //
		 * System.out.println("���� ���� : "); // eng =sc.nextInt(); // //
		 * System.out.println("���� ���� : "); // math= sc.nextInt(); // // total
		 * =kor+eng+math; // avg= total/3; // // char c ='A'; // // switch(avg/10) { //
		 * // case 10: // case 9: // c='A'; // break; // case 8: // c='B'; // break; //
		 * case 7: // c ='C'; // break; // case 6: // c ='D'; // break; // default: //
		 * c='F'; // } // score=c; // } // if(i ==2) { // System.out.print("���� ���� : ");
		 * // kor1 =sc.nextInt(); // // System.out.println("���� ���� : "); // eng1
		 * =sc.nextInt(); // // System.out.println("���� ���� : "); // math1= sc.nextInt();
		 * // // total1 =kor1+eng1+math1; // avg1= total1/3; // // char c ='A'; // //
		 * switch(avg1/10) { // // case 10: // case 9: // c='A'; // break; // case 8: //
		 * c='B'; // break; // case 7: // c ='C'; // break; // case 6: // c ='D'; //
		 * break; // default: // c='F'; // } // score1=c; // } // else { //
		 * System.out.print("���� ���� : "); // kor2 =sc.nextInt(); // //
		 * System.out.println("���� ���� : "); // eng2 =sc.nextInt(); // //
		 * System.out.println("���� ���� : "); // math2= sc.nextInt(); // // total2
		 * =kor2+eng2+math2; // avg2= total2/3; // // char c ='A'; // // switch(avg2/10)
		 * { // // case 10: // case 9: // c='A'; // break; // case 8: // c='B'; //
		 * break; // case 7: // c ='C'; // break; // case 6: // c ='D'; // break; //
		 * default: // c='F'; // } // score2=c; // } // // i++; // }while(i<3); // //
		 * System.out.println("����  ����  ����   ����  ���  ����"); //
		 * System.out.println(kor+"  "+eng+"  "+math+"  " //
		 * +total+"  "+avg+"  "+score); //
		 * System.out.println(kor1+"  "+eng1+"  "+math1+"  " //
		 * +total1+"  "+avg1+"  "+score1); //
		 * System.out.println(kor2+"  "+eng2+"  "+math2+"  " //
		 * +total2+"  "+avg2+"  "+score2);
		 * 
		 * 
		 * 
		 * // int kor,eng,math,total,avg; // // avg ����� double�� ���� �ʾҴ� ���� : swtich
		 * case�������� ���� ���� ���� ������ // // �Ǽ��� �� ���� ���� // // String result =""; // int i
		 * =1; // char score; // Scanner sc = new Scanner(System.in); // do // { //
		 * System.out.print("���� ���� : "); // kor = sc.nextInt(); // //
		 * System.out.print("���� ���� :"); // eng = sc.nextInt(); // //
		 * System.out.print("���� ���� :"); // math = sc.nextInt(); // total = kor+eng+math;
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
		 * Scanner sc = new Scanner(System.in); System.out.println("�˻��� �Է� : "); String
		 * fd = sc.next(); // �ѱ� �����͸� �����ϴ� ���� int k =1; while(k <=4) { Document doc =
		 * Jsoup.connect(
		 * "https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg="+k)
		 * .get();
		 * 
		 * System.out.println(doc);
		 * 
		 * Elements title = doc.select("td.info a.title"); // select // == tag title Ÿ��Ʋ
		 * �±׸� �о�� int i = 0; while(i <title.size()) { String dat = title.get(i).text();
		 * // �뷡�� �� ���� System.out.print(i); System.out.print(dat);
		 * System.out.println("#//# "+ title.get(i).text());
		 * System.out.println("========="); i++; } k++;
		 * 
		 }
		 */

		
	// window â�� �Է�ȭ�� ���� ���
		String a = JOptionPane.showInputDialog("���� �Է� : ");
		
		
	}
}


