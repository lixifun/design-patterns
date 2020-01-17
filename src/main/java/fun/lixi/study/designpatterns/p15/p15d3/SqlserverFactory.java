package fun.lixi.study.designpatterns.p15.p15d3;

public class SqlserverFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }
}
