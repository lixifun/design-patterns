package fun.lixi.study.designpatterns.p17.p17d4;

/**
 * 翻译者
 */
public class Translator extends Player {

    private ForeignCenter wjzf = new ForeignCenter();

    public Translator(String name) {
        super(name);
        this.wjzf.setName(name);
    }

    @Override
    public void attack() {
        wjzf.进攻();
    }

    @Override
    public void defense() {
        wjzf.防守();
    }
}
