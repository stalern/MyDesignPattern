package com.stalern.designpattern.templatemethod;

/**
 * @author stalern
 * @date 2019/11/28~14:28
 */
class OnionCook extends BaseCook{
    @Override
    void pourVegetable() {
        System.out.print("放入葱花,");
    }

    @Override
    void pourSauce() {
        System.out.print("放入蒜苗,");
    }
}
