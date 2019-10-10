package com.stalern.designpattern.abstractfactory.product;

/**
 * @author stalern
 * @date 2019/10/9--21:23
 */
public class JpgReverseImageReader implements ReverseImageReader{
    @Override
    public void reverseImageReader() {
        System.out.println("AbstractFactory: Jpg reverse init...");
    }
}
