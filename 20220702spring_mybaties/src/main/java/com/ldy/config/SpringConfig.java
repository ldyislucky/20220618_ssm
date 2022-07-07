package com.ldy.config;

import org.springframework.context.annotation.*;

/**
 * @author : ldy
 * @version : 1.0
 */
@Configuration
@ComponentScan("com.ldy")
@Import({JdbcConfig.class,MybatiesConfig.class})
//@PropertySource("db1.properties")

public class SpringConfig {
}
