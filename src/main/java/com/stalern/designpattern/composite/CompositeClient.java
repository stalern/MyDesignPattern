package com.stalern.designpattern.composite;

/**
 * 组合模式客户端
 * @author stalern
 * @date 2019/12/03~22:21
 */
public class CompositeClient {
    public static void runComposite() throws Exception {
        AbstractOrganization admOffice = new Office("行政");
        AbstractOrganization acaOffice = new Office("教务");


        AbstractOrganization root = new School("北京总公司");
        root.add(admOffice);
        root.add(acaOffice);

        AbstractOrganization sch1 = new School("湖南分校");
        sch1.add(admOffice);
        sch1.add(acaOffice);
        root.add(sch1);

        AbstractOrganization sch2 = new School("长沙教学点");
        sch2.add(admOffice);
        sch2.add(acaOffice);
        sch1.add(sch2);

        AbstractOrganization sch3 = new School("湘潭教学点");
        sch3.add(admOffice);
        sch3.add(acaOffice);
        sch1.add(sch2);

        root.display(1);
    }
}
