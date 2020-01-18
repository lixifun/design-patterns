package fun.lixi.study.designpatterns.p16.p16d2;

public class WorkStatus {

    /**
     * 钟点
     */
    static int Hour = 0;

    /**
     * 任务完成标记
     */
    static boolean WorkFinished = false;

    public static void writeProgram() {
        if(Hour < 12) {
            System.out.println(String.format("当前时间: %s 点 上午工作，精神百倍", Hour));
        } else if(Hour < 13) {
            System.out.println(String.format("当前时间: %s 点 饿了，午饭；犯困，午休", Hour));
        } else if(Hour < 17) {
            System.out.println(String.format("当前时间: %s 点 下午状态还不错，继续努力", Hour));
        } else {
            if(WorkFinished) {
                System.out.println(String.format("当前时间: %s 点 下班回家了", Hour));
            } else {
                if(Hour < 21) {
                    System.out.println(String.format("当前时间: %s 点 加班哦，疲累至极", Hour));
                } else {
                    System.out.println(String.format("当前时间: %s 点 不行了，睡着了", Hour));
                }
            }
        }
    }

    public static void main(String[] args) {
        Hour = 9;
        writeProgram();

        Hour = 10;
        writeProgram();

        Hour = 12;
        writeProgram();

        Hour = 13;
        writeProgram();

        Hour = 14;
        writeProgram();

        Hour = 17;

        WorkFinished = true;
//        WorkFinished = false;

        writeProgram();
        Hour = 19;
        writeProgram();
        Hour = 22;
        writeProgram();


    }

}
