package fun.lixi.study.designpatterns.p19.p19d3;

public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {

        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(String.format("%s 员工招聘培训管理", name));
    }
}
