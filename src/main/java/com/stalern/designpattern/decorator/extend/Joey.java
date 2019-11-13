package com.stalern.designpattern.decorator.extend;

/**
 * @author stalern
 * @date 2019/11/13~16:14
 */
public class Joey extends Friends {
    @Override
    void doSomething() {
        System.out.print("Joey");
        super.doSomething();
    }
}
