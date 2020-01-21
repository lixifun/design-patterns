package fun.lixi.study.designpatterns.p24.p24d5;

import fun.lixi.study.designpatterns.p24.p24d2.Request;

public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 2) {
            System.out.println(String.format("%s:%s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber()));
        } else {
            if (superior != null) {
                superior.requestApplications(request);
            }
        }
    }
}
