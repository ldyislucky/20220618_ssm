package test1.t1.dao.imp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import test1.t1.dao.Dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author : ldy
 * @version : 1.0
 */
@Repository("bookdao1")//数据库的意思,
@Scope//控制获取到的bean是单例
public class BookDao1 implements Dao {
    @Value("${name}")
    private String name;
    @Override
    public void save() {
        System.out.println("bookdao1"+name);
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
