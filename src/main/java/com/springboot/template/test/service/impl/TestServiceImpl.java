package com.springboot.template.test.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.template.comm.dao.BaseDao;
import com.springboot.template.test.dao.TestDao;
import com.springboot.template.test.pojo.Test;
import com.springboot.template.test.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "TestService")
public class TestServiceImpl implements TestService {

    @Resource
    private BaseDao baseDao;

    @Resource
    private TestDao testDao;


    public PageInfo<Test> getList(){
        PageHelper.startPage(1,30);
        List<Test> list = baseDao.getList("testMapper.getList", null);
        PageInfo<Test> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
