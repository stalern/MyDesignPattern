package com.stalern.designpattern.abstractfactory.factory;

import com.stalern.designpattern.abstractfactory.product.ForwardImageReader;
import com.stalern.designpattern.abstractfactory.product.JpgForwardImageReader;
import com.stalern.designpattern.abstractfactory.product.JpgReverseImageReader;
import com.stalern.designpattern.abstractfactory.product.ReverseImageReader;

/**
 * 属于另一个产品族
 * @author stalern
 * @date 2019/10/9--21:19
 */
public class JpgReaderFactory implements ImageReaderFactory{
    @Override
    public ForwardImageReader getForwardImageReader() {
        return new JpgForwardImageReader();
    }

    @Override
    public ReverseImageReader getReverseImageReader() {
        return new JpgReverseImageReader();
    }
}
