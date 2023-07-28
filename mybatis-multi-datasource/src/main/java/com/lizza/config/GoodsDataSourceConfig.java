package com.lizza.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * 1. Spring 引入配置文件: https://blog.csdn.net/wb785074651/article/details/105446933
 * 3. 多数据源配置: https://www.2cto.com/kf/201505/400273.html
 */
//@Configuration
//@PropertySource("classpath:jdbc.properties")
//@MapperScan(basePackageClasses = GoodsDao.class)
public class GoodsDataSourceConfig {

    @Value("${goods.jdbc.url}")
    private String url;

    @Value("${goods.jdbc.username}")
    private String username;

    @Value("${goods.jdbc.password}")
    private String password;

    @Bean
    public DataSource goodsDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    @Primary
    public SqlSessionFactory goodsSqlSessionFactory(DataSource goodsDataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(goodsDataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/GoodsMapper.xml"));
        return bean.getObject();
    }

    @Bean
    @Primary
    public DataSourceTransactionManager goodsTransactionManager(DataSource goodsDataSource) {
        return new DataSourceTransactionManager(goodsDataSource);
    }

    @Bean
    @Primary
    public SqlSessionTemplate goodsSqlSessionTemplate(SqlSessionFactory goodsSqlSessionFactory) {
        return new SqlSessionTemplate(goodsSqlSessionFactory);
    }

    @Bean
    @Primary
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.lizza.dao.goods");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("goodsSqlSessionFactory");
        return mapperScannerConfigurer;
    }
}
