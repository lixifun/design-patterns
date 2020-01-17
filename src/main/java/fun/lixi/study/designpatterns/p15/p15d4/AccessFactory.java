package fun.lixi.study.designpatterns.p15.p15d4;

import fun.lixi.study.designpatterns.p15.p15d3.AccessUser;
import fun.lixi.study.designpatterns.p15.p15d3.IUser;

public class AccessFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
