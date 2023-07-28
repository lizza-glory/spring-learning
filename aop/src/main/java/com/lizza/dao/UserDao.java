package com.lizza.dao;

import com.lizza.entity.User;
import com.lizza.util.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 *
 */
public class UserDao {

    private QueryRunner queryRunner;

    /** 注入JdbcUtil，获取连接，传入QueryRunner；此连接是与线程绑定的连接
        可以与TransactionManager协作实现事务的管理
     **/
    private JdbcUtil jdbcUtil;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public void setJdbcUtil(JdbcUtil jdbcUtil) {
        this.jdbcUtil = jdbcUtil;
    }

    public int addOne(User user) {
        try {
            return queryRunner.update(jdbcUtil.getConnection(), "insert into user (id, name, age) values (?, ?, ?)", user.getId(), user.getName(), user.getAge());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int deleteOne(int id) {
        try {
            return queryRunner.update(jdbcUtil.getConnection(), "delete from user where id = ?", id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateOne(User user) {
        try {
            return queryRunner.update(jdbcUtil.getConnection(), "update user set name = ?, age = ?, money = ? where id = ?", user.getName(), user.getAge(), user.getMoney(), user.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public User findOne(int id) {
        try {
            return queryRunner.query(jdbcUtil.getConnection(), "select * from user where id = ?", new BeanHandler<>(User.class), id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> findAll() {
        try {
            return queryRunner.query(jdbcUtil.getConnection(), "select * from user", new BeanListHandler<>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
