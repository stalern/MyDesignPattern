package com.stalern.designpattern.proxy;

import com.stalern.designpattern.proxy.impl.DraSessionImplProxy;

/**
 * @author stalern
 * @date 2019/11/27~14:36
 */
public class ProxyClient {
    public static void runProxy() {
        DraSession draSession = new DraSessionImplProxy();
        System.out.println(draSession.query());
    }
}
