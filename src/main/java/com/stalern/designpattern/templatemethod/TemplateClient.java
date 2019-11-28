package com.stalern.designpattern.templatemethod;

/**
 * @author stalern
 * @date 2019/11/28~14:29
 */
public class TemplateClient {
    public static void runTemplate() {
        BaseCook cookOnion = new OnionCook();
        cookOnion.cook();
        BaseCook cookTomato = new TomatoCook();
        cookTomato.cook();
    }
}
