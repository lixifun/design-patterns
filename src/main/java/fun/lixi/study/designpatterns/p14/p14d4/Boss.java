package fun.lixi.study.designpatterns.p14.p14d4;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject {

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

    @Override
    public void setSubjectState(String action) {
        this.action = action;
    }

    @Override
    public String getSubjectState() {
        return action;
    }
}
