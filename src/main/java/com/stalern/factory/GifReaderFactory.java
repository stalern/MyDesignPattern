package com.stalern.factory;

/**
 * 具体工厂类代码
 * @author stalern
 * @date 2019年9月26日11:09:12
 */
public class GifReaderFactory implements ImageReaderFactory{

    @Override
    public ImageReader getImageReader() {
        return new GifReader();
    }
}
