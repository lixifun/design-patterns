package fun.lixi.study.designpatterns.p16.p16d7;

public class SleepingState extends State {

    @Override
    public void writeProgram(Work w) {
        System.out.println(String.format("当前时间: %s 点 不行了，睡着了", w.getHour()));
    }
}
