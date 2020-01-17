package fun.lixi.study.designpatterns.p15.p15d4;

import fun.lixi.study.designpatterns.p15.p15d3.IUser;
import fun.lixi.study.designpatterns.p15.p15d3.SqlserverUser;

public class SqlserverFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}
