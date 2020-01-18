package fun.lixi.study.designpatterns.p17.p17d4;

/**
 * 外籍中锋
 */
public class ForeignCenter {

    private String name;

    public void 进攻() {
        System.out.println(String.format("外籍中锋 %s 进攻", name));
    }

    public void 防守() {
        System.out.println(String.format("外籍中锋 %s 防守", name));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
