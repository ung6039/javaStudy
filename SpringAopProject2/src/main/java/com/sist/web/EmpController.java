package com.sist.web;

import java.util.List;

import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sist.dao.*;

@Controller
public class EmpController {
	
	@Autowired
	private EmpDAO dao;
	
	@GetMapping("emp/list.do")
	public String empList(Model model){
		List<EmpVO> list = dao.empAllData();
		model.addAttribute("list",list);
		return "emp/list"; // */*
	}
	
	@GetMapping("emp/insert.do")
	public String emp_insert(Model model){
		
		List<Integer> mgrs = dao.empGetMgr();
		List<String> jobs = dao.empGetJob();
		
		model.addAttribute("jobs", jobs);
		model.addAttribute("mgrs", mgrs);
		return "emp/insert";
	}
	@PostMapping("emp/insert_ok.do")
	public String emp_insert_ok(EmpVO vo){
		
		dao.InsertEmp(vo);
		return "redirect:list.do";
	}
}
