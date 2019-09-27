package com.stalern.factorymethod.factory;

import com.stalern.factorymethod.product.ImageReader;
import com.stalern.factorymethod.product.JpgReader;

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
