package com.example.newshares.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Component
@Mapper
public interface sharemapper {
//获得所有数据
   @Select("SELECT *  FROM news_table")
 public List<Integer> getJichutongji();
   //获得名字和编号
   @Select("SELECT id,name FROM news_table")
  public Integer getMaxMark();
    //获得指数上涨在5%以上
     @Select("SELECT * FROM news_table WHERE upshares>0.05")
  public Integer getMinMark();
}
