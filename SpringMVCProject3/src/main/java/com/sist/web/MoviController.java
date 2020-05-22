package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import com.sist.dao.*;
import com.sist.mgr.NewsManager;
import com.sist.mgr.NewsVO;


@Controller
@RequestMapping("movie/")
public class MoviController {
	
	@Autowired
	private MovieDAO dao;
	@Autowired
	private NewsManager mgr;
	
	
	
	@RequestMapping("list.do")
	public String movie_list(Model model,String page){
		if(page== null){
			page="1";
		}
		int curpage = Integer.parseInt(page);
		Map map = new HashMap();
		int rowSize = 12;
		int start = (curpage*rowSize)-(rowSize-1);
		System.out.println();
		int end = curpage*rowSize;
		int totalpage =dao.movieTotalPage(1);
		map.put("start", start);
		map.put("end", end);
		map.put("type", 1);
		//dao에서 데이터를 받기
		List<MovieVO> list = dao.ListAllData(map);
		model.addAttribute("list",list);
		model.addAttribute("curpage",curpage);
		model.addAttribute("totalpage",totalpage);
		model.addAttribute("title", "현재상영영화");
		model.addAttribute("main_jsp","../movie/list.jsp");
		
		return "main/main";
	}
	
	@RequestMapping("shc.do")
	public String movie_shc(Model model,String page){
		if(page== null){
			page="1";
		}
		int curpage = Integer.parseInt(page);
		Map map = new HashMap();
		int rowSize = 12;
		int start = (curpage*rowSize)-(rowSize-1);
		System.out.println();
		int end = curpage*rowSize;
		int totalpage =dao.movieTotalPage(2);
		map.put("start", start);
		map.put("end", end);
		map.put("type", 2);
		//dao에서 데이터를 받기
		List<MovieVO> list = dao.ListAllData(map);
		model.addAttribute("list",list);
		model.addAttribute("curpage",curpage);
		model.addAttribute("totalpage",totalpage);
		model.addAttribute("title", "개봉예정영화");
		model.addAttribute("main_jsp","../movie/list.jsp");
		
		return "main/main";
	}
	
	@RequestMapping("box.do")
	public String movie_box(Model model,String page){
		if(page== null){
			page="1";
		}
		int curpage = Integer.parseInt(page);
		Map map = new HashMap();
		int rowSize = 12;
		int start = (curpage*rowSize)-(rowSize-1);
		System.out.println();
		int end = curpage*rowSize;
		int totalpage = dao.movieTotalPage(5);
		map.put("start", start);
		map.put("end", end);
		map.put("type", 5);
		
		//dao에서 데이터를 받기
		List<MovieVO> list = dao.ListAllData(map);
		
		model.addAttribute("list",list);
		model.addAttribute("curpage",curpage);
		model.addAttribute("totalpage",totalpage);
		model.addAttribute("title", "박스오피스");
		model.addAttribute("main_jsp","../movie/list.jsp");
		
		return "main/main";
	}
	
	@RequestMapping("news.do")
	public String movie_news(Model model){
		
		List<NewsVO> list = mgr.NewsAllData();
		model.addAttribute("list",list);
		model.addAttribute("main_jsp","../movie/news.jsp");
		
		return "main/main";
	}
	@RequestMapping("detail.do")
	public String movie_detail(Model model,int mno){
		MovieVO vo = dao.movieDetailData(mno);
		
		model.addAttribute("vo",vo);
		model.addAttribute("main_jsp","../movie/detail.do");
		
		return "main/main";
	}
	
}