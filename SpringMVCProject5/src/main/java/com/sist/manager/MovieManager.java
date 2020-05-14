package com.sist.manager;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sist.dao.MovieDAO;
import com.sist.dao.MovieVO;

public class MovieManager {
	
	public List<String> movieLinkData(){
		List<String> list = new ArrayList<String>();
		String url =" ";
		try{
			for(int i =1; i<40; i++){
				url ="https://movie.naver.com/movie/sdb/rank/rmovie.nhn?sel=pnt&date=20200513&page="+i;
				Document doc = Jsoup.connect(url).get();
				Elements link = doc.select("td.title div.tit5 a");
				for(int j =0; j<link.size(); j++){
					String strLink = link.get(j).attr("href");
					list.add("https://movie.naver.com"+strLink);
				}
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		return list;
	}
	public void movieAllData(){
		MovieDAO dao = new MovieDAO();
		try{
			List<String> list =movieLinkData();
			int k =1;
			for(String url : list){
				try{
					Document doc = Jsoup.connect(url).get();
					
					Element title = doc.selectFirst("div.mv_info h3.h_movie a");
					Element poster = doc.selectFirst("div.poster a img");
					Element genre = doc.selectFirst("dl.info_spec span a");
					Elements grade = doc.select("dl.info_spec p");
//					Element grade = doc.select("dl.info_spec d").get(2);
					Element director = doc.selectFirst("div.info_spec2 dl.step1 a");		
					Element actor = doc.selectFirst("div.info_spec2 dl.step2 a");
					Element story = doc.selectFirst("div.story_area p.con_tx");
					MovieVO vo = new MovieVO();
					vo.setMno(Integer.parseInt(url.substring(url.lastIndexOf("=")+1)));
//					String grade_t = grade.text().substring(grade.text().lastIndexOf("[국내]")+1);
//					String actor_t = grade_t.substring(grade_t.lastIndexOf("개봉"));
					String temp = " ";
					System.out.println("1: "+grade.text().indexOf("["));
					System.out.println("2: "+grade.lastIndexOf("["));
					temp = grade.text().substring(grade.text().indexOf("["),grade.lastIndexOf("["));
					System.out.println("mttt : "+temp);
					System.out.println("===== 영화 정보 ======");
					System.out.println("k= "+k);
					System.out.println(title.text());
					System.out.println(poster.attr("src"));
					System.out.println(genre.text());
					System.out.println(grade.text());
					System.out.println(director.text());
					System.out.println(actor.text());
					System.out.println(story.text());
					
					vo.setTitle(title.text());
					vo.setPoster(poster.text());
					vo.setGenre(genre.text());
					vo.setGrade(grade.text());
					vo.setDirector(director.text());
					vo.setActor(actor.text());
					vo.setStory(story.text());
					
					k++;
//					dao.movieInsert(vo);
				}catch(Exception ex){
					System.out.println(ex.getMessage());
					ex.printStackTrace();
				}
			}
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		MovieManager m = new MovieManager();
		m.movieAllData();
		
	}

}
