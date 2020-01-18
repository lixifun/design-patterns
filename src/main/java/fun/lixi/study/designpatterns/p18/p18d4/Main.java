package fun.lixi.study.designpatterns.p18.p18d4;

public class Main {

    public static void main(String[] args) {
        Originator o = new Originator();

        o.setState("On");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("Off");
        o.show();

        o.setMemento(c.getMemento());
        o.show();

    }
}
