package fun.lixi.study.designpatterns.p28.p28d6;

public class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}
