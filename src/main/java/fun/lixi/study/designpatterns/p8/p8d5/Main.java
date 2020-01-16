package fun.lixi.study.designpatterns.p8.p8d5;

public class Main {
    public static void main(String[] args) {

        LeiFeng xueleifeng = new Undergraduate();

        xueleifeng.buyRice();
        xueleifeng.sweep();
        xueleifeng.wash();

        LeiFeng student1 = new Undergraduate();
        student1.buyRice();

        LeiFeng student2 = new Undergraduate();
        student2.sweep();

        LeiFeng student3 = new Undergraduate();
        student3.wash();

    }
}
