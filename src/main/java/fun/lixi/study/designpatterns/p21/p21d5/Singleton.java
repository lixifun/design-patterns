package fun.lixi.study.designpatterns.p21.p21d5;

/**
 * 多线程时的单例
 */
public class Singleton {

    private static Singleton instance;
    private static final Object LOCK = new Object();

    private Singleton() {
    }

    public static Singleton getInstance() {
        // 每次获取都要加锁，效率低
        synchronized (LOCK) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
