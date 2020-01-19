package fun.lixi.study.designpatterns.p21.p21d6;

/**
 * 双重锁定，保证效率又安全
 */
public class Singleton {

    private static Singleton instance;
    private static final Object LOCK = new Object();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
