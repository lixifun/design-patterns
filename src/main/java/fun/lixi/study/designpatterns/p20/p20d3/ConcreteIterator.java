package fun.lixi.study.designpatterns.p20.p20d3;

public class ConcreteIterator extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItem(0);
    }

    @Override
    public Object next() {
        Object ret = null;

        current++;
        if (current < aggregate.getCount()) {
            ret = aggregate.getItem(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.getCount();
    }

    @Override
    public Object currentItem() {
        return aggregate.getItem(current);
    }

}
