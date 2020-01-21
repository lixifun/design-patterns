package fun.lixi.study.designpatterns.p24.p24d5;

import fun.lixi.study.designpatterns.p24.p24d2.Request;

public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType())) {
            System.out.println(String.format("%s:%s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber()));
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 500) {
            System.out.println(String.format("%s:%s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber()));
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 500) {
            System.out.println(String.format("%s:%s 数量 %s 再说吧", name, request.getRequestContent(), request.getNumber()));
        }
    }
}
