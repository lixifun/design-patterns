package fun.lixi.study.designpatterns.p23.p23d5;

import fun.lixi.study.designpatterns.p23.p23d3.Barbecuer;
import fun.lixi.study.designpatterns.p23.p23d4.BakeChickenWingCommand;
import fun.lixi.study.designpatterns.p23.p23d4.BakeMuttonCommand;
import fun.lixi.study.designpatterns.p23.p23d4.Command;

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
        girl.setOrder(bakeMuttonCommand2);
        girl.setOrder(bakeChickenWingCommand1);

        // 点菜完毕，通知厨房
        girl.notifyMethod();
    }
}
