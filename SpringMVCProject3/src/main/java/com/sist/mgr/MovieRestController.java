package com.sist.mgr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieRestController {
	
	@Autowired
	private MovieManager mm;
	
	@RequestMapping("main/def.do")
	public String main_def(String no){
		if(no == null){
			no="1";
		}
		String url="";
		switch(Integer.parseInt(no)){
		//일일 박스오피스
		case 1:
			url="searchMainDailyBoxOffice.do";
			break;
		//실시간 예매율
		case 2:
			url="searchMainRealTicket.do";
			break;
		//좌석점유율순위
		case 3:
			url="searchMainDailySeatTicket.do";
			break;

		case 4:
			url="searchMainOnlineDailyBoxOffice.do";
			break;
		}
		String json = mm.movieGetJson(url);
		
		return json;
	}
}
