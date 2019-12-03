package com.stalern.designpattern.adapter.adaptee;

/**
 * RealPlayer媒体播放器作为一个Adaptee
 * @author stalern
 * @date 2019/12/03~14:50
 */
public class RealPlayer implements Adaptee{
    private void realPlayerOpen() {
        System.out.println("打开了RealPlayer媒体播放器");
    }

    @Override
    public void action() {
        realPlayerOpen();
    }
}
