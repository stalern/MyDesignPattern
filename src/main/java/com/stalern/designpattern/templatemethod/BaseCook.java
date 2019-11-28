package com.stalern.designpattern.templatemethod;

/**
 * 模板方法模式的抽象类
 * @author stalern
 * @date 2019/11/28~13:23
 */
abstract class BaseCook {
    final void cook() {
        pourOil();
        heatOil();
        pourSauce();
        pourVegetable();
        fry();
    }
    private void pourOil() {
        System.out.print("倒油,");
    }
    private void heatOil() {
        System.out.print("热油,");
    }

    /**
     * 放入的蔬菜不同
     */
    abstract void pourVegetable();

    /**
     * 放入的调料不同
     */
    abstract void pourSauce();

    private void fry() {
        System.out.println("炒菜");
    }
}
