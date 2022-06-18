package com.ldy.service.Imp;

import com.ldy.dao.UserDao;
import com.ldy.service.UserService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author : ldy
 * @version : 1.0
 */
public class UserServiceImp implements UserService, InitializingBean, DisposableBean {
    //在配置中可以初始化  也可以用接口初始化

    private UserDao userDao;
    public void init(){
        System.out.println("userservice 初始化");
    }
    @Override
    public void run() {
        System.out.println("userserviceImp 开始跑");
        userDao.run();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("setUserDao设置属性");
    }
    public void destory(){
        System.out.println("userservice 被销毁");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("接口销毁");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("接口初始化在属性设置完成之后执行");
    }
}
