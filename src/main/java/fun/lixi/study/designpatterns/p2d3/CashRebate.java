package fun.lixi.study.designpatterns.p2d3;

/**
 * 打折收费子类
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    /**
     * 收取现金
     * 返回打折后的价格
     *
     * @param money 原价
     * @return 当前价格
     */
    @Override
    public double acceptCash(double money) {

        return money * moneyRebate;
    }
}
