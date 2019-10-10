package com.stalern.designpattern.abstractfactory.product;

/**
 * @author stalern
 * @date 2019/10/9--21:23
 */
public class GifForwardImageReader implements ForwardImageReader {

    @Override
    public void forwardImageReader() {
        System.out.println("AbstractFactory: Gif forward init...");
    }
}
