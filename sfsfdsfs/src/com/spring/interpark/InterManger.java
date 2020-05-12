package com.spring.interpark;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.*;


public class InterManger {

	public List<InterVO> ListData(){
		List<InterVO> list = new ArrayList<InterVO>();
		String url="http://shopping.interpark.com/display/main.do?dispNo=001760&smid1=gnb&smid2=003&smid3=1";
		
		try{
			Document doc = Jsoup.connect(url).get();
			System.out.println(doc);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
		return list;
	}
	public static void main(String[] args) {
		InterManger im = new InterManger();
		im.ListData();
	}
}
