package fun.lixi.study.designpatterns.p12.p12d3;

import fun.lixi.study.designpatterns.p12.p12d2.*;

public class Fund {

    Stock1 stock1;
    Stock2 stock2;
    Stock3 stock3;

    NationalDebt1 nationalDebt1;
    Realty1 realty1;

    public Fund() {
        this.stock1 = new Stock1();
        this.stock2 = new Stock2();
        this.stock3 = new Stock3();

        this.nationalDebt1 = new NationalDebt1();
        this.realty1 = new Realty1();
    }

    public void buyFund() {
        stock1.buy();
        stock2.buy();
        stock3.buy();

        nationalDebt1.buy();
        realty1.buy();
    }

    public void sellFund() {
        stock1.sell();
        stock2.sell();
        stock3.sell();

        nationalDebt1.sell();
        realty1.sell();
    }
}
