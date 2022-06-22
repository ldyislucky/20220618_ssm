package test1.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import test1.t1.dao.imp.BookDao1;

import javax.sql.DataSource;

/**
 * @author : ldy
 * @version : 1.0
 */
public class jdbcconfig {
  @Bean//也可以加括号命名
  public DataSource dataSource(BookDao1 bookDao1){//会自动引入在本工程中配置好的bean
    DruidDataSource ds = new DruidDataSource();
    bookDao1.save();
    return ds;
  }
}
