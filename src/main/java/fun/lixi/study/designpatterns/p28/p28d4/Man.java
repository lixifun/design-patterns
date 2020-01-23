package fun.lixi.study.designpatterns.p28.p28d4;

public class Man extends Person {

    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
