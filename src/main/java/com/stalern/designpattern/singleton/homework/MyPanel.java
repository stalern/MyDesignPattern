package com.stalern.designpattern.singleton.homework;

import javax.swing.*;
import java.awt.*;

/**
 * @author stalern
 * @date 2019/12/03~09:58
 */
class MyPanel extends JPanel {
    private static SingletonFrame singletonFrame;
    private JButton button;
    private JTextArea textArea;
    MyPanel() {
        button = new JButton("点击创建一个内部窗体");
        button.setBounds(130, 250, 300, 30);
        button.addActionListener(event -> {
            EventQueue.invokeLater(() -> {
                singletonFrame = SingletonFrame.getInstance("子窗体");
                singletonFrame.setLayout(null);
                singletonFrame.setLocation(500,250);
                singletonFrame.setSize(400,200);
                singletonFrame.setVisible(true);
                textArea = new JTextArea("实例hash为：" + singletonFrame.hashCode());
                textArea.setLayout(null);
                textArea.setLocation(20,20);
                textArea.setSize(200, 30);
                singletonFrame.add(textArea);
            });
        });
        init();
    }
    private void init() {
        setLayout(null);
        add(button);
    }
}
