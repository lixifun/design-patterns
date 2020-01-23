package fun.lixi.study.designpatterns.p28.p28d3;

public class Woman extends Person {

    @Override
    public void getConclusion() {
        if ("成功".equals(action)) {
            System.out.println(String.format("%s %s 时，背后大多有一个不成功的男人", this.getClass().getName(), getAction()));
        } else if ("失败".equals(action)) {
            System.out.println(String.format("%s %s 时，眼泪汪汪，谁也劝不了", this.getClass().getName(), getAction()));
        } else if ("恋爱".equals(action)) {
            System.out.println(String.format("%s %s 时，遇事懂也装作不懂", this.getClass().getName(), getAction()));
        }
    }
}
