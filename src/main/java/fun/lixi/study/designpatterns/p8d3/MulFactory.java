package fun.lixi.study.designpatterns.p8d3;

import fun.lixi.study.designpatterns.p1d9.Operation;
import fun.lixi.study.designpatterns.p1d9.OperationMul;

public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}