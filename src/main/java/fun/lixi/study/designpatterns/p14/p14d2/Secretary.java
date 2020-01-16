package fun.lixi.study.designpatterns.p14.p14d2;

import java.util.ArrayList;
import java.util.List;

public class Secretary {

    private List<StockObserver> observers = new ArrayList<>();
    private String action;

    /**
     * 增加
     */
    public void attach(StockObserver observer) {
        observers.add(observer);
    }

    /**
     * 通知
     */
    public void notifyMethod() {
        observers.forEach(StockObserver::update);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}

