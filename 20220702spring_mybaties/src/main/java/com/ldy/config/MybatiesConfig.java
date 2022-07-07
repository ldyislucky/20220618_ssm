package com.ldy.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author : ldy
 * @version : 1.0
 */
public class MybatiesConfig {

  @Bean
  public SqlSessionFactoryBean getSqlSessionFactory(DataSource dataSource){
    SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
    ssfb.setTypeAliasesPackage("com.ldy.lei");//批量命名别名
    ssfb.setDataSource(dataSource);
    return ssfb;
  }
  @Bean
  public MapperScannerConfigurer mapperScannerConfigurer(){
    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
    mapperScannerConfigurer.setBasePackage("com.ldy.dao");
    return mapperScannerConfigurer;
  }
}
