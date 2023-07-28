package com.lizza.service;

import com.lizza.dao.callcenter.CallcenterMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-06-02
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CallcenterTest {

    @Resource
    private CallcenterMapper callcenterMapper;

    @Test
    public void test1() {
        System.out.println(callcenterMapper.select(1));
    }
}
