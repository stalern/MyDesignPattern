package com.stalern.designpattern.simplefactory.product;

/**
 * @author stalern
 * @date 2019/10/9--19:53
 */
public class JpgReader implements ImageReader {

    @Override
    public void imageReader() {
        System.out.println("FactoryMethod: Jpg reader init");
    }
}
