package com.ldy.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author : ldy
 * @version : 1.0
 */
@Component//将本类设置为受spring控制的bean
@Aspect//告诉spring将本类当成是aop处理
public class MyAdvice {
  @Pointcut("execution(void com.ldy.dao.BookDao.update())")//设置切入点
  private void pt(){}
  @Before("pt()")//在本类的pt()方法之前插入本方法
  public void methed(){
    System.out.println(System.currentTimeMillis());
  }
}
