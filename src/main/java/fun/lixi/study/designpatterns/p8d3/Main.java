package fun.lixi.study.designpatterns.p8d3;

import fun.lixi.study.designpatterns.p1d9.Operation;

/**
 * 简单工厂模式的最大优点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，对于客户端来说，去除了于具体产品的依赖
 * <p>
 * 当添加功能时，需要给运算工厂类的方法里加 case 分支，违背了 开放 - 封闭原则
 * <p>
 * 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 * <p>
 * 工厂方法模式实现时，客户端需要决定实例化哪一个工厂来实现运算类，选择判断的问题还是存在，也就是说，工厂方法把简单工厂的内部逻辑判断移
 * 到了客户端代码进行，要加功能，本来是要改工厂类的，现在需要改客户端了
 */
public class Main {

    public static void main(String[] args) {

        IFactory operationFactory = new AddFactory();
        Operation operation = operationFactory.createOperation();

        operation.setNumberA(1);
        operation.setNumberB(2);

        double result = operation.getResult();
        System.out.println("结果是: " + result);
    }
}
