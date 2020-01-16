package fun.lixi.study.designpatterns.p9.p9d2;

public class MainRef {
    public static void main(String[] args) {

        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "xx 公司");

        // 指向同一对象
        Resume b = a;
        Resume c = a;

        a.display();
        b.display();
        c.display();
    }
}
