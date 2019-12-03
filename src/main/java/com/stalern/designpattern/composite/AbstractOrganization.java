package com.stalern.designpattern.composite;

/**
 * 作为抽象构件
 * @author stalern
 * @date 2019/12/03~21:21
 */
public abstract class AbstractOrganization {

    protected String name;
    public AbstractOrganization(String name) {
        this.name = name;
    }

    /**
     * 增加一个组织
     * @param organization 可能是Office也可能是School
     * @throws Exception 禁止调用该方法异常
     */
    public abstract void add(AbstractOrganization organization) throws Exception;

    /**
     * 移走一个组织
     * @param organization 可能是Office也可能是School
     * @throws Exception 禁止调用该方法异常
     */
    public abstract void remove(AbstractOrganization organization) throws Exception;

    /**
     * 详细操作
     * @param depth 深度
     */
    public abstract void display(int depth);
}
