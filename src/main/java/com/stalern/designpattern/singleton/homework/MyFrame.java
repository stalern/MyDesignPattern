package com.stalern.designpattern.singleton.homework;

import javax.swing.*;

/**
 * @author stalern
 * @date 2019/12/03~09:54
 */
class MyFrame extends JFrame {

    MyFrame(){
        add(new MyPanel());
        init();
    }

    /**
     * 初始化Frame结构
     */
    private void init(){
        setTitle("Singleton Pattern");
        //把这个窗体移到其他窗口前面
        toFront();
        setLocation(400,200);
        setSize(560,340);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置大小不可拖拽
        setResizable(false);
        setVisible(true);
    }
}
