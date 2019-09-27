package com.stalern.factorymethod.product;

/**
 * @author stalern
 * @date 2019/9/26--11:24
 */
public class GifReader implements ImageReader {

    @Override
    public void imageReader() {
        System.out.println("Gif reader is init");
    }
}
