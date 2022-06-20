package ldy.service.Imp;

import ldy.dao.BookDao;
import ldy.dao.UserDao;
import ldy.service.Service;

/**
 * @author : ldy
 * @version : 1.0
 */
public class ServiceImp implements Service {
    private UserDao userDao;
    private BookDao bookDao;

    public ServiceImp(UserDao userDao, BookDao bookDao) {
        this.userDao = userDao;
        this.bookDao = bookDao;
    }

    @Override
    public void run() {
        System.out.println("这是serviceImp");
        userDao.m1();
        bookDao.m1();
    }
}
