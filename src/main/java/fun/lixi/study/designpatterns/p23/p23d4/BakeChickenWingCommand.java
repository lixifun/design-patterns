package fun.lixi.study.designpatterns.p23.p23d4;

import fun.lixi.study.designpatterns.p23.p23d3.Barbecuer;

public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
