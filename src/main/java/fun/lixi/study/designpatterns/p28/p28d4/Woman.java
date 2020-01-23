package fun.lixi.study.designpatterns.p28.p28d4;

public class Woman extends Person {

    @Override
    public void accept(Action visitor) {
        visitor.getWomanConslusion(this);
    }
}
