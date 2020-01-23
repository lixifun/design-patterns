package fun.lixi.study.designpatterns.p28.p28d4;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Person> elements = new ArrayList<>();

    public void attach(Person element) {
        elements.add(element);
    }

    public void detach(Person element) {
        elements.remove(element);
    }

    public void display(Action visitor) {
        elements.forEach(e -> e.accept(visitor));
    }
}
