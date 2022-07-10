package com.ldy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author : ldy
 * @version : 1.0
 */
@Configuration
//(1).@ComponentScan(param)告诉Spring 哪个packages
// 的用注解标识的类 会被spring自动扫描并且装入bean容器,param即用来指定扫描包的范围。
@ComponentScan("com.ldy")
@EnableAspectJAutoProxy//告诉spring有使用注解开发的bean
public class SpringConfig {
}
