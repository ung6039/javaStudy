package com.sist.spring;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface DeptMapper {

	@Select("SELECT * FROM DEPT")
	public List<DeptVO> deptAllData();
}
