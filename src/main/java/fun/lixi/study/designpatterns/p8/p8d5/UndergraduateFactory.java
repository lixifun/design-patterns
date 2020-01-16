package fun.lixi.study.designpatterns.p8.p8d5;

public class UndergraduateFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
