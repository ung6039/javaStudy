package com.spring.web;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sist.dao.*;

// {} => ROW
// [{}]
@Controller
public class MainController {
	
	@RequestMapping("main/list.do")
	public String main_list(){
		
		return "main/list";
	}
	@RequestMapping("main/detail.do")
	public String main_detail(){
		
		return "main/detail";
	}
	
}
