package com.ldy.dao.imp;

import com.ldy.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author : ldy
 * @version : 1.0
 */
public class BookDaoImp implements BookDao, InitializingBean, DisposableBean {

  @Override
  public void run() {
    System.out.println("bookdao 被创建");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("bookdao 被销毁");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("bookdao 被初始化");
  }
}
