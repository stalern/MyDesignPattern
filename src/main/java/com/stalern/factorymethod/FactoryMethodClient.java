package com.stalern.factorymethod;

import com.stalern.factorymethod.factory.ImageReaderFactory;
import com.stalern.util.ReadXml;

/**
 * 工厂方法模式
 * 客户的访问，通过访问工厂接口来获取产品实例
 * @author stalern
 * @date 2019/9/26--11:29
 */
public class FactoryMethodClient {

    private final static String FACTORY_METHOD = "factoryMethod";
    public static void runFactory() {

        String packageName = ImageReaderFactory.class.getPackageName();
        ImageReaderFactory imageReaderFactory = (ImageReaderFactory)ReadXml.getObject(packageName, FACTORY_METHOD);

        if (imageReaderFactory == null){
            System.out.println("xml 配置错误");
        } else {
            imageReaderFactory.getImageReader().imageReader();
        }

    }
}
