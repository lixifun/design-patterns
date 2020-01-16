package fun.lixi.study.designpatterns.p14d3;

import java.util.ArrayList;
import java.util.List;

public class Secretary {

    private List<Observer> observers = new ArrayList<>();
    private String action;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyMethod() {
        observers.forEach(Observer::update);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
