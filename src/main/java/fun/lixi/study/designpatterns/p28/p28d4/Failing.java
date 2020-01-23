package fun.lixi.study.designpatterns.p28.p28d4;


public class Failing extends Action {

    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s 时，闷头喝酒，谁也不用劝", man.getClass().getName(), this.getClass().getName()));
    }

    @Override
    public void getWomanConslusion(Woman woman) {
        System.out.println(String.format("%s %s 时，眼泪汪汪，谁也劝不了", woman.getClass().getName(), this.getClass().getName()));
    }
}
