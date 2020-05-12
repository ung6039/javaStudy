package com.spring.one_one;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.omg.CORBA.portable.InputStream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.net.HttpURLConnection;
import java.util.*;


public class One_oneManager {

	public List<one_oneVO> ListData(){
		List<one_oneVO> list = new ArrayList<one_oneVO>();
		String url="http://www.11st.co.kr/category/DisplayCategory.tmall?method=getDisplayCategory2Depth&dispCtgrNo=1002080";
		int page=1;
//		for(page =1; page<=17; page++){
		String code1 = "햇반";
			try{
				System.out.println("!!");
				String url1="http://search.11st.co.kr/Search.tmall?kwd=%25ED%2596%2587%25EB%25B0%2598";
				
				String url2="http://www.11st.co.kr/category/DisplayCategory.tmall?method=getDisplayCategory2Depth&dispCtgrNo=1002080";
				
				Document doc = Jsoup.connect(url1).get();
				System.out.println(doc);
				String temp = doc.select("a").get(1).text();
				System.out.println(temp);
			
			}catch(Exception ex){
				ex.printStackTrace();
			}
			return list;
	}
}
