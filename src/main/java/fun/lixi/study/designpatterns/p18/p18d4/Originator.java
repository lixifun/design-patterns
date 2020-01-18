package fun.lixi.study.designpatterns.p18.p18d4;

public class Originator {

    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setMemento(Memento memento) {
        this.setState(memento.getState());
    }

    public void show() {
        System.out.println("State = " + state);
    }
}
