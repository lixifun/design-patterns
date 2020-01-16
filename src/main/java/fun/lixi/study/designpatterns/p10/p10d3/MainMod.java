package fun.lixi.study.designpatterns.p10.p10d3;

public class MainMod {
    public static void main(String[] args) {

        System.out.println("学生甲抄的试卷: ");
        TestPaperMod studentA = new TestPaperAMod();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("学生乙抄的试卷: ");
        TestPaperMod studentB = new TestPaperBMod();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();

    }
}
