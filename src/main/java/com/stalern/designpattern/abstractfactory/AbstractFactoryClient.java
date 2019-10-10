package com.stalern.designpattern.abstractfactory;

import com.stalern.designpattern.abstractfactory.factory.ImageReaderFactory;
import com.stalern.util.ReadXml;

/**
 * @author stalern
 * @date 2019/10/10--18:34
 */
public class AbstractFactoryClient {

    private final static String FACTORY_METHOD = "absoluteFactory";
    public static void runFactory() {
        String packageName = ImageReaderFactory.class.getPackageName();
        ImageReaderFactory imageReaderFactory = (ImageReaderFactory) ReadXml.getObject(packageName, FACTORY_METHOD);

        if (imageReaderFactory == null){
            System.out.println("xml 配置错误");
        } else {
            // 此处的forward和reserve都可以用xml，但我懒得配了
            imageReaderFactory.getForwardImageReader().forwardImageReader();
        }
    }
}
