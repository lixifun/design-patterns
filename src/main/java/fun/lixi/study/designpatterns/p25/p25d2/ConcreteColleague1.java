package fun.lixi.study.designpatterns.p25.p25d2;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notifyMethod(String message) {
        System.out.println("同事 1 得到消息: " + message);
    }
}
