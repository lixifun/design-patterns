package fun.lixi.study.designpatterns.p25.p25d3;

public class Main {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

        USA c1 = new USA(UNSC);
        Iraq c2 = new Iraq(UNSC);

        UNSC.setColleague1(c1);
        UNSC.setColleague2(c2);

        c1.declare("不准研制核武器，否则要发动战争!");
        c2.declare("我们没有核武器，也不怕侵略。");

    }
}
