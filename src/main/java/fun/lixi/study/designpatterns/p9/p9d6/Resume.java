package fun.lixi.study.designpatterns.p9.p9d6;

public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;

    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        this.work = new WorkExperience();
    }

    private Resume(WorkExperience work) {
        try {
            this.work = (WorkExperience) work.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 设置个人信息
     *
     * @param sex 性别
     * @param age 年龄
     */
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作经历
     *
     * @param workDate 时间范围
     * @param company  公司
     */
    public void setWorkExperience(String workDate, String company) {
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    /**
     * 展示
     */
    public void display() {
        System.out.printf("%s %s %s\n", name, sex, age);
        System.out.printf("工作经历: %s %s\n", work.getWorkDate(), work.getCompany());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
