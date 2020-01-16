package fun.lixi.study.designpatterns.p7.p7d3;

import fun.lixi.study.designpatterns.p7.p7d2.SchoolGirl;

public class Proxy {

    SchoolGirl mm;

    public Proxy(SchoolGirl mm) {
        this.mm = mm;
    }

    public void giveDolls() {
        System.out.println(mm.getName() + " 送你洋娃娃");
    }

    public void giveFlowers() {
        System.out.println(mm.getName() + " 送你鲜花");
    }

    public void giveChocolate() {
        System.out.println(mm.getName() + " 送你巧克力");
    }

}
