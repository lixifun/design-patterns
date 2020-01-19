package fun.lixi.study.designpatterns.p20.p20d3;

public class ConcreteIteratorDesc extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.current = aggregate.getCount() - 1;
    }

    @Override
    public Object first() {
        return aggregate.getItem(aggregate.getCount() - 1);
    }

    @Override
    public Object next() {
        Object ret = null;

        current--;
        if (current >= 0) {
            ret = aggregate.getItem(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current < 0;
    }

    @Override
    public Object currentItem() {
        return aggregate.getItem(current);
    }

}
