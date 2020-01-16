package fun.lixi.study.designpatterns.p14.p14d8;

public class StockObserver {

    private String name;
    private Subject sub;

    public StockObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public void closeStockMarket() {
        System.out.println(String.format("%s %s 关闭股票行情，继续工作！", sub.getSubjectState(), name));
    }
}
