package com.lizza.service;

import org.springframework.stereotype.Service;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-07-07
 */
@Service
public class TeacherService extends AbstractUserService {

    @Override
    public String userType() {
        return "Teacher";
    }
}
