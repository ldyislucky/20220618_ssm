package com.ldy.dao.imp;

import com.ldy.dao.UserDao;

/**
 * @author : ldy
 * @version : 1.0
 */
public class UserDaoImp implements UserDao {
    private String str;
    private int i;

    public void setStr(String str) {
        this.str = str;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void m1() {
        System.out.println("这是UserDaoImp");
        System.out.println(str);
        System.out.println(i);
    }
}
