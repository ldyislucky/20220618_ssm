package ldy.dao.imp;

import ldy.dao.UserDao;

/**
 * @author : ldy
 * @version : 1.0
 */
public class UserDaoImp implements UserDao {

    private String str;
    private int i;

    public UserDaoImp(String str, int i) {
        this.str = str;
        this.i = i;
    }

    @Override
    public void m1() {
        System.out.println("这是UserDaoImp");
        System.out.println(str);
        System.out.println(i);
    }
}
