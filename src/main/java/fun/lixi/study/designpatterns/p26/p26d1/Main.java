package fun.lixi.study.designpatterns.p26.p26d1;

public class Main {
    public static void main(String[] args) {

        Website fx = new Website("产品展示");
        fx.use();

        Website fy = new Website("产品展示");
        fy.use();

        Website fz = new Website("产品展示");
        fz.use();

        Website fl = new Website("博客");
        fl.use();

        Website fm = new Website("博客");
        fm.use();

        Website fn = new Website("博客");
        fn.use();
    }

}
