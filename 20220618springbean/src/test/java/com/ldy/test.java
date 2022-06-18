package com.ldy;

import com.ldy.dao.UserDao;
import com.ldy.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : ldy
 * @version : 1.0
 */
public class test {
  @Test
  public void t1(){
    //通过factorybean工厂获取对象  假如配置文件中有配置初始化的bean，则本方法获取时也会初始化，假如未配置，则
    //本程序获取的对象则是为初始化过的对象  因为与userservice相关联  所以userservice也会被
    // 同时初始化与销毁 但是不会执行userservice的方法
   ApplicationContext applicationContext = new
           ClassPathXmlApplicationContext("applicationContext.xml");
    UserDao userdao = (UserDao)applicationContext.getBean("userdao");
    userdao.run();
    ClassPathXmlApplicationContext cac = (ClassPathXmlApplicationContext) applicationContext;
    cac.close();
  }
  @Test
    public void t2(){
    //通过构造方法获取对象
      ApplicationContext applicationContext = new
              ClassPathXmlApplicationContext("applicationContext.xml");
      UserDao userdao = (UserDao)applicationContext.getBean("userdaolife");
      userdao.run();
    ClassPathXmlApplicationContext cac = (ClassPathXmlApplicationContext) applicationContext;
    cac.close();
  }
  @Test
    public void t3(){
      //通过构造方法获取userService对象
      ApplicationContext applicationContext = new
              ClassPathXmlApplicationContext("applicationContext.xml");
      UserService userService = (UserService)applicationContext.getBean("userservice");
      userService.run();
      ClassPathXmlApplicationContext cac = (ClassPathXmlApplicationContext) applicationContext;
      cac.close();
  }
}
