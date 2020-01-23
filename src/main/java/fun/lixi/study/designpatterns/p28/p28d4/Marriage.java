package fun.lixi.study.designpatterns.p28.p28d4;

public class Marriage extends Action {

    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s 时，感概道: 恋爱游戏终结时，'有妻徒刑' 遥无期", man.getClass().getName(), this.getClass().getName()));
    }

    @Override
    public void getWomanConslusion(Woman woman) {
        System.out.println(String.format("%s %s 时，欣慰曰: 爱情长跑路漫漫，婚姻保险保平安", woman.getClass().getName(), this.getClass().getName()));
    }
}
