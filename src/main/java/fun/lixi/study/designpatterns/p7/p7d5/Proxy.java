package fun.lixi.study.designpatterns.p7.p7d5;

public class Proxy extends Subject{

    private RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
