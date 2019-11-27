package com.stalern.designpattern.proxy;

import com.stalern.designpattern.proxy.dynamic.DraSessionHandler;
import com.stalern.designpattern.proxy.impl.DraSessionImplProxy;

import java.lang.reflect.Proxy;

/**
 * @author stalern
 * @date 2019/11/27~14:36
 */
public class ProxyClient {
    public static void runProxy() {
        DraSession draSession = new DraSessionImplProxy();
        System.out.println(draSession.query());
    }
    public static void runDynamicProxy() {
        DraSession draSession = (DraSession) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(), new Class[]{DraSession.class}, new DraSessionHandler());
        System.out.println(draSession.query());
    }
}
