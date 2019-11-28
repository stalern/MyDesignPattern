package com.stalern.designpattern.templatemethod;

/**
 * @author stalern
 * @date 2019/11/28~14:20
 */
class TomatoCook extends BaseCook {

    @Override
    void pourVegetable() {
        System.out.print("放入西红柿,");
    }

    @Override
    void pourSauce() {
        System.out.print("放入鸡蛋,");
    }
}
