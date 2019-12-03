package com.stalern.designpattern.singleton.homework;

import javax.swing.*;

/**
 * 单例模式的窗体
 * @author stalern
 * @date 2019/12/03~10:49
 */
class SingletonFrame extends JFrame {
    private volatile static SingletonFrame frame = null;
    private SingletonFrame(String name) {
        super(name);
    }

    static SingletonFrame getInstance(String name) {
        if (frame == null) {
            synchronized (SingletonFrame.class) {
                if (frame == null) {
                    frame = new SingletonFrame(name);
                }
            }
        }
        return frame;
    }
}
