package com.stalern.designpattern.decorator.extend;

/**
 * @author stalern
 * @date 2019/11/13~16:05
 */
public class Friends {
    private boolean eyeShadow;
    private boolean clothes;
    private boolean lipstick;

    void doSomething() {
        if (isEyeShadow()) {
            System.out.print("画了眼影");
        }
        if (isClothes()) {
            System.out.print("穿了衣服");
        }
        if (isLipstick()) {
            System.out.print("涂了口红");
        }
    }

    private boolean isEyeShadow() {
        return eyeShadow;
    }

    void setEyeShadow(boolean eyeShadow) {
        this.eyeShadow = eyeShadow;
    }

    private boolean isClothes() {
        return clothes;
    }

    public void setClothes(boolean clothes) {
        this.clothes = clothes;
    }

    private boolean isLipstick() {
        return lipstick;
    }

    void setLipstick(boolean lipstick) {
        this.lipstick = lipstick;
    }
}
