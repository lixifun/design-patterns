package fun.lixi.study.designpatterns.p12.p12d2;

public class Main {
    public static void main(String[] args) {

        Stock1 stock1 = new Stock1();
        Stock2 stock2 = new Stock2();
        Stock3 stock3 = new Stock3();
        NationalDebt1 nationalDebt1 = new NationalDebt1();
        Realty1 realty1 = new Realty1();

        stock1.buy();
        stock2.buy();
        stock3.buy();
        nationalDebt1.buy();
        realty1.buy();

        stock1.sell();
        stock2.sell();
        stock3.sell();
        nationalDebt1.sell();
        realty1.sell();

    }
}
