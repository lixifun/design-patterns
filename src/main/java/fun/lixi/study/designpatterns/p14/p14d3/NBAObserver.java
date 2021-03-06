package fun.lixi.study.designpatterns.p14.p14d3;

public class NBAObserver extends Observer {

    public NBAObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s %s 关闭 NBA 直播，继续工作!", sub.getAction(), name));
    }
}
