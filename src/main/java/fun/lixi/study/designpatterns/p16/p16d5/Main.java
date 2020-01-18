package fun.lixi.study.designpatterns.p16.p16d5;

public class Main {
    public static void main(String[] args) {

        Context c = new Context(new ConcreteStateA());

        c.request();
        c.request();
        c.request();
        c.request();
    }
}
