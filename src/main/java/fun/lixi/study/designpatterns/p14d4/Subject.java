package fun.lixi.study.designpatterns.p14d4;


public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyMethod();

    void setSubjectState(String action);
    String getSubjectState();
}
