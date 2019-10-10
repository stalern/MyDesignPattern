package com.stalern.designpattern.abstractfactory.factory;

import com.stalern.designpattern.abstractfactory.product.ForwardImageReader;
import com.stalern.designpattern.abstractfactory.product.GifForwardImageReader;
import com.stalern.designpattern.abstractfactory.product.GifReverseImageReader;
import com.stalern.designpattern.abstractfactory.product.ReverseImageReader;

/**
 * 属于一个产品族
 * @author stalern
 * @date 2019/10/9--21:19
 */
public class GifReaderFactory implements ImageReaderFactory{
    @Override
    public ForwardImageReader getForwardImageReader() {
        return new GifForwardImageReader();
    }

    @Override
    public ReverseImageReader getReverseImageReader() {
        return new GifReverseImageReader();
    }
}
