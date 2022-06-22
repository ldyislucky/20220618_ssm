package test1.t1.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import test1.t1.dao.Dao;
import test1.t1.service.Servicebook;

/**
 * @author : ldy
 * @version : 1.0
 */
@Service
public class serviceimp implements Servicebook {
    @Autowired//自动匹配类型 不是用的setter  按照类型自动装配  若是有多个类型需要添加以下注解
    @Qualifier("bookdao1")//指定实例对象
    private Dao bookdao;
    @Override
    public void run(){
        System.out.println("serviceimp");
        bookdao.save();
    }
}
