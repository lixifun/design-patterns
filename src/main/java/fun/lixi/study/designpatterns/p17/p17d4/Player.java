package fun.lixi.study.designpatterns.p17.p17d4;

/**
 * 球员
 */
public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();
}
