package fun.lixi.study.designpatterns.p1d9;

public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        if (getNumberB() == 0) {
            throw new RuntimeException("除数不能为 0。");
        }
        result = getNumberA() / getNumberB();
        return result;
    }
}
