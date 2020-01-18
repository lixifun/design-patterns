package fun.lixi.study.designpatterns.p16.p16d7;

/**
 * 中午工作状态
 */
public class NoonState extends State {

    @Override
    public void writeProgram(Work w) {
        double hour = w.getHour();
        if(hour < 13) {
            System.out.println(String.format("当前时间: %s 点 饿了，午饭；犯困，午休", hour));
        } else {
            w.setState(new AfternoonState());
            w.writeProgram();
        }
    }
}
