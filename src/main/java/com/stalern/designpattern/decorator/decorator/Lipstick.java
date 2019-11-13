package com.stalern.designpattern.decorator.decorator;

import com.stalern.designpattern.decorator.component.Friends;

/**
 * @author stalern
 * @date 2019/11/13~11:30
 */
public class Lipstick extends MakeUp {

    public Lipstick(Friends friends) {
        super(friends);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        System.out.print("涂了口红");
    }
}
