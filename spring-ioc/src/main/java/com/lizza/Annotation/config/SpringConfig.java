package com.lizza.Annotation.config;

import com.lizza.Annotation.entity.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1. excludeFilters: 指定扫描时需要排除哪些组件
 * 2. includeFilters: 指定扫描时只需要包含哪些组件; 使用此属性时, 需要将useDefaultFilters设置为false
 * 3. FilterType: 指定过滤的类型
 */
@Configuration
//@ComponentScan(value = "com.lizza", excludeFilters = {
//        @ComponentScan.Filter(
//                type = FilterType.ANNOTATION,
//                classes = {Service.class})
//})
public class SpringConfig {

    @Bean
    public Book book() {
        Book book = new Book();
        book.setName("哈利波特");
        book.setPrice(88.0);
        return book;
    }
}
