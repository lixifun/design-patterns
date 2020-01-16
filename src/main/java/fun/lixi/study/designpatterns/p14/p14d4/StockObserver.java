package fun.lixi.study.designpatterns.p14.p14d4;


public class StockObserver extends Observer {

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s %S 关闭股票行情，继续工作!", sub.getSubjectState(), name));
    }
}
