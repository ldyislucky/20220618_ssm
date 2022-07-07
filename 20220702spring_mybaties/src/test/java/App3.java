import com.ldy.config.SpringConfig;
import com.ldy.lei.User;
import com.ldy.service.UserService;
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
public class App3 {
    @Autowired
    private UserService userService;
    @Test
    public void t1(){
        List<User> users = userService.getByName("小");
        users.forEach(u-> System.out.println(u));
    }
}
