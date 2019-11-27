package com.stalern.designpattern.proxy.impl;

import com.stalern.designpattern.proxy.DraSession;

/**
 * @author stalern
 * @date 2019/11/27~14:34
 */
public class DraSessionImplProxy implements DraSession {

    private DraSessionImpl draSession;

    /**
     * 当真正使用这个方法的时候才初始化
     * @return 查询的返回值
     */
    @Override
    public String query() {
        System.out.println("我这里可以前置加工");
        if (draSession == null) {
            draSession = new DraSessionImpl();
        }
        return draSession.query();
    }
}
