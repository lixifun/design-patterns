package fun.lixi.study.designpatterns.p9d4;

/**
 * 一般在初始化的信息不发生变化的情况下，克隆时最好的方法。这既隐藏了对象创建的细节，又对性能是大大的提高
 * <p>
 * 不用重新初始化对象，而是动态地获取对象运行时的状态
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "xx 公司");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("1998-2006", "YY 企业");

        Resume c = (Resume) a.clone();
        c.setPersonalInfo("男", "24");

        a.display();
        b.display();
        c.display();
    }

}
