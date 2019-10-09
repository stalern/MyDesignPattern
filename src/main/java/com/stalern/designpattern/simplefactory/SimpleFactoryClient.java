package com.stalern.designpattern.simplefactory;

import com.stalern.designpattern.simplefactory.factory.ImageReaderFactory;
import com.stalern.designpattern.simplefactory.product.ImageReader;
import com.stalern.util.ReadXml;

/**
 * @author stalern
 * @date 2019/10/9--20:02
 */
public class SimpleFactoryClient {
    private final static String FACTORY_METHOD = "simpleFactory";
    public static void runFactory(){

        String type = ReadXml.getValue(FACTORY_METHOD);
        ImageReader imageReader = ImageReaderFactory.getImageReader(type);
        if (imageReader != null) {
            imageReader.imageReader();
        } else {
            System.out.println("Xml 文件配置错误！");
        }
    }
}
