package fun.lixi.study.designpatterns.p6.p6d3;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}
