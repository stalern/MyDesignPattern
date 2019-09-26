package com.stalern.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * 读取xml文件
 * @author stalern
 * @date 2019/9/26--12:52
 */
public class ReadXml {
    /**
     * 获取xml中具体类的类名和对象
     * @return object
     */
    public static Object getObject(){
        try
        {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("src/main/resources/config.xml"));
            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();

            String cName = "com.stalern.factory."+classNode.getNodeValue();

            // System.out.println("新类名："+cName)
            Class<?> c = Class.forName(cName);
            return c.getDeclaredConstructor().newInstance();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
