package com.tangshengbo.design.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.io.Serializable;
import java.lang.reflect.Method;

/**
 * Created by TangShengBo on 2017/12/26.
 */
public class CGLibProxy {

    private static final CGLibProxy proxy = new CGLibProxy();

    private CGLibProxy() {

    }

    public static CGLibProxy getInstance() {
        return proxy;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, new DynamicAdvisedInterceptor());
    }

    private void before() {

    }
    private void after() {
        System.out.println("after...................");
    }

    private static class DynamicAdvisedInterceptor implements MethodInterceptor, Serializable {
        @Override
        public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            System.out.println("before...................");
            Object result = methodProxy.invokeSuper(obj, args);
            System.out.println("after...................");
            return result;
        }
    }
}
