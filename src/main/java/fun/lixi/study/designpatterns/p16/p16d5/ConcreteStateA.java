package fun.lixi.study.designpatterns.p16.p16d5;

public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
