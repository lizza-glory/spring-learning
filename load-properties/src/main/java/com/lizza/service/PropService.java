package com.lizza.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-03-14
 */
@Component
public class PropService {

    @Value("${goods.jdbc.url}")
    private String url;

    private String username;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

//    @Value("#{settings['goods.jdbc.username']}")
    public void setUsername(String username) {
        this.username = username;
    }
}
