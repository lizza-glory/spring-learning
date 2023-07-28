package com.lizza.spring.config.controller;

import com.lizza.spring.config.config.TitleSourceConfig;
import com.lizza.spring.config.config.TranslateSourceConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
public class BackdoorController {

    @Resource
    private TranslateSourceConfig translateSourceConfig;

    @Resource
    private TitleSourceConfig titleSourceConfig;

    @GetMapping("getConfig")
    public TranslateSourceConfig getConfig() {
        return translateSourceConfig;
    }

    @GetMapping("getTitleConfig")
    public List<TitleSourceConfig.Config> getTitleConfig() {
        return titleSourceConfig.getConfig();
    }
}
