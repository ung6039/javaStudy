package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;
import com.sist.dao.*;



@Controller
public class BoardController {
	@Autowired
	private BoardDAO dao;
	
	@GetMapping("board/list.do")
	public String board_list(Model model,String page){
		
		/*
			String page => 첫 페이지는 null값
			-> null 값처리를 위해서 String으로 값을 받아야함
			
			
			값이 제대로 넘어오는 것은  :: int로 받아서 처리해도 괜찮음
		 */
		// 매개변수 => 사용자의 요청값을 받는다.
		if(page ==null){
			page="1";
		}
		int totalpage= dao.boardTotalPage();
		int curpage = Integer.parseInt(page);
		int rowSize=10;
		int start = (rowSize*curpage) - (rowSize-1);
		int end = rowSize*curpage;
		
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		List<BoardVO> list = dao.boardListData(map);
		// 요청에 대한 처리
		model.addAttribute("list", list);
		model.addAttribute("curpage",curpage);
		model.addAttribute("totalpage", totalpage);
		// 처리된 결과 값 전송
		
		return "board/list";
	}
	
	@GetMapping("board/insert.do")
	public String board_insert(){
		return "board/insert";
	}
	@GetMapping("board/detail.do")
	public String board_detail(Model model,int no){
		
		BoardVO vo = dao.boardDetailData(no);
		model.addAttribute("vo", vo);
		
		return "board/detail";
	}
	
	@PostMapping("board/insert_ok.do")
	public String board_insert_ok(BoardVO vo){
		dao.boardInsert(vo);
		// dao 연결
		return "redirect:../board/list.do";
	}
	
	
	@GetMapping("board/update.do")
	public String board_update(Model model, int no){
		BoardVO vo = dao.boardDetailData(no);
		model.addAttribute("vo", vo);
		
		return "board/update";
	}
	
	@GetMapping("board/delete.do")
	public String board_delete(Model model, int no){
		model.addAttribute("no", no);
		
		return "board/delete";
	}
	
	/*@PostMapping("board/delete_ok.do")
	public String board_delete_ok(int no, String pwd){
		dao.boardDelete(no, pwd);
		return "redirect:../board/list.do";
	}*/
	
}
