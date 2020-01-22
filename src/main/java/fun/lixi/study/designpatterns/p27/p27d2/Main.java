package fun.lixi.study.designpatterns.p27.p27d2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Context context = new Context();

        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        list.forEach(e -> e.intepret(context));
    }
}
