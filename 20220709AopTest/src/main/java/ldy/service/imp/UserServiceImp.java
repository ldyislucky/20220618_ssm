package ldy.service.imp;


import ldy.dao.UserDao;
import ldy.lei.User;
import ldy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : ldy
 * @version : 1.0
 */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int delete(int id) {
        return userDao.delete(id);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public List<User> getAll() {
        System.out.println("===============getAll");
        return userDao.getAll();
    }

    @Override
    public List<User> getByName(String username) {

        System.out.println("+++++++++++++++++getByName");
        return userDao.getByName(username);
    }
}
