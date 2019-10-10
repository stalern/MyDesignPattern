package com.stalern.designpattern.abstractfactory.product;

/**
 * @author stalern
 * @date 2019/10/9--21:23
 */
public class JpgForwardImageReader implements ForwardImageReader {
    @Override
    public void forwardImageReader() {
        System.out.println("AbstractFactory: Jpg forward init...");
    }
}
