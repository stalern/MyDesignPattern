package com.stalern.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * 读取xml文件
 * https://blog.csdn.net/lz527657138/article/details/70591792 这篇博客讲相关api
 * @author stalern
 * @date 2019/9/26--12:52
 */
public class ReadXml {

    private final static String CLASS_NAME = "class-name";
    private ReadXml(){}
    /**
     * 获取xml中具体类的类名,进而通过反射拿到对象
     * @param packageName 包名
     * @param designPattern xml中的属性
     * @return object
     */
    public static Object getObject(String packageName, String designPattern){
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("src/main/resources/config.xml"));

            //获取CLASS的节点
            NodeList designs = doc.getElementsByTagName(CLASS_NAME);
            for (int i = 0; i < designs.getLength(); i++) {
                // 拿到其元素
                Node design = designs.item(i);
                // 如果该节点父亲的属性和传入的一样
                if (designPattern.equals(design.getParentNode().getAttributes().item(0).getNodeValue())){
                    // 因为只有子节点className只有一个
                    String cName = packageName + "."+design.getFirstChild().getNodeValue();

                    Class<?> c = Class.forName(cName);
                    return c.getDeclaredConstructor().newInstance();
                }
            }
            return null;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取某设计模式节点的值，之后不做处理
     * @param designPattern 设计模式节点的值
     * @return 该节点的值
     */
    public static String getValue(String designPattern) {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("src/main/resources/config.xml"));

            //获取CLASS的节点
            NodeList designs = doc.getElementsByTagName(CLASS_NAME);
            for (int i = 0; i < designs.getLength(); i++) {
                // 拿到其元素
                Node design = designs.item(i);
                // 如果该节点父亲的属性和传入的一样
                if (designPattern.equals(design.getParentNode().getAttributes().item(0).getNodeValue())){
                    // 因为只有子节点className只有一个

                    return design.getFirstChild().getNodeValue();
                }
            }
            return null;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
