package com.stalern.designpattern.abstractfactory.homework.product;

/**
 * @author stalern
 * @date 2019/12/03~09:17
 */
public class GreenTextBox implements AbstractTextBox {
    @Override
    public void textBox() {
        System.out.println("spring-green-textBox");
    }
}
