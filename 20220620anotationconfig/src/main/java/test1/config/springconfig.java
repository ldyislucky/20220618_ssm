package test1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author : ldy
 * @version : 1.0
 */
@Configuration
@ComponentScan("test1")//扫描注解配置的bean
@Import(jdbcconfig.class)//配置从第三方引入的bean
@PropertySource("pro.properties")
public class springconfig {
}
