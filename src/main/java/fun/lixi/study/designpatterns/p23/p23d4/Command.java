package fun.lixi.study.designpatterns.p23.p23d4;

import fun.lixi.study.designpatterns.p23.p23d3.Barbecuer;

public abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void executeCommand();
}
