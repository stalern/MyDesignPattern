package com.stalern.designpattern.simplefactory.factory;

import com.stalern.designpattern.simplefactory.product.GifReader;
import com.stalern.designpattern.simplefactory.product.ImageReader;
import com.stalern.designpattern.simplefactory.product.JpgReader;

/**
 * 如果新增工厂的话会修改此处
 * @author stalern
 * @date 2019/10/9--19:46
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(String type){
        String gif = "Gif";
        String jpg = "Jpg";
        if(gif.equals(type)){
            return new GifReader();
        } else if(jpg.equals(type)){
            return new JpgReader();
        }
        return null;
    }
}
