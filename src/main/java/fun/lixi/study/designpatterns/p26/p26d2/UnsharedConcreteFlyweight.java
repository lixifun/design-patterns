package fun.lixi.study.designpatterns.p26.p26d2;

public class UnsharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体 Flyweight: " + extrinsicstate);
    }
}
