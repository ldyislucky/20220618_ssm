import com.ldy.config.SpringConfig;
import com.ldy.lei.User;
import com.ldy.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author : ldy
 * @version : 1.0
 */
public class App {
  AnnotationConfigApplicationContext acac = null;
  ;

  @Test//测试第三方引入文档
  public void t1(){
    acac = new AnnotationConfigApplicationContext(SpringConfig.class);
    DataSource dataSource = acac.getBean(DataSource.class);
    System.out.println(dataSource);
  }
  @Test//测试spring整合mybaties  查询全部
  public void t2(){
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
    UserService userService = annotationConfigApplicationContext.getBean(UserService.class);
    List<User> users = userService.getAll();
    users.forEach(u-> System.out.println(u));
  }
  @Test
  public void t3(){
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
    UserService userService = annotationConfigApplicationContext.getBean(UserService.class);
    List<User> users = userService.getByName("小");
    users.forEach(u-> System.out.println(u));
  }
}
