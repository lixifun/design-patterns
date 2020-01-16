package fun.lixi.study.designpatterns.p7.p7d4;

import fun.lixi.study.designpatterns.p7.p7d2.SchoolGirl;

public class Main {
    public static void main(String[] args) {

        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy proxy = new Proxy(jiaojiao);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();

    }
}
