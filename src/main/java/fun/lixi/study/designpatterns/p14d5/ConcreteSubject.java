package fun.lixi.study.designpatterns.p14d5;


public class ConcreteSubject extends Subject {

    // 具体被观察状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
