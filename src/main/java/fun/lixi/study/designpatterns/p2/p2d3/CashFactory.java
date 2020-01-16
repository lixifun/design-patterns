package fun.lixi.study.designpatterns.p2.p2d3;

public class CashFactory {

    public static CashSuper createCashAccept(String type) {
        CashSuper cs = null;

        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满 300 返 100":
                cs = new CashReturn(300, 100);
                break;
            case "打 8 折":
                cs = new CashRebate(0.8);
                break;
        }
        return cs;
    }
}
