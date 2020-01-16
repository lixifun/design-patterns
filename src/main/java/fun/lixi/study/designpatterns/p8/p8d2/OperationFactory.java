package fun.lixi.study.designpatterns.p8.p8d2;


import fun.lixi.study.designpatterns.p1.p1d9.*;

/**
 * p1d10 中的 OperationFactory 简单工厂模式
 */
public class OperationFactory {

    public static Operation createOperate(String operate) {
        Operation operation = null;

        // 增加运算规则，则需要新增 OperationXxx 的子类
        // 同时在 switch 中添加
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }

        return operation;
    }
}
