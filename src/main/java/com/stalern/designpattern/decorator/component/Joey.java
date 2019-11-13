package com.stalern.designpattern.decorator.component;

/**
 * @author stalern
 * @date 2019/11/13~11:17
 */
public class Joey implements Friends {

    @Override
    public void  doSomething() {
        System.out.print("Joey");
    }
}
