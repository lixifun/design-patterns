package fun.lixi.study.designpatterns.p2.p2d5;

import fun.lixi.study.designpatterns.p2.p2d3.CashSuper;

public class CashContext {

    /**
     * 声明一个 CashSuper 对象
     */
    private CashSuper cs;

    /**
     * 通过构造方法，传入具体的收费策略
     *
     * @param cs 具体的收费策略
     */
    public CashContext(CashSuper cs) {
        this.cs = cs;
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
