package com.ldy.dao.imp;

import com.ldy.dao.UserDao;

/**
 * @author : ldy
 * @version : 1.0
 */
public class UserDaoImp implements UserDao {
  public void init(){
    System.out.println("userdaoimp 初始化");
  }
  @Override
  public void run(){
    System.out.println("userdaoimp 开始跑");
  }
  public void destory(){
    System.out.println("userdaoimp 被销毁");
  }
}
