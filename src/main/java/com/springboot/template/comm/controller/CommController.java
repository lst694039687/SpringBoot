package com.springboot.template.comm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommController {

    @RequestMapping("")
    public String index(){
        System.err.println("访问到了");
        return "index.html";
    }
}
