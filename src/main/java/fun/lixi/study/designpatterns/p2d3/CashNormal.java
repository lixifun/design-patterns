package fun.lixi.study.designpatterns.p2d3;

/**
 * 正常收费子类
 */
public class CashNormal extends CashSuper {
    /**
     * 收取现金
     * 原价返回
     *
     * @param money 原价
     * @return 当前价格
     */
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
