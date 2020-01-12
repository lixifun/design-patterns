package fun.lixi.study.designpatterns.p6d4;

public class ConcreteDecoratorB extends Decorator{



    @Override
    public void operation() {
        // 首先运行原 Component 的 operation()
        // 再执行本类的功能，相当于对原 Component 进行了装饰
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象 B 的操作");
    }

    /**
     * 本类独有的方法，以区别于 ConcreteDecoratorA
     */
    private void addedBehavior() {

    }
}
