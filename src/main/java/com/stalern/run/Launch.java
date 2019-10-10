package com.stalern.run;

import com.stalern.designpattern.abstractfactory.AbstractFactoryClient;
import com.stalern.designpattern.factorymethod.FactoryMethodClient;
import com.stalern.designpattern.simplefactory.SimpleFactoryClient;

/**
 * 启动类
 * @author stalern
 * @date 2019/9/26--14:24
 */
public class Launch {
    public static void main(String[] args) {
        FactoryMethodClient.runFactory();
        SimpleFactoryClient.runFactory();
        AbstractFactoryClient.runFactory();
    }
}
