package com.spring.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.dao.*;
import java.util.*;

@Controller
public class MovieController {

	@Autowired
	private MovieDAO dao;
	
	@RequestMapping("movie/list.do")
	public String movie_list(Model model,String page){
		
		if(page== null){
			page="1";
		}
		int curpage =Integer.parseInt(page);
		List<MovieVO> list = dao.movieListData(curpage);
		model.addAttribute("list", list);
		
		return "movie/list";
	}
	
	
	
}
