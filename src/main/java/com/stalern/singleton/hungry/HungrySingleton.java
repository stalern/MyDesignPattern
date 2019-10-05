package com.stalern.singleton.hungry;

import java.io.Serializable;

/**
 * 饿汉式单例模式
 * @author stalern
 * @date 2019/10/2--12:15
 */
public class HungrySingleton implements Serializable {
    /**
     * 饿汉式是在类加载时期完成的
     */
    private static HungrySingleton hungry = new HungrySingleton();

//    static {
//        hungry = new HungrySingleton();
//    }

    private HungrySingleton(){
        // 防止反射攻击代码
        if (hungry != null){
            throw new RuntimeException("该类已经有实例");
        }
    }
    public static HungrySingleton getHungry(){
        return hungry;
    }

    /**
     * 防止序列化反射生成的实例不一样
     * @return object
     */
    private Object readResolve(){
        return hungry;
    }
}
