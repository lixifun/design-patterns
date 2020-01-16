package fun.lixi.study.designpatterns.p14d8;

public class Boss implements Subject {

    private String action;

    @Override
    public void notifyMethod() {
    }

    @Override
    public void setSubjectState(String state) {
        this.action = state;
    }

    @Override
    public String getSubjectState() {
        return action;
    }
}
