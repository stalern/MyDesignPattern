package com.stalern.designpattern.decorator.extend;

/**
 * 基于继承的实现，此包的目的是为了和装饰者模式做对比
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
