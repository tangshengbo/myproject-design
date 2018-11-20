package com.tangshengbo.design.proxy.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Tangshengbo on 2018/11/20
 */
@Aspect
public class MyAnnotationAspect {

    @Pointcut("execution(public * com.tangshengbo.design.proxy.aspectj.MyAspectJTest.say*(..))")
    public void logPointCut() {
    }

    @After(value = "logPointCut()")
    public void doAfter(JoinPoint joinPoint) {
        Object target = joinPoint.getTarget();
        Object joinPointThis = joinPoint.getThis();
        System.out.println("sayHello方法执行后记录日志" + target + "\t" + joinPointThis);
    }
}
