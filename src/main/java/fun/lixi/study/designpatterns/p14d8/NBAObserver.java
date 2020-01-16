package fun.lixi.study.designpatterns.p14d8;

public class NBAObserver {

    private String name;
    private Subject sub;

    public NBAObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public void closeNBADirectSeeding() {
        System.out.println(String.format("%s %s 关闭 NBA 直播，继续工作！", sub.getSubjectState(), name));
    }
}
