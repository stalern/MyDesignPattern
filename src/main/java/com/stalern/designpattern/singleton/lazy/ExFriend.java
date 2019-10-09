package com.stalern.designpattern.singleton.lazy;

/**
 * 多线程懒汉式单例模式，
 * @author stalern
 * @date 2019/10/2--12:01
 */
public class ExFriend {

    private ExFriend(){

    }
    /**
     * 利用类加载锁来屏蔽多个线程
     */
    private static class InClass{
        // 这里不会被多次new？
        private static ExFriend exFriend = new ExFriend();
    }
    public static ExFriend getExFriend(){
        return InClass.exFriend;
    }
}
