package com.tangshengbo.design.proxy.aspectj;

/**
 * Created by Tangshengbo on 2018/11/20
 */
public aspect MyAspectJ {

    /**
     * 定义切点,权限验证(实际开发中日志和权限一般会放在不同的切面中,这里仅为方便演示)
     */
    pointcut authCheck():execution(* com.tangshengbo.design.proxy.aspectj.MyAspectJTest.sayHello(..));

    /**
     * 定义前置通知!
     */
    before():authCheck(){
        System.out.println("sayHello方法执行前验证权限");
    }

}
