package fun.lixi.study.designpatterns.p14.p14d3;

public class StockObserver extends Observer {

    public StockObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s %S 关闭股票行情，继续工作!", sub.getAction(), name));
    }
}
