package com.stalern.designpattern.proxy.impl;

import com.stalern.designpattern.proxy.DraSession;

/**
 * @author stalern
 * @date 2019/11/27~14:30
 */
public class DraSessionImpl implements DraSession {

    /**
     * 这个构造函数是为了模拟DraSessionImpl初始化所消耗的时间
     */
    public DraSessionImpl() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String query() {
        return "我是返回的结果";
    }
}
