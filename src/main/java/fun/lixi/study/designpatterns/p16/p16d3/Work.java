package fun.lixi.study.designpatterns.p16.p16d3;

public class Work {

    private int hour;
    private boolean finish = false;

    public void writeProgram() {
        if (hour < 12) {
            System.out.println(String.format("当前时间: %s 点 上午工作，精神百倍", hour));
        } else if (hour < 13) {
            System.out.println(String.format("当前时间: %s 点 饿了，午饭；犯困，午休", hour));
        } else if (hour < 17) {
            System.out.println(String.format("当前时间: %s 点 下午状态还不错，继续努力", hour));
        } else {
            if (finish) {
                System.out.println(String.format("当前时间: %s 点 下班回家了", hour));
            } else {
                if (hour < 21) {
                    System.out.println(String.format("当前时间: %s 点 加班哦，疲累至极", hour));
                } else {
                    System.out.println(String.format("当前时间: %s 点 不行了，睡着了", hour));
                }
            }
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public static void main(String[] args) {

        Work emergencyProjects = new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(10);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(12);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(13);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(14);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(17);

        emergencyProjects.setFinish(true);
//        emergencyProjects.setFinish(false);

        emergencyProjects.writeProgram();

        emergencyProjects.setHour(19);
        emergencyProjects.writeProgram();

        emergencyProjects.setHour(22);
        emergencyProjects.writeProgram();
    }

}
