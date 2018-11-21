package com.springboot.template.test.service;

import com.github.pagehelper.PageInfo;
import com.springboot.template.test.pojo.Test;

import java.util.List;

public interface TestService {

    public PageInfo<Test> getList();
}
