package com.stalern.designpattern.decorator.decorator;

import com.stalern.designpattern.decorator.component.Friends;

/**
 * @author stalern
 * @date 2019/11/13~11:24
 */
public class MakeUp implements Friends {

    Friends friends;

    MakeUp(Friends friends) {
        this.friends = friends;
    }

    @Override
    public void doSomething() {
        friends.doSomething();
    }
}
