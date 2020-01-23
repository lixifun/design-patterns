package fun.lixi.study.designpatterns.p28.p28d6;

public class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
