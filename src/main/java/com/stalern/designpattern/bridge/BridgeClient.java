package com.stalern.designpattern.bridge;

import com.stalern.designpattern.bridge.abstraction.AbstractOperatingSystem;
import com.stalern.designpattern.bridge.abstraction.Linux;
import com.stalern.designpattern.bridge.implementor.Bmp;
import com.stalern.designpattern.bridge.implementor.ImageType;

/**
 * @author stalern
 * @date 2019/12/03~17:43
 */
public class BridgeClient {
    public static void runBridge() {
        AbstractOperatingSystem os = new Linux();
        ImageType image = new Bmp();
        os.setImageType(image);
        os.play("beautiful image");
    }
}
