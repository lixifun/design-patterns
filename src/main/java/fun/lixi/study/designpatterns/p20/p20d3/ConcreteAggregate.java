package fun.lixi.study.designpatterns.p20.p20d3;

public class ConcreteAggregate extends Aggregate {

    private Object[] items;

    public ConcreteAggregate(int size) {
        this.items = new Object[size];
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int getCount() {
        return items.length;
    }

    public void setItem(int index, Object value) {
        items[index] = value;
    }

    public Object getItem(int index) {
        return items[index];
    }
}
