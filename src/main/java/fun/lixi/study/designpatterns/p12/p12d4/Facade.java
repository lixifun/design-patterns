package fun.lixi.study.designpatterns.p12.p12d4;

public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        this.one = new SubSystemOne();
        this.two = new SubSystemTwo();
        this.three = new SubSystemThree();
        this.four = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("方法组 A() ---- ");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB() {
        System.out.println("方法组 B() ---- ");
        two.methodTwo();
        three.methodThree();
    }
}
