package com.stalern.designpattern.abstractfactory.homework.factory;

import com.stalern.designpattern.abstractfactory.homework.product.*;

/**
 * @author stalern
 * @date 2019/12/03~09:14
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public AbstractButton createButton() {
        return new GreenButton();
    }

    @Override
    public AbstractComboBox createComboBox() {
        return new GreenComboBox();
    }

    @Override
    public AbstractTextBox createTextBox() {
        return new GreenTextBox();
    }
}
