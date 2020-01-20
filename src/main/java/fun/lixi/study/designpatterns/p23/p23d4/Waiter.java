package fun.lixi.study.designpatterns.p23.p23d4;

public class Waiter {

    private Command command;

    public void setOrder(Command command) {
        this.command = command;
    }

    public void notifyMethod() {
        command.executeCommand();
    }
}
