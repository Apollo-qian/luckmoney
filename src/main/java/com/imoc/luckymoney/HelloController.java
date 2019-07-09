package com.imoc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @Autowired
  private LimitConfig limitConfig;

    @PostMapping("/say")
//    @PostMapping("/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
//        return "说明："+limitConfig.getDescription();
//			用于测试sourceTree软件提交
//			用来测试提交  git命令行测试
      return "id:"+id;
    }


}
