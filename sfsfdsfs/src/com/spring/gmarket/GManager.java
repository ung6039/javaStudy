package com.spring.gmarket;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.*;

public class GManager{

	public List<GVO> sListData(){
			List<GVO> list = new ArrayList<GVO>();
			String url ="https://browse.gmarket.co.kr/search?keyword=%ec%98%a4%eb%9a%9c%ea%b8%b0+%ec%a7%84%eb%9d%bc%eb%a9%b4+%eb%a7%a4%ec%9a%b4%eb%a7%9b&f=c:100000036";
			int page=1;
			try{
				Document doc = Jsoup.connect(url).get();
				System.out.println(doc);
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
	
			return list;
	}
	public static void main(String[] args) {
		GManager gm = new GManager();
		gm.sListData();
	}
}
