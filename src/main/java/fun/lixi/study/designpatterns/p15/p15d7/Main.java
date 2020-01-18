package fun.lixi.study.designpatterns.p15.p15d7;

import fun.lixi.study.designpatterns.p15.p15d2.User;
import fun.lixi.study.designpatterns.p15.p15d3.Department;
import fun.lixi.study.designpatterns.p15.p15d3.IUser;
import fun.lixi.study.designpatterns.p15.p15d4.IDepartment;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Department dept = new Department();

        IUser iuser = DataAccess.createUser();

        iuser.insert(user);
        iuser.getUser(1);

        IDepartment iDepartment = DataAccess.createDepartment();
        iDepartment.insert(dept);
        iDepartment.getDepartment(1);
    }
}
