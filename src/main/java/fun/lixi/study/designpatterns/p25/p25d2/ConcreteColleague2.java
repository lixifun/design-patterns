package fun.lixi.study.designpatterns.p25.p25d2;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notifyMethod(String message) {
        System.out.println("同事 2 得到消息: " + message);
    }
}
