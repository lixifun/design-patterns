package fun.lixi.study.designpatterns.p21.p21d7;

public final class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
