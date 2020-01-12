package fun.lixi.study.designpatterns.p2d3;

/**
 * 现金收取
 */
public abstract class CashSuper {

    /**
     * 收取现金
     *
     * @param money 原价
     * @return 当前价格
     */
    public abstract double acceptCash(double money);
}
