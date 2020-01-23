package fun.lixi.study.designpatterns.p28.p28d4;

public class Success extends Action {

    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s 时，背后多半有一个伟大的女人", man.getClass().getName(), this.getClass().getName()));
    }

    @Override
    public void getWomanConslusion(Woman woman) {
        System.out.println(String.format("%s %s 时，背后大多有一个不成功的男人", woman.getClass().getName(), this.getClass().getName()));
    }
}
