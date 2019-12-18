package com.stalern.designpattern.builder;

import com.stalern.designpattern.builder.builder.BaseComputerBuilder;
import com.stalern.designpattern.builder.builder.DellComputerBuilder;
import com.stalern.designpattern.builder.director.ComputerDirector;

/**
 * @author stalern
 * @date 2019/12/18~10:46
 */
public class BuilderClient {
    public static void runBuilder() {
        ComputerDirector director = new ComputerDirector();
        BaseComputerBuilder builder = new DellComputerBuilder();
        System.out.println(director.construct(builder));
    }
}
