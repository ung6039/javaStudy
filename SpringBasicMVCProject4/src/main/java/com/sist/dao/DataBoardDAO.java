package com.sist.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class DataBoardDAO {
	
	@Autowired
	private DataBoardMapper mapper;
	
	public List<DataBoardVO> databoardListData(Map map){
		return mapper.databoardListData(map);
	}
	
	public void databoardInsert(DataBoardVO vo){
		mapper.databoardInsert(vo);
	}
	
	public int dataBoardTotalData(){
		return mapper.dataBoardTotalData();
	}
	
	public DataBoardVO databoardDetailData(int no){
		mapper.hitIncrement(no);
		return mapper.databoardDetailData(no);
	}

}
