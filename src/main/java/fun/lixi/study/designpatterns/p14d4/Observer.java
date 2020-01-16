package fun.lixi.study.designpatterns.p14d4;

public abstract class Observer {

    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
