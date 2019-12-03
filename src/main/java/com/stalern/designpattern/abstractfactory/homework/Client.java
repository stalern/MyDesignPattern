package com.stalern.designpattern.abstractfactory.homework;

import com.stalern.designpattern.abstractfactory.homework.factory.SkinFactory;
import com.stalern.designpattern.abstractfactory.homework.factory.SpringSkinFactory;

/**
 * @author stalern
 * @date 2019/12/03~09:29
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory skin = new SpringSkinFactory();
        skin.createButton().printButton();
    }
}
