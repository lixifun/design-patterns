package fun.lixi.study.designpatterns.p28.p28d3;

public class Man extends Person {

    @Override
    public void getConclusion() {
        if ("成功".equals(action)) {
            System.out.println(String.format("%s %s 时，背后多半有一个伟大的女人", this.getClass().getName(), getAction()));
        } else if ("失败".equals(action)) {
            System.out.println(String.format("%s %s 时，闷头喝酒，谁也不用劝", this.getClass().getName(), getAction()));
        } else if ("恋爱".equals(action)) {
            System.out.println(String.format("%s %s 时，凡事不懂也要装逼", this.getClass().getName(), getAction()));
        }
    }
}
