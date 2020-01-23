package fun.lixi.study.designpatterns.p28.p28d4;

public abstract class Person {

    /**
     * 接受
     * @param visitor 用来获得状态对象的
     */
    public abstract void accept(Action visitor);
}
