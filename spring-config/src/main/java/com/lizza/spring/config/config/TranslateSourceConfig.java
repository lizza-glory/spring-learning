package com.lizza.spring.config.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties("translate.source")
public class TranslateSourceConfig {

    private List<Item> item;

    @Data
    public static class Item {

        private Integer code;

        private String desc;

        private List<Integer> relCodes;
    }


}
