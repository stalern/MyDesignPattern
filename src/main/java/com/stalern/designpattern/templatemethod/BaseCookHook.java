package com.stalern.designpattern.templatemethod;

/**
 * 含有钩子方法的抽象模板类
 * @author stalern
 * @date 2019/11/28~14:58
 */
abstract class BaseCookHook {

    final void cook() {
        pourOil();
        heatOil();
        pourSauce();
        pourVegetable();
        if (hasWater()) {
            fry();
        }
    }
    /**
     * 钩子方法
     * @return boolean
     */
    boolean hasWater() {
        return true;
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
