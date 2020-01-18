package fun.lixi.study.designpatterns.p16.p16d7;

/**
 * 晚间工作状态
 */
public class EveningState extends State {

    @Override
    public void writeProgram(Work w) {
        double hour = w.getHour();

        if (w.isFinish()) {
            w.setState(new RestState());
            w.writeProgram();
        } else {

            if (w.getHour() < 21) {
                System.out.println(String.format("当前时间: %s 点 加班哦，疲累至极", hour));
            } else {
                w.setState(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
