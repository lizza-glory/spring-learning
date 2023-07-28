package com.lizza.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * spring 依赖注入：集合注入
 */
@Data
public class Teacher {

    private List<String> students;
    private Map<String, Object> info;
}
