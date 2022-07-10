package ldy.config;

import org.springframework.context.annotation.*;

/**
 * @author : ldy
 * @version : 1.0
 */
@Configuration
@ComponentScan("ldy")
@Import({JdbcConfig.class,MybatiesConfig.class})
@PropertySource("db1.properties")
@EnableAspectJAutoProxy
public class SpringConfig {
}
