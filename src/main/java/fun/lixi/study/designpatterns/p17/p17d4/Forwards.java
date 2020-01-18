package fun.lixi.study.designpatterns.p17.p17d4;

/**
 * 前锋
 */
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(String.format("前锋 %s 进攻", name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("前锋 %s 防守", name));
    }
}
