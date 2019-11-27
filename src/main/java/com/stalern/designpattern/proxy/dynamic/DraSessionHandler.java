package com.stalern.designpattern.proxy.dynamic;

import com.stalern.designpattern.proxy.impl.DraSessionImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author stalern
 * @date 2019/11/27~15:07
 */
public class DraSessionHandler implements InvocationHandler {
    private DraSessionImpl draSession = null;

    /**
     * 代理方法
     * @return o 被代理方法增强的返回值
     * @param method 被代理的方法
     * @param objects 被代理的方法的参数
     * @param o 被代理的类
     */
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("我这里可以前置加工");
        if (draSession == null) {
            draSession = new DraSessionImpl();
        }
        return draSession.query();
    }
}
