package com.stalern.factory;

/**
 * 图片阅读工厂接口
 * @author stalern
 * @date 2019年9月26日11:06:56
 */
public interface ImageReaderFactory {
    /**
     * 获取产品接口
     * @return imageReader
     */
    ImageReader getImageReader();

}
