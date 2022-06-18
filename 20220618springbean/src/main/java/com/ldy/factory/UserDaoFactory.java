package com.ldy.factory;

import com.ldy.dao.UserDao;
import com.ldy.dao.imp.UserDaoImp;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author : ldy
 * @version : 1.0
 */
public class UserDaoFactory implements FactoryBean<UserDao> {

    @Override
    public UserDao getObject() throws Exception {
        return  new UserDaoImp();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
