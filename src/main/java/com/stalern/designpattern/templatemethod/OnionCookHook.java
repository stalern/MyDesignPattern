package com.stalern.designpattern.templatemethod;

/**
 * 钩子方法的洋葱炒鸡蛋
 * @author stalern
 * @date 2019/11/28~15:01
 */
public class OnionCookHook extends BaseCookHook{
    @Override
    void pourVegetable() {
        System.out.print("放入葱花,");
    }

    @Override
    void pourSauce() {
        System.out.print("放入蒜苗,");
    }

    @Override
    public boolean hasWater() {
        return false;
    }
}
