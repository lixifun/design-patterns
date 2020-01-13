package fun.lixi.study.designpatterns.p7d4;

import fun.lixi.study.designpatterns.p7d2.SchoolGirl;

/**
 * 代理类
 * <p>
 * 在实现方法中调用 追求者 的相关方法
 */
public class Proxy implements IGiveGift {

    private Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
