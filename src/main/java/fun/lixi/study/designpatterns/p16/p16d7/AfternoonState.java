package fun.lixi.study.designpatterns.p16.p16d7;

/**
 * 下午工作状态
 */
public class AfternoonState extends State {

    @Override
    public void writeProgram(Work w) {
        double hour = w.getHour();
        if(hour < 17) {
            System.out.println(String.format("当前时间: %s 点 下午状态还不错，继续努力", hour));
        } else {
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
