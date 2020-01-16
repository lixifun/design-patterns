package fun.lixi.study.designpatterns.p9.p9d3;

/**
 * 原型模式：从一个对象再创建另外一个可定制的对象，而且不需要知道任何创建的细节
 */
public abstract class ProtoType {

    private String id;

    public ProtoType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
