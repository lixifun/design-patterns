package fun.lixi.study.designpatterns.p23.p23d5;

import fun.lixi.study.designpatterns.p23.p23d4.Command;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command) {
        if ("命令模式.BakeChickenWingCommand".equals(command.toString())) {
            System.out.println("服务员: 鸡翅没有了，请点别的烧烤。");
        } else {
            orders.add(command);
            System.out.println("增加订单: " + command.toString() + " 时间: " + LocalDateTime.now());
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单: " + command.toString() + " 时间: " + LocalDateTime.now());
    }

    public void notifyMethod() {
        orders.forEach(Command::executeCommand);
    }
}
