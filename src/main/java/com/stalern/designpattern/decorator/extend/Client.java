package com.stalern.designpattern.decorator.extend;

/**
 * @author stalern
 * @date 2019/11/13~16:19
 */
public class Client {
    public static void run() {
        Friends rachel = new Rachel();
        rachel.setEyeShadow(true);
        rachel.setLipstick(true);
        rachel.doSomething();
    }
}
