package fun.lixi.study.designpatterns.p9d3;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        ConcretePrototype1 c1 = (ConcretePrototype1) p1.clone();

        System.out.printf("Cloned: %s", c1.getId());
    }
}
