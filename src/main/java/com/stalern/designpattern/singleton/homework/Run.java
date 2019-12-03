package com.stalern.designpattern.singleton.homework;

import java.awt.*;

/**
 * @author stalern
 * @date 2019/12/03~09:54
 */
public class Run {
    private static MyFrame myFrame;
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
                myFrame = new MyFrame());
    }
}
