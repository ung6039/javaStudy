
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.Scanner;

public class �ݺ���7�ѹ��� {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.print("�˻�� �Է� : ");
		String fd = sc.next();
		// �ѱ��� �޴� ��

		int k = 1;
		while (k <= 4) {
			Document doc = Jsoup
					.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg="+ k).get();
			System.out.println(doc);
			
			Elements title = doc.select("td.info a.title");
			Elements singer = doc.select("td.info a.artist");
			// select
			// == tag title �±׸� �о��
			int i = 0;
			while (i < title.size()) {
				String data = title.get(i).text(); // �뷡���� data�� ���� // �˻�â�� �뷡���� �˻��ϸ� ������ ������ �߿� �Է��� ���� ������ �ִ� �� ã�� ��

//			if(data.contains(fd)) {
				// contains ���ԵǾ� �ֳ�?

				// size() �޼���?????
				System.out.print(i);

				System.out.print(data);
				System.out.println(" #//#" + singer.get(i).text());
				System.out.println("=============================");
//			 	}
				i++;
			}
			k++;
		}
	}
}
