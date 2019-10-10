package com.stalern.designpattern.factorymethod.product;

/**
 * @author stalern
 * @date 2019/9/26--11:24
 */
public class GifReader implements ImageReader {

    @Override
    public void imageReader() {
        System.out.println("FactoryMethod: Gif reader is init");
    }
}
