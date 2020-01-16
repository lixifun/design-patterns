package fun.lixi.study.designpatterns.p14d4;

public class Main {
    public static void main(String[] args) {

        Boss huhansan = new Boss();

        StockObserver tongshi1 = new StockObserver("stock1", huhansan);
        NBAObserver tongshi2 = new NBAObserver("nba1", huhansan);

        huhansan.attach(tongshi1);
        huhansan.attach(tongshi2);

        huhansan.attach(tongshi1);

        // 老板回来了
        huhansan.setSubjectState("我胡汉三回来了！");
        huhansan.notifyMethod();
    }
}
