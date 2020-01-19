package fun.lixi.study.designpatterns.p20.p20d3;

public class Main {
    public static void main(String[] args) {

        ConcreteAggregate aggregate = new ConcreteAggregate(6);

        aggregate.setItem(0, "大鸟");
        aggregate.setItem(1, "小菜");
        aggregate.setItem(2, "行李");
        aggregate.setItem(3, "老外");
        aggregate.setItem(4, "公交内部员工");
        aggregate.setItem(5, "小偷");

//        Iterator iterator = new ConcreteIterator(aggregate);
        Iterator iterator = new ConcreteIteratorDesc(aggregate);
        Object item = iterator.first();
        while(!iterator.isDone()) {
            System.out.println(String.format("%s 请买车票", iterator.currentItem()));
            iterator.next();
        }
    }
}
