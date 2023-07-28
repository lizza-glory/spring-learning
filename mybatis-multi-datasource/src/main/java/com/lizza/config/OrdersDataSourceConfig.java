package com.lizza.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * 1. Spring 引入配置文件: https://blog.csdn.net/wb785074651/article/details/105446933
 *
 */
//@Configuration
//@MapperScan(basePackageClasses = OrdersMapper.class,
//            sqlSessionTemplateRef  = "ordersSqlSessionTemplate")
public class OrdersDataSourceConfig {

    @Value("${orders.jdbc.url}")
    private String url;

    @Value("${orders.jdbc.username}")
    private String username;

    @Value("${orders.jdbc.password}")
    private String password;

    @Bean
    public DataSource ordersDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public SqlSessionFactory ordersSqlSessionFactory(DataSource ordersDataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(ordersDataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/OrdersMapper.xml"));
        return bean.getObject();
    }

    @Bean
    public DataSourceTransactionManager ordersTransactionManager(DataSource ordersDataSource) {
        return new DataSourceTransactionManager(ordersDataSource);
    }

    @Bean
    public SqlSessionTemplate ordersSqlSessionTemplate(SqlSessionFactory ordersSqlSessionFactory) {
        return new SqlSessionTemplate(ordersSqlSessionFactory);
    }
}
