package fun.lixi.study.designpatterns.p16.p16d7;

/**
 * 上午状态
 */
public class ForenoonState extends State {

    @Override
    public void writeProgram(Work w) {
        double hour = w.getHour();
        if(hour < 12) {
            System.out.println(String.format("当前时间: %s 点 上午工作，精神百倍", hour));
        } else {
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
