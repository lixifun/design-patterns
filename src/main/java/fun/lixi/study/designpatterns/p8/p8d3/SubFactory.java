package fun.lixi.study.designpatterns.p8.p8d3;

import fun.lixi.study.designpatterns.p1.p1d9.Operation;
import fun.lixi.study.designpatterns.p1.p1d9.OperationSub;

public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
