package fun.lixi.study.designpatterns.p23.p23d4;

import fun.lixi.study.designpatterns.p23.p23d3.Barbecuer;

public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
