package com.stalern.designpattern.decorator.extend;

/**
 * @author stalern
 * @date 2019/11/13~16:18
 */
public class Rachel extends Friends {

    @Override
    void doSomething() {
        System.out.print("Rachel");
        super.doSomething();
    }
}
