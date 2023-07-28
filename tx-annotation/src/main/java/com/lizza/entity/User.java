package com.lizza.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-03-31
 */
@Data
@Accessors(chain = true)
public class User {

    private int id;
    private String name;
    private int age;
    private Double money;
}
