package fun.lixi.study.designpatterns.p7.p7d5;

public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
