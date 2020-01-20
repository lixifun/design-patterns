package fun.lixi.study.designpatterns.p22.p22d6;

public class Main {
    public static void main(String[] args) {

        Abstraction ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
