package com.stalern.designpattern.abstractfactory.homework.factory;

import com.stalern.designpattern.abstractfactory.homework.product.*;

/**
 * @author stalern
 * @date 2019/12/03~09:22
 */
public class SummerSkinFactory implements SkinFactory{
    @Override
    public AbstractButton createButton() {
        return new BlueButton();
    }

    @Override
    public AbstractComboBox createComboBox() {
        return new BlueComboBox();
    }

    @Override
    public AbstractTextBox createTextBox() {
        return new BlueTextBox();
    }
}
