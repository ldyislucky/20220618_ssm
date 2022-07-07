package com.ldy.service.imp;

import com.ldy.dao.UserDao;
import com.ldy.lei.User;
import com.ldy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
        return userDao.getAll();
    }

    @Override
    public List<User> getByName(String username) {
        return userDao.getByName(username);
    }
}
