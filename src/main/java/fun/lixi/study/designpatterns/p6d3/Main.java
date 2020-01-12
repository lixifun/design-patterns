package fun.lixi.study.designpatterns.p6d3;

/**
 * 把需要的功能按正确的顺序串联起来进行控制
 */
public class Main {
    public static void main(String[] args) {

        Person lx = new Person("lx");

        System.out.println("第一种装扮: ");

        Finery tShirts = new TShirts();
        Finery bigTrouser = new BigTrouser();
        Finery sneakers = new Sneakers();

        tShirts.show();
        bigTrouser.show();
        sneakers.show();
        lx.show();

        System.out.println("第一种装扮: ");

        Finery suit = new Suit();
        Finery tie = new Tie();
        Finery leatherShoes = new LeatherShoes();

        suit.show();
        tie.show();
        leatherShoes.show();
        lx.show();

    }
}
