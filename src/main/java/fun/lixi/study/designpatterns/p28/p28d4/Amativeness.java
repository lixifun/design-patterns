package fun.lixi.study.designpatterns.p28.p28d4;


public class Amativeness extends Action {

    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s 时，凡事不懂也要装逼", man.getClass().getName(), this.getClass().getName()));
    }

    @Override
    public void getWomanConslusion(Woman woman) {
        System.out.println(String.format("%s %s 时，遇事懂也装作不懂", woman.getClass().getName(), this.getClass().getName()));
    }
}
