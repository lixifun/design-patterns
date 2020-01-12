package fun.lixi.study.designpatterns.p2d6;

import fun.lixi.study.designpatterns.p2d3.CashNormal;
import fun.lixi.study.designpatterns.p2d3.CashRebate;
import fun.lixi.study.designpatterns.p2d3.CashReturn;
import fun.lixi.study.designpatterns.p2d3.CashSuper;

public class CashContext {

    CashSuper cs = null;

    /**
     * 注意参数不是具体的收费策略对象，而是一个字符串，表示收费类型
     *
     * @param cbxType 收费类型
     */
    public CashContext(String cbxType) {

        // 将实例具体策略的过程由客户端转移到 Context 类中，简单工厂的应用
        // 实例化时刻的改变

        // 不完美的地方，这里依旧用到了 switch
        // 反射可解决
        switch (cbxType) {
            case "正常收费":
                this.cs = new CashNormal();
                break;
            case "满 300 减 100":
                this.cs = new CashReturn(300, 100);
                break;
            case "打 8 折":
                this.cs = new CashRebate(0.8);
                break;
        }
    }


    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
