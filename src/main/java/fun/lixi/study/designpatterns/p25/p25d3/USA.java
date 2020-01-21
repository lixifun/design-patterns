package fun.lixi.study.designpatterns.p25.p25d3;

public class USA extends Country {

    public USA(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("美国获得对方消息: " + message);
    }
}
