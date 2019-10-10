package com.stalern.designpattern.abstractfactory.factory;

import com.stalern.designpattern.abstractfactory.product.ForwardImageReader;
import com.stalern.designpattern.abstractfactory.product.ReverseImageReader;

/**
 * 会新增一些产品结构用来适应抽象工厂方法
 * 当只有一个产品等级结构时，会退化为工厂方法模式
 * @author stalern
 * @date 2019/10/9--20:26
 */
public interface ImageReaderFactory {
    /**
     * 属于一个产品等级结构
     * 正序读取图片接口
     * @return imageReader
     */
    ForwardImageReader getForwardImageReader();

    /**
     * 属于另一个产品等级结构
     * 逆序读取图片接口
     * @return voiceLis
     */
    ReverseImageReader getReverseImageReader();
}
