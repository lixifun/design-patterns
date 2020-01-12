package fun.lixi.study.designpatterns.p6d2;

public class Main {
    public static void main(String[] args) {

        Person lx = new Person("lx");

        System.out.println("第一种装扮: ");

        lx.wearTShirts();
        lx.wearBigTrouser();
        lx.wearSneakers();
        lx.show();

        System.out.println("第二种装扮: ");

        lx.wearSuit();
        lx.wearTie();
        lx.wearLeatherShoes();
        lx.show();
    }
}
