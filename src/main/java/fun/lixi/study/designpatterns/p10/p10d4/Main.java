package fun.lixi.study.designpatterns.p10.p10d4;

public class Main {
    public static void main(String[] args) {

        AbstractClass abstractClass;

        abstractClass = new ConcreteClassA();
        abstractClass.templateMethod();

        abstractClass = new ConcreteClassB();
        abstractClass.templateMethod();
    }
}
