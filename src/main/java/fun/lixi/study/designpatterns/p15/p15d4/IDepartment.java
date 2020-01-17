package fun.lixi.study.designpatterns.p15.p15d4;

import fun.lixi.study.designpatterns.p15.p15d3.Department;

public interface IDepartment {

    void insert(Department department);

    Department getDepartment(int id);
}
