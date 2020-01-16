package fun.lixi.study.designpatterns.p14d3;

public abstract class Observer {

    protected String name;
    protected Secretary sub;

    public Observer(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
