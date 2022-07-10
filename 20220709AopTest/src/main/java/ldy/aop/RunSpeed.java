package ldy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author : ldy
 * @version : 1.0
 */
@Component
@Aspect
public class RunSpeed {
    @Pointcut("execution(* ldy.service.*Service.*(..))")
    private void servicePt(){}
    @Pointcut("execution(* ldy.dao.UserDao.*(..))")
    private void daoPt(){}

    @Around("servicePt()")
    public Object runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        String st1 = signature.getDeclaringTypeName();
        String st2 = signature.getName();
        long start = System.currentTimeMillis();
        System.out.println("开始");
        Object pro = null;
        //for (int i = 0; i < 10000; i++) {
            pro = pjp.proceed();
        //}
        System.out.println("结束");
        long end = System.currentTimeMillis();
        System.out.println(st1+st2+"-->"+(end-start)+"ms");
        return pro;
    }

    @After("daoPt()")
    public void daoAfter(){
        System.out.println("============");
    }

}
