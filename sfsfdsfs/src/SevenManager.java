
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SevenManager {

	public List<SevenVO> sListData(){
		List<SevenVO> list = new ArrayList<SevenVO>();
		int page=1;
		
		try{
			Document doc = Jsoup.connect("https://www.coupang.com/np/categories/195268?listSize=60&brand=&offerCondition=&filterType=&isPriceRange=false&minPrice=&maxPrice=&page=1&channel=user&fromComponent=Y&selectedPlpKeepFilter=&sorter=bestAsc&filter=&component=195168&rating=0").get();
			
			Elements img = doc.select("div.border-gray > center > div > div");
			int i=0;	
		/*	for(Element img1 : img){
				System.out.println(i);
				System.out.println(img1);
				i++;
			}*/
			i=0;
			Elements name = doc.select("div.ellipse_width_2line");
		/*	for(Element temp : name){
				System.out.println(i);
				System.out.println(name);
			}*/
			i=0;
			Elements type = doc.select("div.border-gray > div > div span");
		/*	for(Element temp : type){
				System.out.println(i);
				System.out.println(type);
			}*/
			Elements price = doc.select("div.border-gray");
			String ttp = "";
			for(Element temp : price){
				String temp_temp = String.valueOf(temp.text());
				ttp= temp_temp.substring(temp_temp.lastIndexOf("+"));
				System.out.println(ttp);
				temp_temp = ttp.substring(temp_temp.indexOf("1"),temp_temp.indexOf(" "));
				//temp_temp = ttp.substring(ttp.lastIndexOf(" "));
				//System.out.println(ttp);
				System.out.println(temp_temp);
			}
			
			String brand ="Seven";
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		SevenManager sm = new SevenManager();
		sm.sListData();
	}
}
