package com.stalern.designpattern.bridge.abstraction;

/**
 * @author stalern
 * @date 2019/12/03~17:35
 */
public class Linux extends AbstractOperatingSystem {
    @Override
    public void play(String name) {
        String osType = "Linux";
        this.imageType.decode(osType, name);
    }
}
