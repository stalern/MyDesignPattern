package com.stalern.designpattern.abstractfactory.homework.factory;

import com.stalern.designpattern.abstractfactory.homework.product.AbstractButton;
import com.stalern.designpattern.abstractfactory.homework.product.AbstractComboBox;
import com.stalern.designpattern.abstractfactory.homework.product.AbstractTextBox;

/**
 * @author stalern
 * @date 2019/12/03~09:06
 */
public interface SkinFactory {

    /**
     * 创建按钮
     * @return abstractButton的子类
     */
    AbstractButton createButton();

    /**
     * 创建组合框
     * @return abstractComboBox的子类
     */
    AbstractComboBox createComboBox();

    /**
     * 创建文本框
     * @return abstractTextBox的子类
     */
    AbstractTextBox createTextBox();
}
