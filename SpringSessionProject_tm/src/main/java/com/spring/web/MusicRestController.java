package com.spring.web;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.sist.dao.*;

// 문자열을 전송하기 위해서는 RestController
@RestController
public class MusicRestController {
	
	@Autowired
	private MusicDAO dao;
	
	@RequestMapping("main/music.do")
	public String main_list(){
		System.out.println("!!");
		String result=" ";
		List<MusicVO> list = dao.MusicALLData();
		JSONArray arr= new JSONArray();
		
		for(MusicVO vo : list){
			JSONObject obj = new JSONObject();
			obj.put("mno", vo.getMno());
			obj.put("title", vo.getTitle());
			obj.put("singer", vo.getSinger());
			obj.put("album", vo.getAlbum());
			obj.put("state", vo.getState());
			obj.put("idcrement", vo.getIdcrement());
			obj.put("poster", vo.getPoster());
			arr.add(obj);
		}
		
		result= arr.toJSONString();
		System.out.println(result);
		return result;
	}
	
}
