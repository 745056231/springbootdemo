package com.javasm.springbootdemo.book.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.springbootdemo.book.model.Rose;
import com.javasm.springbootdemo.book.service.IRoseService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("book")
public class BookHandler {
  Log log = LogFactory.getLog(BookHandler.class);
  @Autowired
  IRoseService iRoseService;

    @RequestMapping("test")
    public String test(Model model) {
        //List<User> userList = new ArrayList<User>(){
        //    {add(new User("张三","132244",12));
        //    add(new User("里斯","132244",12));
        //    add(new User("王五","132244",12));
        //    }
        //};
        //model.addAttribute("userList",userList);
        //log.debug("我是debug");
        //log.info("我是info");
        PageHelper.startPage(1,2);
        List<Rose> roseList = iRoseService.selectAllRose();
        model.addAttribute("roseList", roseList);
        PageInfo pageInfo =new PageInfo(roseList);
        model.addAttribute("pageInfo",pageInfo);



        return "list";

    }


}



