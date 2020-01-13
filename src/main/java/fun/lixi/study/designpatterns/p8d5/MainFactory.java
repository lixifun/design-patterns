package fun.lixi.study.designpatterns.p8d5;

/**
 * 工厂方式克服了简单工厂模式违背开放-封闭原则的缺点，又保持了封装对象创建过程的优点
 */
public class MainFactory {
    public static void main(String[] args) {

        // 要换成 “社区志愿者” 修改这里就可以了
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.buyRice();
        student.sweep();
        student.wash();
    }
}
