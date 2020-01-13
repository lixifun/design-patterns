package fun.lixi.study.designpatterns.p8d5;

/**
 * 简单工厂模式 客户端
 * <p>
 * 需要在任何实例化的时候写出这个工厂的代码，重复了
 */
public class MainSimple {
    public static void main(String[] args) {

        LeiFeng studentA = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentA.buyRice();

        LeiFeng studentB = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentB.sweep();

        LeiFeng studentC = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentC.wash();

    }

}
