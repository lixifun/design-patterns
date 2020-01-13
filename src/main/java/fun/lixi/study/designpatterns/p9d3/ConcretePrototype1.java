package fun.lixi.study.designpatterns.p9d3;

public class ConcretePrototype1 extends ProtoType implements Cloneable {
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
