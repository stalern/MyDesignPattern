package com.stalern.designpattern.builder.builder;

import com.stalern.designpattern.builder.product.Computer;

/**
 * @author stalern
 * @date 2019/12/18~10:37
 */
public abstract class BaseComputerBuilder {
    protected Computer computer = new Computer();

    /**
     * 电脑品牌
     */
    public abstract void buildBrand();

    /**
     * 电脑CPU
     */
    public abstract void buildCpu();

    /**
     * 电脑主板
     */
    public abstract void buildMainBoard();

    /**
     * 电脑硬盘
     */
    public abstract void buildHardDisk();

    /**
     * 电脑显卡
     */
    public abstract void buildDisplayCard();

    /**
     * 电脑电池
     */
    public abstract void buildPower();

    /**
     * 电脑内存
     */
    public abstract void buildMemory();
    public Computer buildComputer() {
        return computer;
    }
}
