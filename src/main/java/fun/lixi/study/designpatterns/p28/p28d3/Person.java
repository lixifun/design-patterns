package fun.lixi.study.designpatterns.p28.p28d3;

public abstract class Person {

    protected String action;

    public abstract void getConclusion();

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
