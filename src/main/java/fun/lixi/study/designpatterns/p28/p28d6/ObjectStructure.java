package fun.lixi.study.designpatterns.p28.p28d6;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        elements.forEach(e -> e.accept(visitor));
    }
}
