package com.sist.dao;

import org.apache.ibatis.annotations.Select;
import java.util.*;
public interface MovieMapper {
   @Select("SELECT title FROM music_genie")
   public List<String> titleAllData(); 
}
