package fun.lixi.study.designpatterns.p15.p15d3;

import fun.lixi.study.designpatterns.p15.p15d2.User;

public interface IUser {

    void insert(User user);

    User getUser(int id);
}
