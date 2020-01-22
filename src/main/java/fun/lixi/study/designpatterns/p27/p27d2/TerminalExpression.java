package fun.lixi.study.designpatterns.p27.p27d2;

public class TerminalExpression extends AbstractExpression {

    @Override
    public void intepret(Context context) {
        System.out.println("终端解释器");
    }
}
