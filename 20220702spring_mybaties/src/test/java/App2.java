import com.ldy.lei.User;
import com.ldy.service.UserService;
import org.junit.Test;

import java.util.List;

/**
 * @author : ldy
 * @version : 1.0
 * 错误示范
 */

public class App2 {
  private UserService userService;
  @Test
  public void t1(){
    List<User> users = userService.getByName("小");
    users.forEach(u-> System.out.println(u));
  }
}
