package fun.lixi.study.designpatterns.p14d4;


public class NBAObserver extends Observer {

    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s %s 关闭 NBA 直播，继续工作!", sub.getSubjectState(), name));
    }
}
