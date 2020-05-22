package com.sist.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.taglibs.standard.tag.common.fmt.RequestEncodingSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {
	
	@RequestMapping("main/list.do")
	public String main_list(HttpServletRequest request){
		
		
		request.setAttribute("msg", "hello Spring !! ");
		return "list";
		// jsp 확장자 제외 입력
	}
	/*
	 	스프링 답게 사용하는 것
	 	public class Model
	 	{
	 		public void addAttribute(String key,Object obj){
	 			request.setAttribute(key,obj);
	 		}
	 	}
	 */
	
	@RequestMapping("main/list2.do")
	public String main_list2(Model model){
		
		// 모델은 JSP에 추가된 데이터만 전송, 값을 받을 수 없음
		model.addAttribute("msg", "hello spring~~~");
		model.addAttribute("msg1", "hello spring~~~");
		model.addAttribute("msg2", "hello spring~~~");
		
		
		return "list2";
	}
	
	@GetMapping("main/input.do")
	public String main_input(){
		return "input";
	}
	
	@PostMapping("main/output.do")
	public String main_output(HttpServletRequest request){
		
		try{
			request.setCharacterEncoding("UTF-8");
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		//String addr = request.getParameter("addr");
		String tel = request.getParameter("tel");
		String content = request.getParameter("content");
		
		MemberVO vo = new MemberVO();
		vo.setName(name);
		vo.setSex(sex);
		//vo.setAddr(addr);
		vo.setTel(tel);
		vo.setContent(content);
		
		request.setAttribute("vo", vo);
		return "output";
	}
	/*
	 	 list.do?page=2
	 	 board_list(Model model, int page)
	 	 
	 	 find.do?title=영화
	 	 movie_find(Model model, @RequestParam("title") String title)
	 */
	
	@PostMapping("main/output2.do")
	public String main_output2(Model model,@ModelAttribute("vo")MemberVO vo){
		/*
		 	!! 주의
		 	tag의 name 값과 ::
		 	DB의 컬럼 값이 동일해야 값을 채워줌
		 */
		model.addAttribute("vo",vo);
		return "output";
	}
	
	
	
	
}
