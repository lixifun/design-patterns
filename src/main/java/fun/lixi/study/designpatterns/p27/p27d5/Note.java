package fun.lixi.study.designpatterns.p27.p27d5;

/**
 * 音符
 */
public class Note extends Expression {
    @Override
    public void execute(String key, double value) {
        String note = "";
        switch (key) {
            case "C":
                note = "1";
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
        }

        System.out.print(note + " ");
    }
}
