package com.stalern.designpattern.bridge.abstraction;

/**
 * @author stalern
 * @date 2019/12/03~17:23
 */
public class Windows extends AbstractOperatingSystem{

    @Override
    public void play(String name) {
        String osType = "Windows";
        this.imageType.decode(osType, name);
    }
}
