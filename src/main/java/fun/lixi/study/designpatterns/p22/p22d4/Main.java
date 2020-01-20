package fun.lixi.study.designpatterns.p22.p22d4;

public class Main {
    public static void main(String[] args) {

        HandsetBrand n = new HandsetBrandN();

        n.setHandsetSoft(new HandsetGame());
        n.run();

        n.setHandsetSoft(new HandsetdAddressList());
        n.run();

        HandsetBrand m = new HandsetBrandM();

        m.setHandsetSoft(new HandsetGame());
        m.run();

        m.setHandsetSoft(new HandsetdAddressList());
        m.run();
    }
}
