package fun.lixi.study.designpatterns.p17.p17d4;

/**
 * 中锋
 */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(String.format("中锋 %s 进攻", name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("中锋 %s 防守", name));
    }
}
