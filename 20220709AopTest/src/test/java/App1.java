import ldy.config.SpringConfig;
import ldy.dao.UserDao;
import ldy.lei.User;
import ldy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author : ldy
 * @version : 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class App1 {
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;//如果没有@Repository会有红波浪线，但是不影响运行
    @Test
    public void t1(){
        List<User> users = userService.getByName("小");
        users.forEach(u-> System.out.println(u));
    }
    @Test
    public void t2(){
        List<User> users = userService.getAll();
        users.forEach(u-> System.out.println(u));
    }
    @Test
    public void t3(){
        List<User> users = userDao.getAll();
        users.forEach(u-> System.out.println(u));
    }
}
