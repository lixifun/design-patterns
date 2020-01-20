package fun.lixi.study.designpatterns.p22.p22d6;

public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        implementor.operation();
    }
}
