package com.stalern.run;

import com.stalern.designpattern.abstractfactory.AbstractFactoryClient;
import com.stalern.designpattern.adapter.AdapterClient;
import com.stalern.designpattern.bridge.BridgeClient;
import com.stalern.designpattern.composite.CompositeClient;
import com.stalern.designpattern.decorator.DecoratorClient;
import com.stalern.designpattern.decorator.extend.Client;
import com.stalern.designpattern.factorymethod.FactoryMethodClient;
import com.stalern.designpattern.proxy.ProxyClient;
import com.stalern.designpattern.simplefactory.SimpleFactoryClient;
import com.stalern.designpattern.templatemethod.TemplateClient;


/**
 * 启动类
 * @author stalern
 * @date 2019/9/26--14:24
 */
public class Launch {
    public static void main(String[] args) {
//        FactoryMethodClient.runFactory();
//        SimpleFactoryClient.runFactory();
//        AbstractFactoryClient.runFactory();
//        DecoratorClient.runDecorator();
//        Client.run();
//        ProxyClient.runDynamicProxy();
//        TemplateClient.runTemplate();
//        AdapterClient.runAdapter();
//        BridgeClient.runBridge();
        try {
            CompositeClient.runComposite();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
