package fun.lixi.study.designpatterns.p27.p27d2;

public class NonterminalExpression extends AbstractExpression {

    @Override
    public void intepret(Context context) {
        System.out.println("非终端解释器");
    }
}
