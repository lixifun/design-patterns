package fun.lixi.study.designpatterns.p6d4;

public class ConcreteDecoratorA extends Decorator{

    // 本类独有的功能
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象 A 的操作");
    }
}
