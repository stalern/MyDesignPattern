package com.stalern.designpattern.bridge.abstraction;

/**
 * @author stalern
 * @date 2019/12/03~17:34
 */
public class Unix extends AbstractOperatingSystem {
    @Override
    public void play(String name) {
        String osType = "Unix";
        this.imageType.decode(osType, name);
    }
}
