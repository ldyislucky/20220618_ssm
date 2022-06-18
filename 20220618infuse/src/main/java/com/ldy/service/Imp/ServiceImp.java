package com.ldy.service.Imp;

import com.ldy.dao.BookDao;
import com.ldy.dao.UserDao;
import com.ldy.service.Service;

/**
 * @author : ldy
 * @version : 1.0
 */
public class ServiceImp implements Service {
    private UserDao userDao;
    private BookDao bookDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void run() {
        System.out.println("这是serviceImp");
        userDao.m1();
        bookDao.m1();
    }
}
