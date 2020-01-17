package fun.lixi.study.designpatterns.p15.p15d4;

import fun.lixi.study.designpatterns.p15.p15d3.IUser;

public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
