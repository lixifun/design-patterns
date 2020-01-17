package fun.lixi.study.designpatterns.p15.p15d4;

import fun.lixi.study.designpatterns.p15.p15d3.Department;

public class AccessDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("在 Access 中给 Department 表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在 Access 中根据 ID 得到 Department 表一条记录");
        return null;
    }
}
