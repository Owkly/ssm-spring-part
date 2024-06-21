package com.yannick.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@ComponentScan({"com.yannick.ioc_01"})
@PropertySource(value = "classpath:jdcb.properties")
@Configuration
public class JavaConfiguration {

    @Value("${yannick.driver}")
    private String driver;
    @Value("${yannick.url}")
    private String url;
    @Value("${yannick.username}")
    private String username;
    @Value("${yannick.password}")
    private String password;

    @Bean(name = "weikai")
    public DataSource dataSource1(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "hahah")
    public DataSource dataSource2(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

//    @Bean
//    public JdbcTemplate jdbcTemplate(){
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.setDataSource(dataSource());
//        return jdbcTemplate;
//    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource weikai, DataSource hahah){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(weikai);
        return jdbcTemplate;
    }
}
