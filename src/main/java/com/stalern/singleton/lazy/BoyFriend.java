package com.stalern.singleton.lazy;

/**
 * 多线程懒汉式单例模式 方法2——双重锁机制
 * @author stalern
 * @date 2019/10/2--11:28
 */
public class BoyFriend {
    private volatile static BoyFriend boyFriend = null;
    private BoyFriend(){

    }

    public static BoyFriend getBoyFriend() {
        if (boyFriend == null){
            synchronized (BoyFriend.class){
                if (boyFriend == null){
                    // 需要经过三步
                    // 1. 堆先分配内存给这个对象
                    // 2. 初始化这个对象
                    // 3. boyFriend 指向 堆中分配的对象
                    // 但是 2,3 可能重排序
                    // 重排序之后，线程1还没有初始化对象，线程2就会在return boyFriend中拿到这个对象，此时程序会报错，
                    // 所以需要加上volatile来给boyFriend上锁, 即让线程2看不到线程1的重排序
                    // 还有一种方法是通过内部类初始化锁
                    boyFriend = new BoyFriend();
                }
            }
        }
        return boyFriend;
    }
}
