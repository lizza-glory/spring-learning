package com.lizza.service;

import org.springframework.stereotype.Component;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-07-07
 */
@Component("studentService")
public class StudentService extends AbstractUserService {

    @Override
    public String userType() {
        return "Student";
    }
}
