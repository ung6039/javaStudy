
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.Scanner;

public class 반복문7한번더 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.print("검색어를 입력 : ");
		String fd = sc.next();
		// 한글을 받는 것

		int k = 1;
		while (k <= 4) {
			Document doc = Jsoup
					.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg="+ k).get();
			System.out.println(doc);
			
			Elements title = doc.select("td.info a.title");
			Elements singer = doc.select("td.info a.artist");
			// select
			// == tag title 태그를 읽어라
			int i = 0;
			while (i < title.size()) {
				String data = title.get(i).text(); // 노래명을 data에 저장 // 검색창에 노래명을 검색하면 가져온 데이터 중에 입력한 값과 같은게 있는 지 찾는 것

//			if(data.contains(fd)) {
				// contains 포함되어 있냐?

				// size() 메서드?????
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
