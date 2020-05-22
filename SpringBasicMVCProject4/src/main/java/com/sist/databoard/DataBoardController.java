package com.sist.databoard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.util.*;

import javax.servlet.http.HttpServletResponse;

import com.sist.dao.*;

@Controller
@RequestMapping("board/")
public class DataBoardController {

	@Autowired
	private DataBoardDAO dao;
	
	@RequestMapping("list.do")
	public String ListAllData(Model model,String page){
		if(page ==null){
			page="1";
		}
		int totalpage=dao.dataBoardTotalData();
		int curpage = Integer.parseInt(page);
		int rowSize=10;
		int start = (rowSize*curpage) - (rowSize-1);
		int end = rowSize*curpage;
		
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		
		List<DataBoardVO> list =dao.databoardListData(map);
		
		model.addAttribute("list",list);
		model.addAttribute("curpage",curpage);
		model.addAttribute("totalpage",totalpage);
		return "board/list";
	}
	
	@RequestMapping("insert.do")
	public String board_insert(){
		return "board/insert";
	}
	
	@RequestMapping("insert_ok.do")
	public String board_insert_ok(DataBoardVO vo) throws Exception{
		
		// 임시로 받은 파일정보를 => 저장할 폴더로 이동하기 위해서 List를 받음
		List<MultipartFile> list = vo.getFiles();
		String temp1="";
		String temp2="";
		// file이 올라왔다면
		if(list!=null && list.size()>0){
			
			for(MultipartFile mf : list){
				
				//사용자가 보내준 이름을 가져옴
				String fn =mf.getOriginalFilename();
				File file = new File("c:\\upload\\"+fn);
				mf.transferTo(file); // upload
				
				//1.jpg 2.jpg
				temp1+=fn+",";
				temp2+=file.length()+",";
			}
			/*
			 	마지막 ,를 지워야함
			 */
			temp1=temp1.substring(0,temp1.lastIndexOf(","));
			temp2=temp2.substring(0,temp2.lastIndexOf(","));
			
			
			vo.setFilecount(list.size());
			vo.setFilename(temp1);
			vo.setFilesize(temp2);
		}
		//사용자가 파일을 올리지 않았을 때
		else{
			vo.setFilecount(0);
			vo.setFilename("");
			vo.setFilesize("");
		}
		dao.databoardInsert(vo);
		return "redirect:list.do";
	}
	
	@RequestMapping("detail.do")
	public String board_detail(Model model,int no){
		
		DataBoardVO vo = dao.databoardDetailData(no);
		// count>0 조건을 주지 않으면 null이 들어옴 그러면 error
		System.out.println("detail: "+vo.getFilename());
		if(vo.getFilecount()>0){
			StringTokenizer st = new StringTokenizer(vo.getFilename(),",");
			List<String> fList = new ArrayList<String>();
			while(st.hasMoreTokens()){
				fList.add(st.nextToken());
			}
			StringTokenizer st1 = new StringTokenizer(vo.getFilesize(),",");
			List<String> sList = new ArrayList<String>();
			while(st.hasMoreTokens()){
				fList.add(st.nextToken());
			}
			model.addAttribute("sList",sList);
			model.addAttribute("fList",fList);
			/*
			 	출력할 때 size와 이름을 같이 보여주어야할 때 따로 출력
			 */
		}
		
		model.addAttribute("vo",vo);
		return "board/detail";
	}
	
	@RequestMapping("download.do")
	public void databoard_download(String fn,HttpServletResponse response){
		try{
			
			File file = new File("c:\\upload\\"+fn);
			// 다운로드하기 전에 먼저보내주는 파일 :: Header
			response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode(fn,"UTF-8"));
			response.setContentLength((int)file.length());
			
			// 파일 복사 -> 파일을 복사해주지 않으면 빈공백으로 파일이 넘어감 
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			//서버 => c:\\upload\\a.jpg
			BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
			// 클라이언트 영역
			
			int i =0;
			// 읽은 바이트의 수
			byte[] buffer = new byte[1024];
			while((i=bis.read(buffer, 0, 1024))!= -1) // -1  EOF
			{
				bos.write(buffer,0,i);
			}
			bis.close();
			bos.close();
		
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
}
