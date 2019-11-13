package com.stalern.designpattern.decorator.decorator;

import com.stalern.designpattern.decorator.component.Friends;

/**
 * @author stalern
 * @date 2019/11/13~11:34
 */
public class Clothes extends MakeUp {

    public Clothes(Friends friends) {
        super(friends);
    }

    @Override
    public void doSomething() {
        friends.doSomething();
        System.out.print("穿了衣服");
    }
}
