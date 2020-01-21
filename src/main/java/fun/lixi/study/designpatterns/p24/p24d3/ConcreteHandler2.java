package fun.lixi.study.designpatterns.p24.p24d3;

public class ConcreteHandler2 extends Handler {

    @Override
    public void HandleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(String.format("%s 处理请求 %s", this.getClass().getName(), request));
        } else if (successor != null) {
            successor.HandleRequest(request);
        }
    }
}
