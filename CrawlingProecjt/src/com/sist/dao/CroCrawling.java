package com.sist.dao;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CroCrawling {
	
	CroDAO dao = new CroDAO();
	
	public List<CroVO> sListData(){
		List<CroVO> list = new ArrayList<CroVO>();
		List<SearchVO> slist = dao.ListAllData();
		int e=0;
		String select_title ="버섯";
//		for(page =1; page<=17; page++){
		for(SearchVO svo : slist) {
			try{
				String star ="";
				String count ="";
				String image= " ";
				String discount ="";
				String base ="";
				String state_code="";
				String unitPr=" ";
				String name=" ";
				String url="https://www.costco.co.kr/search/?text="+select_title;
				String res =" ";
				Document doc = Jsoup.connect(url).header("content-type", "application/json;charset=UTF-8")
						.header("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8")
						.header("accept-encoding", "gzip, deflate, br")
						.header("accept-language", "ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7")
						.userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36")
						.ignoreContentType(true)
						.get();
				
				Elements procode =doc.select("ul > li > div.product-image a");
				Elements img =doc.select("ul > li > div.product-image img");
				Elements proName =doc.select("div.product-name-container");
				Elements baseP = doc.select("div.product-price div > span.product-price-amount");
				Elements unitP = doc.select("div.product-price span > div");
				Elements Icement = doc.select("div.bv_inline_rating a.lister-names");
				Elements disC =doc.select("div.product-price div.discount-info");
				
				Element result = doc.selectFirst("div.results.notranslate"); 
				
				/*
				 	String star ="";
					String count ="";
					String discount ="";
					String base ="";
					String state_code="";
					String unitPr=" ";
					String name=" ";
				 */
				for(int i =0; i<procode.size(); i++) {
					res = result.text();
					
					state_code = procode.get(i).attr("href");
					name = proName.get(i).text();
					base = baseP.get(i).text();
					image = img.get(i).attr("src");
					
					// 리뷰와 별점
					try {
						star = Icement.get(i).text();
					}catch(Exception ex) {
						star ="null";
					}
					// 할인
					try {
						discount = disC.get(i).text();
					}catch(Exception ex) {
						discount ="null";
					}
					try {
						unitPr = unitP.get(i).text();
					}catch(Exception ex) {
						unitPr ="null";
					}
					String scode=" ";
					System.out.println(i+1);
					scode =state_code.substring(state_code.lastIndexOf("/")-1);
					state_code=scode.replaceAll("p/", "co_");
					System.out.println("상품 코드 : "+state_code);
					System.out.println("name "+name);
					String temp =base.replace(",", "");
					base = temp.replace("원", "");
					System.out.println("base "+base);
				
					System.out.println("Units :"+unitPr);
					System.out.println("별점 "+star);
					System.out.println("할인 :"+discount);
					
					CroVO vo = new CroVO();
					//검색 연관조건
					vo.setRank(i);
					vo.setCodeNo(svo.getCodeNo());
					vo.setTags(svo.getKeyword());
					
					vo.setProductCode(state_code);
					vo.setName(name);
					vo.setBasePrice(Integer.parseInt(base));
					vo.setDiscount(discount);
					vo.setUnit_price(unitPr);
					vo.setRate(0);
					vo.setReview_count(0);
					
				}
				
				
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}
			e++;
			if(e== 5) {
				break;
			}
		}
			return list;
	}
	
	public static void main(String[] args) {
		
		CroCrawling cl = new CroCrawling();
		cl.sListData();
	}
}
