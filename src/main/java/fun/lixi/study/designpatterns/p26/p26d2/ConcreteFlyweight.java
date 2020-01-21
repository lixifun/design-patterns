package fun.lixi.study.designpatterns.p26.p26d2;

public class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体 Flyweight: " + extrinsicstate);
    }
}
