package com.stalern.designpattern.bridge.implementor;

/**
 * @author stalern
 * @date 2019/12/03~17:19
 */
public interface ImageType {

    /**
     * 显示某os的图片解码
     * @param name 图片名称
     * @param osType OS类型
     */
    void decode(String osType, String name);
}
