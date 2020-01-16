package fun.lixi.study.designpatterns.p9.p9d4;

public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
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
     * @param timeArea 时间范围
     * @param company  公司
     */
    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    /**
     * 展示
     */
    public void display() {
        System.out.printf("%s %s %s\n", name, sex, age);
        System.out.printf("工作经历: %s %s\n", timeArea, company);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
