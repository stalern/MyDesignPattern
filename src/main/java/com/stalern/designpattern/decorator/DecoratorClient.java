package com.stalern.designpattern.decorator;

import com.stalern.designpattern.decorator.component.Friends;
import com.stalern.designpattern.decorator.component.Rachel;
import com.stalern.designpattern.decorator.decorator.Clothes;
import com.stalern.designpattern.decorator.decorator.EyeShadow;
import com.stalern.designpattern.decorator.decorator.Lipstick;

/**
 * @author stalern
 * @date 2019/11/13~11:51
 */
public class DecoratorClient {

    public static void runDecorator() {
        Friends rachel = new Clothes(new Lipstick(new EyeShadow(new Rachel())));
        rachel.doSomething();
    }
}
