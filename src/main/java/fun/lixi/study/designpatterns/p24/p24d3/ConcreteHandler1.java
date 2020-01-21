package fun.lixi.study.designpatterns.p24.p24d3;

public class ConcreteHandler1 extends Handler {

    @Override
    public void HandleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(String.format("%s 处理请求 %s", this.getClass().getName(), request));
        } else if (successor != null) {
            successor.HandleRequest(request);
        }
    }
}
