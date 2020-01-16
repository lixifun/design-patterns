package fun.lixi.study.designpatterns.p9.p9d6;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2006", "XX 企业");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("1996-2006", "YY 企业");

        Resume c = (Resume) a.clone();
        c.setPersonalInfo("男", "24");
        c.setWorkExperience("1998-2003", "ZZ 企业");

        a.display();
        b.display();
        c.display();

        /**
         * 深复制
         *
         * 大鸟 男 29
         * 工作经历: 1998-2006 XX 企业
         * 大鸟 男 29
         * 工作经历: 1996-2006 YY 企业
         * 大鸟 男 24
         * 工作经历: 1998-2003 ZZ 企业
         */
    }
}
