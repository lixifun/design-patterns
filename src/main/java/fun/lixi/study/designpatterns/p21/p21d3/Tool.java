package fun.lixi.study.designpatterns.p21.p21d3;

public class Tool {

    private static Tool tool = null;

    private Tool() {
    }

    public static Tool getInstance() {
        if (tool == null) {
            tool = new Tool();
        }
        return tool;
    }
}
