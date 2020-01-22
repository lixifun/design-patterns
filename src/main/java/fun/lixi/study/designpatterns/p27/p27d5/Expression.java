package fun.lixi.study.designpatterns.p27.p27d5;

public abstract class Expression {

    public void interpret(PlayContext context) {
        String text = context.getText();

        if (text.length() == 0) {
            return;
        } else {
            String playKey = text.substring(0, 1);
            context.setText(text.substring(2));
            double playValue = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));
            context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));

            execute(playKey, playValue);
        }
    }

    public abstract void execute(String key, double value);
}
