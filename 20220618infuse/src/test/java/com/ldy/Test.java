package com.ldy;

import com.ldy.service.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Test {
    @org.junit.Test
    public void t1(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) cpx.getBean("service");
        service.run();
    }
}
