package fun.lixi.study.designpatterns.p20.p20d3;

public abstract class Iterator {

    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();
}
