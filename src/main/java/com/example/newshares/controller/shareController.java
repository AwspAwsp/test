package com.example.newshares.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class shareController {
    @RequestMapping("/sharemain")
  public String hello()
    {
      return "sharesmain";
  }
  @RequestMapping("/single")
  public String single(){
      Map<String,String> map=new HashMap<>();
      List<Integer> list= jichuqingkuangService.getJichutongji();
      String highScore = ""+shareService.getMaxMark();
      String lowScore = ""+shareService.getMinMark();
      map.put("id",""+list.get(0));
      map.put("name",""+list.get(1));
        return "single";
  }
  @RequestMapping("/Top5")
  @ResponseBody
  public String Top5(){
      Map<String,String> map=new HashMap<>();
      List<Integer> list= shareService.getJichutongji();
      String highScore = ""+shareService.getMaxMark();
      String lowScore = ""+shareService.getMinMark();
      map.put("id",""+list.get(0));
      map.put("name",""+list.get(1));
        return "Top5";
  }
}
