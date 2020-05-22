package com.sist.mgr;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;
import java.util.*;
import java.io.*;
import java.net.*;

@Component
public class MovieManager {

	public String movieGetJson(String url){
		
		String json="";
		try{
			URL strUrl= new URL("http://www.kobis.or.kr/kobis/business/main/"+url);
			HttpURLConnection conn =(HttpURLConnection)strUrl.openConnection();
			StringBuffer sb = new StringBuffer();
			if(conn!=null){
				BufferedReader br = new BufferedReader(
						new InputStreamReader(conn.getInputStream(),"UTF-8"));
				while(true){
					String temp =br.readLine();
					if(temp==null){
						break;
					}
					sb.append(temp);
				}
			}
			json=sb.toString();
			/*
			Document doc = Jsoup.connect("http://www.kobis.or.kr/kobis/business/main/"+url).get();
			json=doc.toString();
			*/
			System.out.println(json);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		return json;
	}
	
}
