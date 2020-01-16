package fun.lixi.study.designpatterns.p10.p10d4;

public abstract class AbstractClass {

    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("");
    }
}
