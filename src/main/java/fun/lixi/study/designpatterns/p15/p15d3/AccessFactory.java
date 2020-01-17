package fun.lixi.study.designpatterns.p15.p15d3;

public class AccessFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
