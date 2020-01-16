package fun.lixi.study.designpatterns.p14.p14d2;

public class StockObserver {

    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public void update() {
        System.out.println(String.format("%s %s 关闭股票行情，继续工作", sub.getAction(), name));
    }
}
