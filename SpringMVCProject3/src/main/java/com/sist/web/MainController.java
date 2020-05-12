package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main/")
public class MainController {
	// [{키:값,키:값 },{},{}..]

	//http://www.kobis.or.kr/kobis/business/main/main.do
	@RequestMapping("main.do")
	public String main_main(Model model){
		
		model.addAttribute("main_jsp", "../movie/movie.jsp");
		
		return "main/main";
	}
	
}
