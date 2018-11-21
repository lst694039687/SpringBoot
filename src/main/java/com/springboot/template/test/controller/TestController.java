package com.springboot.template.test.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.template.test.pojo.Test;
import com.springboot.template.test.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("test")
    public PageInfo<Test> test(){
        return testService.getList();
    }
}
