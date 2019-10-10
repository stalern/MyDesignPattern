package com.stalern.designpattern.factorymethod.product;

/**
 * @author stalern
 * @date 2019/9/26--11:24
 */
public class JpgReader implements ImageReader{

    @Override
    public void imageReader() {
        System.out.println("FactoryMethod: Jpg reader is init");
    }
}
