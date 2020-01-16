package fun.lixi.study.designpatterns.p1.p1d8;

public class Operation {

    public static double getResult(double numberA, double numberB, String operate) {

        double result = 0;

        switch (operate) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
        }

        return result;
    }
}
