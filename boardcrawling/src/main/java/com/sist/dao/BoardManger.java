package com.sist.dao;

import java.text.SimpleDateFormat;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
@Component
public class BoardManger {

	public String temp(){
		return "임시 확인";
	}
	@Autowired
	private BoardDAO dao;
	
	public List<BoardVO> BoardCrawling(){
		
		List<BoardVO> list = new ArrayList<BoardVO>();
		SimpleDateFormat sm = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS");
		int i=1;
		int tempcount =1;
		String content_s=" ";
		try {
			for(i =0; i<100; i++){
			Document doc = Jsoup.connect("https://www.seoulmilk.co.kr/loyal/vip/mission.sm?type=recp&page="+i+"&searchType=&searchKeyword=").get();
			Elements link = doc.select("div.vip_pro_list ul li div a");
			Elements img = doc.select("div.vip_pro_list ul li p img");
			for(int j =0; j<link.size(); j++){
				try{
				Document doc2 = Jsoup.connect("https://www.seoulmilk.co.kr"+link.get(j).attr("href")).get();
				Element title = doc2.selectFirst("div.tbl_view dl dt.tit");
				Element regdate =doc2.select("div.tbl_view dd ul.fl_r li").get(1);
				Element author =doc2.select("div.tbl_view dd ul.fl_l li").get(0);
				Element product =doc2.select("div.tbl_view dd ul.fl_l li").get(1);
				Element count = doc2.selectFirst("div.tbl_view dd ul.fl_r li.last");
				Element content = null;
				int check =1;
				try{
					content =doc2.selectFirst("div.view_area");
					System.out.println(content.attr("src"));
				}catch(Exception ex){
					content = null;
				}
				
				System.out.println(title.text());
				System.out.println(regdate.text());
				System.out.println(author.text());
				String author_s = author.text().substring(3);
				System.out.println(author_s);
				System.out.println(product.text());
				String product_s =product.text().substring(3);
				System.out.println(product_s);
				System.out.println(count.text());
				String count_s = count.text().substring(3);
				System.out.println(img.get(i).attr("src"));
				try{
					System.out.println(content.text());
					content_s =content.text();
				}catch(Exception ex){
					System.out.println("내용이 없습니다.");
					content_s = "내용이 없습니다.";
				}
				System.out.println();
				tempcount++;
				/*
				 // member
					private String id;
					private String pwd;
					private String email;
					private String sex;
					private String tel;
					private String admin;
					
					
					
					
				 */
				BoardVO vo = new BoardVO();
				
				//member 정보
				vo.setId(author_s);
				if(tempcount%2 ==0){
					vo.setSex("남");
				}else{
					vo.setSex("여");
				}
				//board 정보
				/*
					private String title;
					private String author;
					private String link;
					private Date regdate;
					private String content;
					private String img;
				 */
				vo.setTitle(title.text());
				vo.setAuthor(author_s);
				System.out.println(sm.parse(regdate.text()));
				vo.setRegdate(sm.parse(regdate.text()));
				vo.setContent(content_s);
				vo.setImg("https://www.seoulmilk.co.kr"+img.attr("src"));
				vo.setHit(Integer.parseInt(count_s.trim()));
				list.add(vo);
				
				
				}catch(Exception ex){
					System.out.println("안쪽 for문");
					ex.printStackTrace();
					continue;
				}
				
			}
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(tempcount);
		
		
		return list;
	}
	public static void main(String[] args) {
		BoardManger bm = new BoardManger();
		List<BoardVO> list = bm.BoardCrawling();
		ApplicationContext app = new ClassPathXmlApplicationContext("app.xml");
		BoardManger dd =(BoardManger)app.getBean("boardManger");
		System.out.println("insert 시작");
		for(BoardVO vo : list){
			dd.dao.memberInsert(vo);
			dd.dao.BoardInsert(vo);
			System.out.println("insert 중");
		}
		System.out.println("insert 끝");
		
	}
}
