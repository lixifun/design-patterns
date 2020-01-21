package fun.lixi.study.designpatterns.p26.p26d1;

public class Website {

    private String name = "";

    public Website(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("网站分类: " + name);
    }
}
