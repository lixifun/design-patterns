package fun.lixi.study.designpatterns.p2.p2d3;

/**
 * 返利收费子类
 */
public class CashReturn extends CashSuper {

    private double moneyCondition = 0.0;
    private double moneyReturn = 0.0;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    /**
     * 收取现金
     *
     * @param money 原价
     * @return 当前价格
     */
    @Override
    public double acceptCash(double money) {
        double result = money;

        if(money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }

        return result;
    }
}
