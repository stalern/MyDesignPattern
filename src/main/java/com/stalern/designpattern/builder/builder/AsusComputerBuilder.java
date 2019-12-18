package com.stalern.designpattern.builder.builder;

/**
 * 华硕电脑
 * @author stalern
 * @date 2019/12/18~10:41
 */
public class AsusComputerBuilder extends BaseComputerBuilder{
    @Override
    public void buildBrand() {
        computer.setBrand("华硕电脑");
    }
    @Override
    public void buildCpu() {
        computer.setCpu("Intel 第8代 酷睿");
    }
    @Override
    public void buildMainBoard() {
        computer.setMainBoard("华硕主板");
    }
    @Override
    public void buildHardDisk() {
        computer.setHardDisk("256GB SSD");
    }
    @Override
    public void buildDisplayCard() {
        computer.setDisplayCard("MX150 独立2GB");
    }
    @Override
    public void buildPower() {
        computer.setPower("3芯 锂离子电池 65W AC适配器");
    }
    @Override
    public void buildMemory() {
        computer.setMemory("1 x SO-DIMM  8GB");
    }
}
