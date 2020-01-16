package fun.lixi.study.designpatterns.p14.p14d2;

public class Main {
    public static void main(String[] args) {

        Secretary tongzhizhe = new Secretary();

        StockObserver tongshi1 = new StockObserver("o1", tongzhizhe);
        StockObserver tongshi2 = new StockObserver("o2", tongzhizhe);

        tongzhizhe.attach(tongshi1);
        tongzhizhe.attach(tongshi2);

        tongzhizhe.setAction("老板回来了！");
        tongzhizhe.notifyMethod();
    }

}
