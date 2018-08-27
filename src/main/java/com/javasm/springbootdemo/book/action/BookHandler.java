package com.javasm.springbootdemo.book.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("book")
public class BookHandler {

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "aasjsajfsjf";
    }
}
