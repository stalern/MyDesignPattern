package com.stalern.designpattern.bridge.abstraction;

import com.stalern.designpattern.bridge.implementor.ImageType;

/**
 * @author stalern
 * @date 2019/12/03~17:17
 */
public abstract class AbstractOperatingSystem {
    protected ImageType imageType = null;

    public void setImageType(ImageType imageType) {
        this.imageType = imageType;
    }
    /**
     * OS 播放图片
     * @param name 图片名称
     */
    public abstract void play(String name);

}
