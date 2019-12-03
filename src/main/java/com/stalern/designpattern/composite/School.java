package com.stalern.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 作为树枝构件
 * @author stalern
 * @date 2019/12/03~22:17
 */
public class School extends AbstractOrganization {

    private List<AbstractOrganization> organizationList = new ArrayList<>();

    public School(String name) {
        super(name);
    }

    @Override
    public void add(AbstractOrganization organization) {
        organizationList.add(organization);
    }

    @Override
    public void remove(AbstractOrganization organization) {
        organizationList.remove(organization);
    }

    @Override
    public void display(int depth) {
        System.out.println("第" + depth + "层是" + name);
        for (AbstractOrganization organization : organizationList) {
            organization.display(depth + 1);
        }
    }
}
