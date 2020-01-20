package fun.lixi.study.designpatterns.p24.p24d2;

public class Manager {
    protected String name;

    public Manager(String name) {
        this.name = name;
    }

    public void getResult(String menagerLevel, Request request) {

        if ("经理".equals(menagerLevel)) {
            if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5) {
                System.out.println(String.format("%s:%s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber()));
            } else {
                System.out.println(String.format("%s:%s 数量 %s 我无权处理", name, request.getRequestContent(), request.getNumber()));
            }
        } else if ("总监".equals(menagerLevel)) {
            if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5) {
                System.out.println(String.format("%s:%s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber()));
            } else {
                System.out.println(String.format("%s:%s 数量 %s 我无权处理", name, request.getRequestContent(), request.getNumber()));
            }
        } else if ("总经理".equals(menagerLevel)) {
            if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5) {
                System.out.println(String.format("%s:%s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber()));
            } else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 500) {
                System.out.println(String.format("%s:%s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber()));
            } else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 500) {
                System.out.println(String.format("%s:%s 数量 %s 再说吧", name, request.getRequestContent(), request.getNumber()));
            }
        }
    }
}
