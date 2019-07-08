package com.example.newshares.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class shareService {
    @Autowired
    private shareService jichutongjiMapper;
    @Autowired
    private  shareService shitifenxiMapper;
    public List<Integer> getJichutongji(){
             List<Integer> list= jichutongjiMapper.getJichutongji();
                return list;
             }
       public Integer getMaxMark(){
              return jichutongjiMapper.getMaxMark();
           }
   public Integer getMinMark(){
              return jichutongjiMapper.getMinMark();
           }
}
