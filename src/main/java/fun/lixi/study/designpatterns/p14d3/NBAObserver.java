package fun.lixi.study.designpatterns.p14d3;

public class NBAObserver extends Observer {

    public NBAObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s %S 关闭 NBA 直播，继续工作!", sub.getAction(), name));
    }
}
