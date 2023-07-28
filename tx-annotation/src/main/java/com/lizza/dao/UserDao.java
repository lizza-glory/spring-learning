package com.lizza.dao;

import com.lizza.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-03-31
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public int insert(User user) {
        return jdbcTemplate.update("insert into user (name, age, money) values (?, ?, ?)", user.getName(), user.getAge(), user.getMoney());
    }

    public int delete(int id) {
        return jdbcTemplate.update("delete from user where id = ?", id);
    }

    public int update(User user) {
        return jdbcTemplate.update("update user set name = ?, age = ?, money = ? where id = ?", user.getName(), user.getAge(), user.getMoney(), user.getId());
    }

    public User select(int id) {
        Object[] args = new Object[1];
        args[0] = id;
        return jdbcTemplate.query("select * from user where id = ?", args, new BeanPropertyRowMapper<>(User.class)).get(0);
    }

    public List<User> list() {
        return jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<>(User.class));
    }
}
