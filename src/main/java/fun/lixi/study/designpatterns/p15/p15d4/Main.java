package fun.lixi.study.designpatterns.p15.p15d4;

import fun.lixi.study.designpatterns.p15.p15d2.User;
import fun.lixi.study.designpatterns.p15.p15d3.Department;
import fun.lixi.study.designpatterns.p15.p15d3.IUser;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Department dept = new Department();

        // 只需确定实例化哪一个数据库访问对象给 factory
//        IFactory factory = new SqlserverFactory();
        IFactory factory = new AccessFactory();

        IUser iu = factory.createUser();

        iu.insert(user);
        iu.getUser(1);

        IDepartment id = factory.createDepartment();
        id.insert(dept);
        id.getDepartment(1);
    }
}
