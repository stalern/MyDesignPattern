package com.stalern.factory;

/**
 * jpg具体工厂实现类代码
 * @author stalern
 * @date 2019/9/26-11-18
 */
public class JpgReaderFactory implements ImageReaderFactory{

    @Override
    public ImageReader getImageReader() {
        return new JpgReader();
    }
}
