package com.stalern.designpattern.decorator.decorator;

import com.stalern.designpattern.decorator.component.Friends;

/**
 * @author stalern
 * @date 2019/11/13~11:33
 */
public class EyeShadow extends MakeUp {

    public EyeShadow(Friends friends) {
        super(friends);
    }

    @Override
    public void doSomething() {
        friends.doSomething();
        System.out.print("画了眼影");
    }
}
