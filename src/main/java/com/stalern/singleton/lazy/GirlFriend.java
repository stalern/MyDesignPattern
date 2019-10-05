package com.stalern.singleton.lazy;

/**
 * 线程安全懒汉式单例模式 方法1——一个锁，开销大
 * 延时加载
 * @author stalern
 * @date 2019/10/2--11:03
 */
public class GirlFriend {
    private static GirlFriend girlFriend = null;
    private GirlFriend (){
        if (girlFriend != null) {
            throw new RuntimeException("禁止反射");
        }
    }
    public synchronized static GirlFriend getGirlFriend(){
        if (girlFriend == null){
            girlFriend = new GirlFriend();
        }
        return girlFriend;
    }
}
