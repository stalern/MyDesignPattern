package com.stalern.designpattern.composite;

/**
 * 作为树叶构件
 * @author stalern
 * @date 2019/12/03~21:20
 */
public class Office extends AbstractOrganization{

    public Office(String name) {
        super(name);
    }

    @Override
    public void add(AbstractOrganization organization) throws Exception {
        throw new Exception("Can't call this method");
    }

    @Override
    public void remove(AbstractOrganization organization) throws Exception {
        throw new Exception("Can't call this method");
    }

    @Override
    public void display(int depth) {
        System.out.println("第" + depth + "层是" + name + "办公室");
    }
}
