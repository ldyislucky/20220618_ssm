package test1.t1;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test1.config.springconfig;
import test1.t1.dao.Dao;
import test1.t1.service.Servicebook;

import javax.sql.DataSource;

/**
 * @author : ldy
 * @version : 1.0
 * 根据实验结果来看不能有并列的t1文件夹
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(springconfig.class);
        Servicebook bookdao = applicationContext.getBean(Servicebook.class);
        DataSource druiddataSource = applicationContext.getBean(DataSource.class);
        bookdao.run();
        System.out.println(druiddataSource);
        applicationContext.close();
    }
}
