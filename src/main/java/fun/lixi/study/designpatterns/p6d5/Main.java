package fun.lixi.study.designpatterns.p6d5;

public class Main {

    public static void main(String[] args) {

        Person lx = new Person("lx");

        System.out.println("第一种装扮");

        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        // 装饰过程
        sneakers.decorate(lx);
        bigTrouser.decorate(sneakers);
        tShirts.decorate(bigTrouser);
        tShirts.show();

        System.out.println("第二种装扮");

        LeatherShoes leatherShoes = new LeatherShoes();
        Tie tie = new Tie();
        Suit suit = new Suit();

        // 装饰过程
        leatherShoes.decorate(lx);
        tie.decorate(leatherShoes);
        suit.decorate(tie);
        suit.show();
    }
}
