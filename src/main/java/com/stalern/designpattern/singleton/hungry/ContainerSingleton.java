package com.stalern.designpattern.singleton.hungry;

import com.stalern.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例模式
 * @author stalern
 * @date 2019/10/5--19:32
 */
public class ContainerSingleton {
    /**
     *  hashMap非线程安全,可以使用HashTable线程安全
      */
    private static Map<String, Object> map = new HashMap<>();
    private ContainerSingleton() {}
    public static void putInstance(String key, Object value) {
        if (!StringUtils.isBlank(key) && value != null){
            if (!map.containsKey(key)){
                map.put(key, value);
            }
        }
    }

    public static Object getInstance(String key){
        return map.get(key);
    }
}
