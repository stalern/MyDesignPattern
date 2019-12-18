package com.stalern.designpattern.builder.director;

import com.stalern.designpattern.builder.builder.BaseComputerBuilder;
import com.stalern.designpattern.builder.product.Computer;

/**
 * @author stalern
 * @date 2019/12/18~10:45
 */
public class ComputerDirector {
    public Computer construct(BaseComputerBuilder builder) {

        // 逐步构建复杂产品对象
        builder.buildBrand();
        builder.buildCpu();
        builder.buildDisplayCard();
        builder.buildHardDisk();
        builder.buildMainBoard();
        builder.buildMemory();
        builder.buildPower();
        return builder.buildComputer();
    }
}
