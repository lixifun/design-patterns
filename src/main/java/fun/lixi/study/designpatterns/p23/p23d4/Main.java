package fun.lixi.study.designpatterns.p23.p23d4;

import fun.lixi.study.designpatterns.p23.p23d3.Barbecuer;

public class Main {
    public static void main(String[] args) {

        // 开店前的准备
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);

        Waiter girl = new Waiter();

        // 开门营业
        girl.setOrder(bakeMuttonCommand1);
        girl.notifyMethod();
        girl.setOrder(bakeMuttonCommand2);
        girl.notifyMethod();
        girl.setOrder(bakeChickenWingCommand1);
        girl.notifyMethod();
    }
}
