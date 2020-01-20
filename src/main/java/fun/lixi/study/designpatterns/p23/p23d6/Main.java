package fun.lixi.study.designpatterns.p23.p23d6;

public class Main {
    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();

    }
}
