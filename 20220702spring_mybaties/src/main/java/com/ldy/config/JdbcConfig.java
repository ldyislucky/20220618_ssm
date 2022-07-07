package com.ldy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author : ldy
 * @version : 1.0
 */

public class JdbcConfig {
    @Value("com.mysql.cj.jdbc.Driver")
    private String diver;
    @Value("jdbc:mysql://localhost:3306/db1?useSSL=false&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true")
    private String url;
    @Value("root")
    private String username;
    @Value("root")
    private String password;


    @Bean
    public DataSource getDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(diver);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

}