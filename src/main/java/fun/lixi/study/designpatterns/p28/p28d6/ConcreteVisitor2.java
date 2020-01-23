package fun.lixi.study.designpatterns.p28.p28d6;

public class ConcreteVisitor2 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(String.format("%s 被 %s 访问", concreteElementA.getClass().getName(), this.getClass().getName()));
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(String.format("%s 被 %s 访问", concreteElementB.getClass().getName(), this.getClass().getName()));
    }
}
