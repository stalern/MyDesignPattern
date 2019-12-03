package com.stalern.designpattern.bridge.implementor;

/**
 * @author stalern
 * @date 2019/12/03~17:43
 */
public class Bmp implements ImageType {
    @Override
    public void decode(String osType, String name) {
        String imageType = "BMP";
        System.out.println(osType + "以" + imageType + "的方式加载了" + name);
    }
}
