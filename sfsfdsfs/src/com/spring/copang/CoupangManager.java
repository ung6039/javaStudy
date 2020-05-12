package com.spring.copang;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoupangManager {

	public List<CoupangVO> sListData(){
		List<CoupangVO> list = new ArrayList<CoupangVO>();
		int page=1;
//		for(page =1; page<=17; page++){
			try{
				System.out.println("!!");
				String url="https://www.coupang.com/np/categories/195268?listSize=60&brand=&offerCondition=&filterType=&isPriceRange=false&minPrice=&maxPrice=&page=1&channel=user&fromComponent=Y&selectedPlpKeepFilter=&sorter=bestAsc&filter=&component=195168&rating=0";
				
		
				Document doc = Jsoup.connect(url).timeout(10*1000).post();
				Elements name = doc.select("dl.baby-product-wrap dd.descriptions div.name");
				Elements image = doc.select("dl.baby-product-wrap dt.image img");
				Elements discount_percentage = doc.select("dl.baby-product-wrap dd.descriptions div.price-area div> span.price-info span.discount-percentage");
				Elements base_price=doc.select("dl.baby-product-wrap dd.descriptions div.price-area del.base-price");
				
				try{
					
					Elements unit_price = doc.select("dl.baby-product-wrap dd.descriptions div.price-area span.unit-price");
					
					for(int i =0; i<10; i++){
						String tname = name.get(i).text();
						System.out.println(tname);
						String timage = image.get(i).attr("src");
						String tdiscount_percentage =discount_percentage.get(i).text();
						String tbase_price = base_price.get(i).text();
						String tunit_price = unit_price.get(i).text();
					}
				}catch(Exception ex){
					System.out.println("unit_price 없음");
				}
				
				
				
			
			}catch(Exception ex){
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}
//		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		CoupangManager sm = new CoupangManager();
		List<CoupangVO> list = sm.sListData();
	}
}
