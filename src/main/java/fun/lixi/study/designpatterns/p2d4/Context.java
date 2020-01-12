package fun.lixi.study.designpatterns.p2d4;

public class Context {

    Strategy strategy;

    /**
     * 初始化时传入具体的策略对象
     *
     * @param strategy 具体的策略对象
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 根据具体的策略对象，调用其算法的方法
     */
    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
