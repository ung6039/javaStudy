package ����;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ����1211 {

	public static void main(String[] args) throws IOException {
//		int i = 0;
//		int win=0, lose=0, same=0;
//		while(i<=5) {
//			Scanner sc = new Scanner(System.in);
//			int com = (int)(Math.random()*3);
//			
//			System.out.print("����(0), ����(1). ��(2) �Է� : ");
//			int user = sc.nextInt();
//			
//			// ��ǻ�� ���� ���� ��
//			// �·� ���� ���� ��
//			int res = com -user;
//			switch(res) {
//			// switch case������ ���ǽ��� ���Թ޴� ���� ���� �� �ִ� case���� ��ü �����ϰų�
//			// ���������� ������� �ʾƵ� ������
//			case -1:
//			case 2:
//				win++;
//				System.out.println("�̱�");
//				break;
//			case 1:
//			case -2:
//				lose++;
//				System.out.println("��");
//				break;
//			case 0:
//				same++;
//				System.out.println("���");
//				break;
//			}
//			i++;

//		}
		
		// �����쿡 �Է� â ���� �κ�
//		String a = JOptionPane.showInputDialog("���� �Է� :");
//		
//		// ����
//		Scanner sc = new Scanner(System.in);
//		boolean bCheck = false;
//		// �� ���� ������ ���ư��鼭 ������ ��
//		// 6���� ���ư��� �Ǵ� ��� 6���� ������ ������ ���� �������� ������
//		// ������ �ϰ� �Ǹ� ������ ���� �����ִ� �͵� �ʿ��� �� �ϴ�
//		int i = 1;
//		while(true) {
//			if(i % 3 ==1) {
//				System.out.println("1�����");
//			}
//			else if(i % 3 == 2) {
//				System.out.println("2�� ���");
//			}
//			else {
//				System.out.println("������ ���");
//				System.out.println("��� �Ͻðڽ��ϱ�? (Y/N)");
//				String b = sc.next();
//				if(b.equals("N,n")) {
//					break;
//				}
//			}
//			i++;
//		}
		// Ȯ�� �� �� : size() �޼���
		// cotains()
		// �±�
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �Է� : ");
		String fd = sc.next();
		// �ѱ��� �Է� �޴� ��
//		int k = 1;
//		while(k<= 4) {
//			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg="+ k).get();
//			Elements title = doc.select("td.info a.title");
//			// == tag title �±׸� �о��
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
	 	# while(i<=s.length()) ==> �ε�ȣ ǥ�ð� �� ��쿡�� ������ �߻�
	 	s.length() -> ������ ���̸� �ǹ� �ε����� 0���� �����ؼ� �ε��� ���� ����-1
	 	orcle�� 1��
	 	�� ����
	 */
		
		i =0;
		int count =0;
		// �������� �ʱ�ȭ �Ǿ����� �ٽ��ѹ� Ȯ������.
		
	}
}
