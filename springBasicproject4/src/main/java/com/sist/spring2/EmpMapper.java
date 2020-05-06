package com.sist.spring2;

import org.apache.ibatis.annotations.Select;
import java.util.*;
public interface EmpMapper {
	
	@Select("SELECT * FROM emp")
	public List<EmpVO> empAllData();
	/* <select id="empAllData" resulstType="EmpVO">
		SELECT * FROM emp
	</select>
	*/
	
}
