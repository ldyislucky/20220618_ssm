package com.ldy.dao.imp;

import com.ldy.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author : ldy
 * @version : 1.0
 */
@Repository

 public class BookDaoImp implements BookDao {
  @Override
  public void save() {
    System.out.println(System.currentTimeMillis());
    System.out.println("bookdao save");
  }

  @Override
  public void update() {
    System.out.println("bookdao update");
  }
}
