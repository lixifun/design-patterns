package fun.lixi.study.designpatterns.p15.p15d3;

import fun.lixi.study.designpatterns.p15.p15d2.User;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        IFactory factory = new SqlserverFactory();
        IUser iu = factory.createUser();

        iu.insert(user);
        iu.getUser(1);
    }
}
