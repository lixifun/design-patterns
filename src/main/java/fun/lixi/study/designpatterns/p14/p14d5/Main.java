package fun.lixi.study.designpatterns.p14.p14d5;

/**
 * 观察者模式所做的工作就是在解除耦合。让耦合的双方都依赖于抽象，而不是依赖具体。从而使得各自的变化都不会影响到另一边的变化
 */
public class Main {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        concreteSubject.attach(new ConcreteObserver(concreteSubject, "X"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject, "Y"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject, "Z"));

        concreteSubject.setSubjectState("ABC");
        concreteSubject.notifyMethod();
    }
}
