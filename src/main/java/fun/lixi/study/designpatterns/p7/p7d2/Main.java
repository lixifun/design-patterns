package fun.lixi.study.designpatterns.p7.p7d2;

public class Main {
    public static void main(String[] args) {

        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        // 娇娇并不认识加桌椅，此处有问题
        Pursuit zhuojiayi = new Pursuit(jiaojiao);

        zhuojiayi.giveDolls();
        zhuojiayi.giveFlowers();
        zhuojiayi.giveChocolate();
    }
}
