package com.lizza.spring.config.config;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TitleSourceConfig {

    @Value("${title.source.config:[{'code':1,'desc':'人工','relCodes':[1,2,3]},{'code':2,'desc':'机器','relCodes':[4,5,6]}]}")
    private String config;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Config {
        private Integer code = 0;
        private String desc = "未知";
        private List<Integer> relCodes = new ArrayList<>();
    }

    public List<Config> getConfig() {
        return JSONObject.parseArray(config, Config.class);
    }

    public static void main(String[] args) {
        System.out.println(new Config());
    }
}
