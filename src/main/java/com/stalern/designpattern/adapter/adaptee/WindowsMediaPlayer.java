package com.stalern.designpattern.adapter.adaptee;

/**
 * WindowsMediaPlayer作为另外一个Adaptee
 * @author stalern
 * @date 2019/12/03~15:03
 */
public class WindowsMediaPlayer implements Adaptee{
    /**
     * 打开windowsMediaPlayer
     */
    void windowsMediaPlayerOpen(){
        System.out.println("打开了WindowsMediaPlayer媒体播放器");
    }

    @Override
    public void action() {
        windowsMediaPlayerOpen();
    }
}
