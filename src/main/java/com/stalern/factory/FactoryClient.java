package com.stalern.factory;

import com.stalern.util.ReadXml;

/**
 * 客户的访问
 * @author stalern
 * @date 2019/9/26--11:29
 */
public class FactoryClient {

    public static void runFactory() {

        ImageReaderFactory imageReaderFactory = (ImageReaderFactory)ReadXml.getObject();

        if (imageReaderFactory == null){
            System.out.println("xml 配置错误");
        } else {
            imageReaderFactory.getImageReader().imageReader();
        }

    }
}
