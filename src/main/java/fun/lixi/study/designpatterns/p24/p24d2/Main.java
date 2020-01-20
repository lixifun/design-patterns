package fun.lixi.study.designpatterns.p24.p24d2;

public class Main {
    public static void main(String[] args) {

        Manager jinli = new Manager("金利");
        Manager zongjian = new Manager("宗剑");
        Manager zhongjingli = new Manager("钟精励");

        Request request = new Request();
        request.setRequestType("加薪");
        request.setRequestContent("小菜请求加薪");
        request.setNumber(1000);

        jinli.getResult("经理", request);
        zongjian.getResult("总监", request);
        zhongjingli.getResult("总经理", request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请求请假");
        request2.setNumber(3);
        jinli.getResult("经理", request2);
        zongjian.getResult("总监", request2);
        zhongjingli.getResult("总经理", request2);

    }
}
