package test1.t1.dao.imp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import test1.t1.dao.Dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author : ldy
 * @version : 1.0
 */
@Repository("bookdao")//数据库的意思若是存在多个dao对象  才需要设置括号中的名称，采用名称匹配
@Scope//控制获取到的bean是单例
public class BookDao implements Dao {
    @Override
    public void save() {
        System.out.println("bookdao");
    }
    @PostConstruct //在构造方法后进行初始化
    public void init(){
        System.out.println("int");
    }
    @PreDestroy//在销毁前运行本方法
    public void destory(){
        System.out.println("destory");
    }
}
