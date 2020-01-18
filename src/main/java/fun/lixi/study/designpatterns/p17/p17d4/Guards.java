package fun.lixi.study.designpatterns.p17.p17d4;

/**
 * 后卫
 */
public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(String.format("后卫 %s 进攻", name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("后卫 %s 防守", name));
    }
}
