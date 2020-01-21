package fun.lixi.study.designpatterns.p26.p26d2;

public class Main {
    public static void main(String[] args) {
        int extrinsicstate = 22;

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight fx = flyweightFactory.getFlyweight("X");
        fx.operation(--extrinsicstate);

        Flyweight fy = flyweightFactory.getFlyweight("Y");
        fy.operation(--extrinsicstate);

        Flyweight fz = flyweightFactory.getFlyweight("Z");
        fz.operation(--extrinsicstate);

        Flyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicstate);
        
    }
}
